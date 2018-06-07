import java.util.ArrayList;

public class Group {
	private String name;
	private ArrayList<User> members;
	private ArrayList<User> memberRequests;
	private ArrayList<Photo> pictures;
	private ArrayList<Post> posts;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<User> getMembers() {
		return members;
	}
	
	public void addMember(User newMember) {
		this.members.add(newMember);
	}
	
	public ArrayList<User> getMemberRequests() {
		return memberRequests;
	}

	public void addMemberRequest(User memberRequest) {
		this.memberRequests.add(memberRequest);
	}
	
	public ArrayList<Photo> getPictures() {
		return pictures;
	}
	
	public void addPicture(Photo picture) {
		this.pictures.add(picture);
	}
	
	public ArrayList<Post> getPosts() {
		return posts;
	}
	
	public void addPost(Post newPost) {
		this.posts.add(newPost);
	}
}
