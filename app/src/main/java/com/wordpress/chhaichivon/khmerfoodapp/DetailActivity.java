package com.wordpress.chhaichivon.khmerfoodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

	private Food  food;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		food = new Food();
		food  = (Food) getIntent().getSerializableExtra("food");
		String title = food.getTitle();
		String description = food.getDescription();

		TextView  tvTitle = (TextView) findViewById(R.id.tv_title);
		TextView tvDescription = (TextView) findViewById(R.id.tv_description);

		tvTitle.setText(title);
		tvDescription.setText(description);
	}
}
