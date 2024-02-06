package socialNetwork;

public class Message extends Submission {
	
	private String message;
	
	public Message(String username, String message) {
		super(username);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toString() {
		return "Message:\n\tUser: " + this.getUsername() + "\n\tMessage: " + this.message +
				"\n\tLikes: " + this.getLikes() + 
				"\n\tTimeSpan: " + this.calculateTimeSpan();
	}

	
	
}
