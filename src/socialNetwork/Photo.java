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
		return "Photo:\n\tUser: " + this.getUsername() + "\n\tHeadline: " + this.headline +
				"\n\tFilename: " + this.filename + "\n\tLikes: " + this.getLikes() + 
				"\n\tTimeSpan: " + this.calculateTimeSpan();
	}
	
}
