package com.njh.app.nbacontracts.model;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PlayerContract {
	
	public static int playerCount;
	
	@Id
    @GeneratedValue
    private Long id;
	private String name;
	private int age;
	private String link;
	private String teamAccr;
	private HashMap<String, String> contractStr;
	private String guaranteedStr;
	private HashMap<String, String> contract;
	private String guaranteed;
	
	public PlayerContract(String name, String link, String teamAccr, HashMap<String, String> contract, String guaranteedStr) {	
		this.name = name;
		this.link = link;
		this.teamAccr = teamAccr;
		this.contractStr = contract;
		this.guaranteedStr = guaranteedStr;
		playerCount++;
	}
	
	public PlayerContract(String name, String link, String teamAccr, HashMap<String, String> contractStr, String guaranteedStr, HashMap<String, String> contract, String guaranteed) {	
		this.name = name;
		this.link = link;
		this.teamAccr = teamAccr;
		this.contractStr = contractStr;
		this.guaranteedStr = guaranteedStr;
		this.contract = contract;
		this.guaranteed = guaranteed;
		playerCount++;
	}
}