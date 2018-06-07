package model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class User implements Serializable {
	private String firstName;
	private String lastName;
	private String email;
	private Date dob;
	private Feed feed;
	private ArrayList<User> friends;
	private ArrayList<User> friendRequests;	
	
	public User(String firstName, String lastName, String email, Date dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dob = dob;
		
		this.feed = new Feed();
		this.friends = new ArrayList<User>();
		this.friendRequests = new ArrayList<User>();
	}
	
	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getName() {
		return getFirstName() + ' ' + getLastName();
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public ArrayList<User> getFriends() {
		return friends;
	}
	
	public void addFriend(User newFriend) {
		this.friends.add(newFriend);
		this.friendRequests.remove(newFriend);
	}
	
	public ArrayList<User> getFriendRequests(){
		return friendRequests;
	}
	
	public void addFriendRequest(User friendRequest) {
		this.friendRequests.add(friendRequest);
	}
}
