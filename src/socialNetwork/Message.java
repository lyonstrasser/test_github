package socialNetwork;

public class Message extends Submission {
	
	private String message;

	public Message(String user, String message) {
		this.setUsername(user);
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
				"\nLikes: " + this.getLikes() + "\nComments: ";			// Zeitstempel? Liste der Kommentare?
	}

	
	
}
