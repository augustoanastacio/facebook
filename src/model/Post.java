/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

public class Post extends DataModel {
	private Photo picture;
	private ArrayList<Comment> comments;
	private ArrayList<String>  userLikes;

	public ArrayList<Comment> getComments() {
		return comments;
	}
	public void addComment(Comment comment) {
		this.comments.add(comment);
	}
}
