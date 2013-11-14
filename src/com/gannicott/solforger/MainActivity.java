package com.gannicott.solforger;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final ListView listview = (ListView) findViewById(R.id.cardBaseList);
		
		createTestCard();
		
		CardBase cb = new CardBase();
		
		List<Card> test = cb.getAll(null);
		
		final ArrayAdapter<Card> adapter = new ArrayAdapter<Card>(this, 
				android.R.layout.simple_list_item_1, test);
		
		listview.setAdapter(adapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	private void createTestCard(){
		Context ctx = this.getBaseContext();
		Level one = new Level(
				ctx, "Scrapforge Titan", 
				"Creature", "Robot",
				"Owns all the d00dz", 1, 1, 500);
		one.save();
		Level two = new Level(
				ctx, "Scrapforge Titan", 
				"Creature", "Robot",
				"Owns all the d00dz", 5, 5, 501);
		two.save();
		Level three = new Level(
				ctx, "Scrapforge Titan", 
				"Creature", "Robot",
				"Owns all the d00dz", 20, 20, 502);
		three.save();
	
		String faction = Constants.ALLOYIN;
		String rarity = "Rare";
		
		Card card = new Card(ctx, faction, rarity, 
				one.getId(), two.getId(), three.getId());
		
		card.save();				
	}
}

