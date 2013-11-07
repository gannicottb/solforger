package com.gannicott.solforger;


/*
 * Author: Brandon Gannicott
 * Date: 11/7/13
 * Class: The Level class that contains all the information that can change between levels for a Card.
 */

public class Level {
	
	//What does a Level know?
	private String title;
	private String cardType;
	private String creatureType;
	private String text;
	private int attack;
	private int health;
	private int artId;
	
	public Level(String title, String cardType, String creatureType, String text, int attack, int health, int artId)
	{
		this.title = title;
		this.cardType = cardType;
		if(cardType.equalsIgnoreCase("Creature"))
			this.creatureType = creatureType;
		else
			this.creatureType = null;
		this.text = text;
		this.attack = attack;
		this.health = health;
		this.artId = artId;
	}
	//What does a Level need to do?
	
	//Return values
	public String title() 			{return title;}
	public String cardType() 		{return cardType;}
	public String creatureType() 	{return creatureType;}
	public String text()			{return text;}
	public int attack() 			{return attack;}
	public int health() 			{return health;}
	public int artId()				{return artId;}

}
