package Task2;

public class Task2_6 {
	
	public static void main(String[] args) {
        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }

}
