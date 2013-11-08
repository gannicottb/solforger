package com.gannicott.solforger;

import java.util.List;

import android.content.Context;

import com.orm.SugarRecord;

/*
 * Author: Brandon Gannicott
 * Date: 11/7/13
 * Class: The Card class. It holds a collection of Levels, and can return basic info.
 */

public class Card extends SugarRecord<Card> {
	
	private String faction;
	private String rarity;
	private int id;	
	private String title;
	private Level level1;
	private Level level2;
	private Level level3;
	
	
	public Card(Context ctx)
	{
		super(ctx);
	}
	
	public Card(Context ctx, String faction, String rarity, int id, String title)
	{
		super(ctx);
		this.faction = faction;
		this.rarity = rarity;
		this.id = id;	
		this.title = title;
	}
	// What does the card need to do?
	//Return values
	public String faction() {return faction;}	
	public String rarity() 	{return rarity;}	
	public int id() 		{return id;}
	
	@Override
	public String toString()
	{
		return "id: "+id+" | title: "+title+
				"\n faction: "+faction+
				"\n rarity: "+rarity;
	}

}
