package socialNetwork;

import java.util.ArrayList;

public class NewsFeed {
	
	ArrayList<Submission> newsfeed = new ArrayList<Submission>();
	
	public void addSubmission(Submission s) {
		this.newsfeed.add(s);
	}
	
	public void removeSubmission(Submission s) {
		this.newsfeed.remove(s);
	}
	
	public void getSubmissionsFromUser(String author){
		for(Submission s : this.newsfeed) {
			if(s.getUsername().equals(author)) {
				System.out.println(s);
			}
		}
	}
	
	public void printAllSubmissions() {
		for(Submission s : this.newsfeed) {
			System.out.println(s);
		}
	}
	
	public void removeSubmission(String author) {
		for(Submission s : this.newsfeed) {
			if(s.getUsername().equals(author)) {
				this.newsfeed.remove(s);
			}
		}
	}
	
	
}
