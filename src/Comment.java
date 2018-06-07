import java.util.ArrayList;
import java.util.Date;

public class Comment {
	private String userName;
	private String text;
	private Date datePosted;
	private int likes;
	private ArrayList<String> userLikes;
	private ArrayList<Answer> answers;
	
	public Comment(String userName, String text, Date datePosted) {
		this.userName = userName;
		this.text = text;
		this.datePosted = datePosted;
		this.likes = 0;
		this.userLikes = new ArrayList<String>();
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDatePosted() {
		return this.datePosted;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
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
