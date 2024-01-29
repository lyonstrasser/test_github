package socialNetwork;

import java.util.ArrayList;

public abstract class Submission {
	
	private String username;
	private long timestamp;
	private int likes;
	private ArrayList<Comment> comments;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
	public void giveLike() {
		likes = this.likes + 1;
	}
	
	public void giveComment(Comment c) {
		this.comments.add(c);
	}
	
	
}
