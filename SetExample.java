import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> s = null;
		System.out.println("1.HashSet\t2:LHash\t3:Tree  ::");
		switch(sc.nextInt())
		{
		case 1:
			s = new HashSet<Integer>();
			break;
		case 2:
			s = new LinkedHashSet<Integer>();
			break;
		case 3:
			s = new TreeSet<Integer>();
		}
		s.add(6);
		s.add(12);
		s.add(3);
		s.add(7);
		s.add(15);
		System.out.println(s.toString());
	}
}
