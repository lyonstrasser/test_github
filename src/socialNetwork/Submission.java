package socialNetwork;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public abstract class Submission {
	
	private String username;
	private LocalDateTime timestamp;
	private int likes;
	private ArrayList<Comment> comments;
	private ArrayList<String> hashtags;
	
	public Submission(String username) {
		super();
		this.username = username;
		this.timestamp = LocalDateTime.now();
		this.likes = 0;
		this.comments = new ArrayList<Comment>();
		this.hashtags = new ArrayList<String>();
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public ArrayList<String> getHashtags() {
		return hashtags;
	}
	public void setHashtags(ArrayList<String> hashtags) {
		this.hashtags = hashtags;
	}

	/**
	 * Adds a like to a submission
	 */
	public void addLike() {
		likes = this.likes + 1;
	}
	
	/**
	 * Adds a comment to a submission
	 * @param c which comment
	 */
	public void addComment(Comment c) {
		this.comments.add(c);
	}
	
	/**
	 * Prints all the comments from a submission
	 */
	public void printAllComments() {
		for(Comment c : this.comments) {
			System.out.println(c);
		}
	}
	
	/**
	 * Calculates the timespan between the the submission was created and now
	 * @return the timespan in minutes, hours, weeks,... on the console
	 */
	public String calculateTimeSpan() {
		long timeSpan = ChronoUnit.MINUTES.between(this.timestamp, LocalDateTime.now());
		if(timeSpan < 60) {
			return "vor " + timeSpan + " Minuten erstellt";
		} else if(timeSpan > 60 && timeSpan < (60*24)) {
			timeSpan = ChronoUnit.HOURS.between(this.timestamp, LocalDateTime.now());
			return "vor " + timeSpan + " Stunden erstellt";
		} else if(timeSpan > (60*24) && timeSpan < (60*24*7)) {
			timeSpan = ChronoUnit.DAYS.between(this.timestamp, LocalDateTime.now());
			return "vor " + timeSpan + " Tagen erstellt";
		} else if(timeSpan > (60*24*7) && timeSpan < (60*24*7*4)) {
			timeSpan = ChronoUnit.WEEKS.between(this.timestamp, LocalDateTime.now());
			return "vor " + timeSpan + " Wochen erstellt";
		} else if(timeSpan > (60*24*7*4) && timeSpan < (60*24*7*4*12)) {
			timeSpan = ChronoUnit.MONTHS.between(this.timestamp, LocalDateTime.now());
			return "vor " + timeSpan + " Monaten erstellt";
		} else {
			return "vor " + timeSpan + " Jahren erstellt";

		}
		
	}
	
	public void addHashtag(String hashtag) {
		this.hashtags.add(hashtag);
	}
	
	public boolean hashtagIsAvailable(String hashtag) {
		for(String s : hashtags) {
			if(s.equals(hashtag)) {
				return true;
			}
		}
		return false;
	}
	
}
