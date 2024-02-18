/*
If we do not define setter method in the class, fields can be made read-only

A constructor will be declared for initializing the parameters because we will not declare 
the setter method in the class. So, we will use constructor to initialize the value of variables.
 */
package com.task4.readOnly;

public class Player {
	
	private String player_name;
	private String sport_name;
	
	Player(String player_name, String sport_name ){
		this.player_name=player_name;
		this.sport_name=sport_name;
	}
	public String getNmae() {
		return player_name;
	}
	public String getSportNamee() {
		return sport_name;
	}
	
}
