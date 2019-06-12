package first;

public class asciicompare {
	public static void main(String[]  args) {
		String word1="Gourav";
		String word2="Gaurav";
		int num = word1.compareTo(word2);
		
		if (num<0) {
			System.out.println(word1);
			System.out.println(word2);
		}
		else {
			System.out.println(word2);
			System.out.println(word1);
		}
	}
}
