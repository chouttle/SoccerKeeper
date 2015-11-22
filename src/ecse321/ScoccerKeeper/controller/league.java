package ecse321.ScoccerKeeper.controller;

import java.util.ArrayList;

/**
 * 
 * @author Omar
 * 
 * This class is a component class that stores the data of the league
 * it has the list of the team playing in the league
 *
 */

public class League {
	private  String leagueName;
	private ArrayList<Team> teams=new ArrayList<>();
	
	
	/**
	 * 
	 * @param leaguename
	 * Create a new league is only allowed to the manager mode
	 */
	public League (String leaguename) {
		this.leagueName=leaguename;
	}
	/**
	 * 
	 * @return league name
	 */
	public String getLeagueName () {
		return leagueName;
	}
	/**
	 * 
	 * @param team
	 * adding teams to the league teams list
	 */
	public void addTeams(Team team) {
		teams.add(team);
	}
	/**
	 * 
	 * @return list of teams
	 */
	public ArrayList<Team> getTeams () {
		return teams;
	}

}
