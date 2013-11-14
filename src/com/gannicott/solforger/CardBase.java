package com.gannicott.solforger;

import java.util.ArrayList;
import java.util.List;


public class CardBase {
	
	CardBase()
	{
		
	}
	
	public List<Card> getAll(String limit)
	{

		final String ID_DESC = "id DESC";		
		//Class<T> type, String whereClause, String[] whereArgs, String groupBy, String orderBy, String limit
		return Card.find(Card.class, null, null, null, ID_DESC, limit);	
	}

	String s;
	
	public List<Card> getFromFaction(String faction)
	{
		List<Card> fromFaction = new ArrayList<Card>();
		fromFaction = Card.find(Card.class, "faction = ?", faction);		
		return fromFaction;
	}
}
