package com.wordpress.chhaichivon.khmerfoodapp;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 7/23/17
 * TIME     : 10:26 PM
 */

public class Food {

	private String title;
	private String description;


	public Food(){}

	public Food(String title , String description){
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
