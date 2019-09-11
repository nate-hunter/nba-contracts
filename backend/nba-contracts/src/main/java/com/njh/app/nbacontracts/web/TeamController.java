package com.njh.app.nbacontracts.web;

import java.util.Collection;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.njh.app.nbacontracts.model.Team;
import com.njh.app.nbacontracts.model.TeamRepository;

@RestController
@RequestMapping("/api/v1")
public class TeamController {
	
//	private final Logger log = LoggerFactory.getLogger(TeamController.class);

	private TeamRepository teamRepository;
	
	public TeamController(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}
	
	@GetMapping("/teams")
	@CrossOrigin(origins = "http://localhost:3000")
	Collection<Team> teams() {
		return teamRepository.findAll();
	}
	
	@GetMapping("/team/{id}")
	ResponseEntity<?> getTeam(@PathVariable Long id) {
		Optional<Team> team = teamRepository.findById(id);
		return team.map(response -> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
}
