import java.util.ArrayList;

public class Feed {
	private ArrayList<Post> posts;
	private ArrayList<Photo> pictures;

	public ArrayList<Post> getPosts() {
		return posts;
	}
	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}
	public ArrayList<Photo> getPictures() {
		return pictures;
	}
	public void setPictures(ArrayList<Photo> pictures) {
		this.pictures = pictures;
	}
}