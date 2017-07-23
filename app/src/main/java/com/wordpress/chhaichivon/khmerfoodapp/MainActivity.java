package com.wordpress.chhaichivon.khmerfoodapp;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

	private List<Food> foods;
	private RecyclerView.LayoutManager layoutManager;
	private FoodAdapter  foodAdapter;
	private RecyclerView recyclerView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		recyclerView = (RecyclerView) findViewById(R.id.rv_list_food);
		layoutManager  = new LinearLayoutManager(getApplicationContext());
		recyclerView.setLayoutManager(layoutManager);
		Food food;
		foods = new ArrayList<>();
		food  = new Food("Name1","good1");
		foods.add(food);
		food = new Food("Name2","good2");
		foods.add(food);
		food  = new Food("Name3","good3");
		foods.add(food);
		food = new Food("Name4","good4");
		foods.add(food);

		foodAdapter = new FoodAdapter(getApplicationContext(),foods);
		foodAdapter.setFoodClickListener(new FoodClickListener() {
			@Override
			public void onItemClick(Food food) {
				//getDetail(food);
			}
		});
		recyclerView.setAdapter(foodAdapter);
	}


	@Override
	protected void onRestart() {
		super.onRestart();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	@Override
	public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
		super.onSaveInstanceState(outState, outPersistentState);
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
	}

	public void getDetail(Food food){
		Intent intent = new Intent(getApplicationContext(),DetailFoodFragment.class);
		intent.putExtra("food", String.valueOf(food));
		startActivity(intent);
	}
}
