package com.wordpress.chhaichivon.khmerfoodapp;

import java.io.Serializable;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 7/23/17
 * TIME     : 10:26 PM
 */

public class Food implements Serializable{

	private String title;
	private String image;
	private String description;


	public Food(){}

	public Food(String title ,String image, String description){
		this.title = title;
		this.image = image;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
