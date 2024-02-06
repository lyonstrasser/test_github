package socialNetwork;

public class Photo extends Submission{
	
	private String filename;
	private String headline;
	
	public Photo(String username, String filename, String headline) {
		super(username);
		this.filename = filename;
		this.headline = headline;
	}
	
	public String getFileName() {
		return filename;
	}
	public void setFileName(String fileName) {
		this.filename = fileName;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	
	public String toString() {
		return "User: " + this.getUsername() + "\nHeadline: " + this.headline +
				"\nFilename: " + this.filename + "\nLikes: " + this.getLikes() + 
				"\nTimeSpan: " + this.calculateTimeSpan();
	}
	
}
