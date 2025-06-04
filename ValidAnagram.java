import java.util.Arrays;
import java.util.Scanner;
public class ValidAnagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next().toLowerCase();
		String s2 = sc.next().toLowerCase();
		System.out.println(findvalidAnagram(s1,s2));
	}
	static boolean findvalidAnagram(String s1,String s2)
	{
		char [] s11 = s1.toCharArray();
		char [] s12 = s2.toCharArray();
		Arrays.sort(s11);
		Arrays.sort(s12);
		return Arrays.equals(s11, s12);
	}
}
