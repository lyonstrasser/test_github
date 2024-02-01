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
		return "User: " + this.getUsername() + "\nMessage: " + this.message +
				"\nLikes: " + this.getLikes() + 
				"\nTimeSpan: vor" + this.calculateTimeSpan() + " erstellt";
	}

	
	
}
