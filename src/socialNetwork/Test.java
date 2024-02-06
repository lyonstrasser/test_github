package socialNetwork;

import java.time.LocalDateTime;

public class Test {

	public static void main(String[] args) {
		
		NewsFeed newsfeed = new NewsFeed();
		
		Message m1 = new Message("Lyon Strasser", "Moin!");
		m1.setTimestamp(LocalDateTime.of(2024, 2, 5, 9,50));
		Message m2 = new Message("Johannes Rainer", "Hello!");
		m2.setTimestamp(LocalDateTime.of(2024, 2, 4, 10,40));
		
		m1.addLike();
		m2.addLike();
		m2.addLike();
		
		System.out.println(m1);
		System.out.println();
		System.out.println(m2);
		System.out.println();
		
		Comment c1 = new Comment("Noah Schennach", "This is very good!");
		Comment c2 = new Comment("Luca Strobl", "That's brilliant!");
		Comment c3 = new Comment("Franz Josef", "That's not good!");
		
		m1.addComment(c1);
		m1.addComment(c3);
		m2.addComment(c2);
		
		m1.printAllComments();
		System.out.println();
		m2.printAllComments();
		System.out.println();
		
		newsfeed.addSubmission(m1);
		newsfeed.addSubmission(m2);
		newsfeed.printAllSubmissions();
		System.out.println();
		newsfeed.getSubmissionsFromUser("Johannes Rainer");
		newsfeed.removeSubmissionFromUser("Lyon Strasser");
		System.out.println();
		newsfeed.printAllSubmissions();
		
	}

}
