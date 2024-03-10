package musicalChairs;

public class MusicalChairGame {

	public static void main(String[] args) {
		
		MusicalChair mc1 = new MusicalChair("Lisa", "Susi", "Tom");
		System.out.println(mc1);
		
		MusicalChair mc2 = new MusicalChair("Zipfer", "Kaiser", "Augustiner");
		System.out.println(mc2);
		
		mc1.rotate(2);
		System.out.println(mc1);
		
		mc1.rotateAndRemove(2);
		System.out.println(mc1);
		
		mc2.play();
		
	}

}
