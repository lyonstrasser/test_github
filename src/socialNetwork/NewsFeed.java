package socialNetwork;

import java.util.ArrayList;

public class NewsFeed {
	
	ArrayList<Submission> newsfeed = new ArrayList<Submission>();
	
	/**
	 * Adds a Submission to the list of all the submissions
	 * @param s which Submission
	 */
	public void addSubmission(Submission s) {
		this.newsfeed.add(s);
	}
	
	/**
	 * Removes a Submission from the list of all the submissions
	 * @param s which Submission
	 */
	public void removeSubmission(Submission s) {
		this.newsfeed.remove(s);
	}
	
	/**
	 * Gets all the Submissions from a certain user
	 * @param author which user
	 */
	public void getSubmissionsFromUser(String author){
		for(Submission s : this.newsfeed) {
			if(s.getUsername().equals(author)) {
				System.out.println(s);
			}
		}
	}
	
	/**
	 * Prints out all the Submission from the list of the Submissions on the console
	 */
	public void printAllSubmissions() {
		for(Submission s : this.newsfeed) {
			System.out.println(s);
		}
	}
	
	/**
	 * Removes all the Submissions from a certain user
	 * @param author which user
	 */
	public void removeSubmissionFromUser(String author) {
		for(Submission s : this.newsfeed) {
			if(s.getUsername().equals(author)) {
				this.newsfeed.remove(s);
			}
		}
	}
	
	
}
