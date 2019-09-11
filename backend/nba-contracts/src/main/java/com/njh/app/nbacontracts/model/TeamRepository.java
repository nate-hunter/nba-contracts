package com.njh.app.nbacontracts.model;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
	Team findByTeamName(String teamName);

}	
