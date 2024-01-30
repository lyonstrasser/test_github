package socialNetwork;

public class Comment {
	
	private String user;
	private String comment;
	
	public Comment (String user, String comment) {
		this.user = user;
		this.comment = comment;
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
		return "Comment:\n\t " + this.comment + "\nfrom:\n\t" + this.user;
	}
	

}
