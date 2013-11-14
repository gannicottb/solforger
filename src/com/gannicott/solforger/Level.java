package com.gannicott.solforger;

import android.content.Context;
import com.orm.SugarRecord;

/*
 * Author: Brandon Gannicott
 * Date: 11/7/13
 * Class: The Level class that contains all the information that can change between levels for a Card.
 */

public class Level extends SugarRecord<Level> {
	
	//What does a Level know?
	private int id;
	private String title;
	private String cardType;
	private String creatureType;
	private String text;
	private int attack;
	private int health;
	private int artId;
	
	public Level(Context ctx)
	{
		super(ctx);
	}
	
	public Level(Context ctx, String title, String cardType, String creatureType, String text, int attack, int health, int artId)
	{
		super(ctx);
		
		this.title = title;
		this.cardType = cardType;
		//If the card is a creature, then it has a type, attack, and health
		if(cardType.equalsIgnoreCase("Creature"))
		{
			this.creatureType = creatureType;
			this.attack = attack;
			this.health = health;
		}
		//if the card is a spell, then it does not have a creature type, attack, or health
		else
		{
			this.creatureType = null;
			this.attack = 0;
			this.health = 0;
		}
		this.text = text;		
		this.artId = artId;
	}
	
	//Return values
	public String title() 			{return title;}
	public String cardType() 		{return cardType;}
	public String creatureType() 	{return creatureType;}
	public String text()			{return text;}
	public int attack() 			{return attack;}
	public int health() 			{return health;}
	public int artId()				{return artId;}
	
	@Override
	public String toString()
	{
		return  " title: "+title+
				"\n cardType: "+cardType+
				"\n creatureType: "+creatureType+
				"\n text: " +text+
				"\n attack: "+attack+" health: "+health+
				"\n artId: "+artId;
	}
}
