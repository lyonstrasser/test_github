package socialNetwork;

public class Comment {
	
	private String user;
	private String comment;
	private int likes;
	
	public Comment (String user, String comment) {
		this.user = user;
		this.comment = comment;
		this.likes = 0;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String toString() {
		return "Comment:\n " + this.comment + "\nfrom:\n " + this.user;
	}
	
	public void likeComment() {
		this.likes += 1;
	}

}
