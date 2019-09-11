package com.njh.app.nbacontracts.data;


import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class TeamData {
	
	private String URL = "https://www.basketball-reference.com";
	
	public Elements getTeamData() throws IOException {
		
        Document document = Jsoup.connect(this.URL).get();

        Elements dataGrid = document.getElementsByClass("data_grid section_wrapper");

        Elements teamData = dataGrid.select("[data-stat='team_name']").select("a[href]");
        
//        teamData.forEach(e -> {
//            System.out.println(e.attr("title"));
//            System.out.println("    " + e.text());
//            System.out.println("    LINK: " + e.attr("href"));
//        });
        
        
//        for ( Element e : teamData ){
//        	System.out.println(e.attr("title"));
//        	System.out.println("    " + e.text());
//        	System.out.println("    LINK: " + e.attr("href"));
//        }
        
        return teamData;
	}

}
