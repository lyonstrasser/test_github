package socialNetwork;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public abstract class Submission {
	
	private String username;
	private LocalDateTime timestamp;
	private int likes;
	private ArrayList<Comment> comments;
	
	public Submission(String username) {
		super();
		this.username = username;
		this.timestamp = LocalDateTime.now();
		this.likes = 0;
		this.comments = new ArrayList<Comment>();
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
	
	
	public void addLike() {
		likes = this.likes + 1;
	}
	
	public void addComment(Comment c) {
		this.comments.add(c);
	}
	
	public void printAllComments() {
		for(Comment c : this.comments) {
			System.out.println(c);
		}
	}
	
	public long calculateTimeSpan() {
		long timeSpan = ChronoUnit.MINUTES.between(this.timestamp, LocalDateTime.now());
		if(timeSpan < 60) {
			System.out.println("Vor: " + timeSpan + " Minuten erstellt");
			return timeSpan;
		} else if(timeSpan > 60 && timeSpan < (60*24)) {
			timeSpan = ChronoUnit.HOURS.between(this.timestamp, LocalDateTime.now());
			System.out.println("Vor: " + timeSpan + " Stunden erstellt");
			return timeSpan;
		} else if(timeSpan > (60*24) && timeSpan < (60*24*7)) {
			timeSpan = ChronoUnit.DAYS.between(this.timestamp, LocalDateTime.now());
			System.out.println("Vor: " + timeSpan + " Tagen erstellt");
			return timeSpan;
		} else if(timeSpan > (60*24*7) && timeSpan < (60*24*7*4)) {
			timeSpan = ChronoUnit.WEEKS.between(this.timestamp, LocalDateTime.now());
			System.out.println("Vor: " + timeSpan + " Wochen erstellt");
			return timeSpan;
		} else if(timeSpan > (60*24*7*4) && timeSpan < (60*24*7*4*12)) {
			timeSpan = ChronoUnit.MONTHS.between(this.timestamp, LocalDateTime.now());
			System.out.println("Vor: " + timeSpan + " Monaten erstellt");
			return timeSpan;
		} else {
			System.out.println("Vor: " + timeSpan + " Jahren erstellt");
			return ChronoUnit.YEARS.between(this.timestamp, LocalDateTime.now());
		}
		
	}
	
}
