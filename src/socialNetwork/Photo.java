package socialNetwork;

public class Photo extends Submission{
	
	private String filename;
	private String headline;
	
	public Photo(String user, String filename, String headline) {
		this.setUsername(user);
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
	
	
	
}
