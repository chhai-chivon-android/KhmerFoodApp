package com.wordpress.chhaichivon.khmerfoodapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 7/23/17
 * TIME     : 10:32 PM
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
	public Context context;
	public List<Food> foods = new ArrayList<>();
	public FoodClickListener foodClickListener;

	public void setFoodClickListener(FoodClickListener foodClickListener){
		this.foodClickListener = foodClickListener;
	}

	public FoodAdapter(Context context, List<Food> foods){
		this.context = context;
		this.foods = foods;
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		Context context = parent.getContext();
		LayoutInflater  layoutInflater = LayoutInflater.from(context);
		//Inflate the custom layout
		View  view  = layoutInflater.inflate(R.layout.food_item_layout, parent, false);
		//Return a new holder instance
		ViewHolder  viewHolder  = new ViewHolder(view);
		return viewHolder;
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {
		Food food  = foods.get(position);
		holder.tvTitle.setText(food.getTitle());
		holder.tvDescription.setText(food.getDescription());
	}

	@Override
	public int getItemCount() {
		return foods.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		TextView  tvTitle, tvDescription;

		public ViewHolder(View itemView) {
			super(itemView);

			tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
			tvDescription = (TextView) itemView.findViewById(R.id.tv_description);


			itemView.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					int position = getAdapterPosition();
					Log.d("Item", position +"");
					Food  food = foods.get(position);
					foodClickListener.onItemClick(food);
				}
			});
		}
	}
}
