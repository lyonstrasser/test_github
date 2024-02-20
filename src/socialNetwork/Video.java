package socialNetwork;

public class Video extends Photo {

	public Video(String username, String filename, String headline) {
		super(username, filename, headline);
	}
	
	public String toString() {
		return "Video:\n\tUser: " + this.getUsername() + "\n\tHeadline: " + this.getHeadline() +
				"\n\tFilename: " + this.getFileName() + "\n\tLikes: " + this.getLikes() + 
				"\n\tHashtags: " + this.getHashtags() +
				"\n\tTimeSpan: " + this.calculateTimeSpan();
	}
	
}
