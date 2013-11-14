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

	private long levelOne;
	private long levelTwo;
	private long levelThree;
	
	
	public Card(Context ctx)
	{
		super(ctx);
	}
	
	public Card(Context ctx, String faction, String rarity, long level1, long level2, long level3)
	{
		super(ctx);
		this.faction = faction;
		this.rarity = rarity;	
		
		this.levelOne = level1;
		this.levelTwo = level2;
		this.levelThree = level3;
	}
	// What does the card need to do?
	//Return values
	public String faction() {return faction;}	
	public String rarity() 	{return rarity;}		
	
	@Override
	public String toString()
	{
		return "id: "+id+" | title: "+ "Title"+
				"\n faction: "+faction+
				"\n rarity: "+rarity;
	}

}
