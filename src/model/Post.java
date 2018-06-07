/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

public class Post {
	private String name;
	private String text;
	private Photo picture;
	private ArrayList<Comment> comments;
	private ArrayList<String>  userLikes;
	private int likes;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public ArrayList<Comment> getComments() {
		return comments;
	}
	public void addComment(Comment comment) {
		this.comments.add(comment);
	}
	public int getLikes() {
		return likes;
	}
	public void like(User user) {
		String  userName = user.getName();
		
		if(this.userLikes.contains(userName)){
			this.likes--;
			this.userLikes.remove(userName);
		} else {
			this.likes++;
			this.userLikes.add(userName);
		}
	}
}
