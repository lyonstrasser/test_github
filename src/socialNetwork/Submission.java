package socialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Submission {
	
	private String username;
	private LocalDate timestamp;
	private int likes;
	private ArrayList<Comment> comments;
	
	public Submission(String username) {
		super();
		this.username = username;
		this.timestamp = LocalDate.now();
		this.likes = 0;
		this.comments = new ArrayList<Comment>();
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public LocalDate getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
	public void addLike() {
		likes = this.likes + 1;
	}
	
	public void addComment(Comment c) {
		this.comments.add(c);
	}
	
	public void printAllComments() {
		for(Comment c : this.comments) {
			System.out.println(c);
		}
	}
	
	
}
