package com.njh.app.nbacontracts.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
//@Table(name = "team")
public class Team {

	@Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String teamName;
    private String accronym;
    private String link;
    private float champOdds;
    private String conference;
    private String division;

    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private List<PlayerContract> playerContracts = new ArrayList<>();
    
	public Team(String teamName, String accronym, String link) {
		this.teamName = teamName;
		this.accronym = accronym;
		this.link = link;
	}
	
	public Team(String teamName, String accronym, String link, List<PlayerContract> playerContracts) {
		this.teamName = teamName;
		this.accronym = accronym;
		this.link = link;
		this.playerContracts = playerContracts;
	}

	public Team(@NonNull String teamName, String accronym, String conference, String link, float champOdds,
			List<PlayerContract> playerContracts) {
		super();
		this.teamName = teamName;
		this.accronym = accronym;
		this.conference = conference;
		this.link = link;
		this.champOdds = champOdds;
		this.playerContracts = playerContracts;
	}
}
