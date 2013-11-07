package com.gannicott.solforger;

import java.util.List;

/*
 * Author: Brandon Gannicott
 * Date: 11/7/13
 * Class: The Card class. It holds a collection of Levels, and can return basic info.
 */

public class Card {
	
	private String faction;
	private String rarity;
	private int id;	
	private List<Level> levels;
	
	Card(String faction, String rarity, int id)
	{
		this.faction = faction;
		this.rarity = rarity;
		this.id = id;		
	}
	// What does the card need to do?
	//Return values
	public String faction() {return faction;}	
	public String rarity() 	{return rarity;}	
	public int id() 		{return id;}
	
	

}
