package socialNetwork;

import java.util.ArrayList;

public class Photogalerie extends Submission {

	private ArrayList<String> filenames;
	private String headline;
	
	public Photogalerie(String username, ArrayList<String> filenames, String headline) {
		super(username);
		this.filenames = new ArrayList<String>();
		this.headline = headline;
	}

	public ArrayList<String> getFilenames() {
		return filenames;
	}

	public void setFilenames(ArrayList<String> filenames) {
		this.filenames = filenames;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}
	
	public String toString() {
		return "Photo:\n\tUser: " + this.getUsername() + "\n\tHeadline: " + this.headline +
				"\n\tFilenames: " + this.filenames + "\n\tLikes: " + this.getLikes() + 
				"\n\tTimeSpan: " + this.calculateTimeSpan();
	}
	
	
	
}
