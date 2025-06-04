import java.util.Stack;

public class TextEditor {
	Stack<Character> left;
	Stack<Character> right;
	TextEditor()
	{
		left = new Stack<Character>();
		right = new Stack<Character>();
	}
	void addText(String text)
	{
		//"Hai" -> {'H','a','i'}
		for(Character ch : text.toCharArray())
		{
			left.push(ch);
		}
	}
	int deleteText(int k) {
		int i = 0;
		while(!left.isEmpty() && i++<k)
		{
			left.pop();
		}
		return i;
	}
	String cursorLeft(int k)
	{
		int j=0;
		while(!left.isEmpty() && j++<k)
		{
			right.push(left.pop());
		}	
		int max = Math.min(10, left.size());
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<max;i++)
		{
			sb.append(left.pop());
		}
		sb.reverse();
		for(int i=0;i<sb.length();i++ )
		{
			left.push(sb.charAt(i));
		}
		return sb.toString();
	}
	String cursorRight(int k)
	{
		int j=0;
		while(!right.isEmpty() && j++<k)
		{
			left.push(right.pop());
		}
		int max = Math.min(10, left.size());
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<max;i++)
		{
			sb.append(left.pop());
		}
		sb.reverse();
		for(int i=0;i<sb.length();i++ )
		{
			left.push(sb.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		TextEditor t = new TextEditor();
		t.addText("Hello");
		System.out.println(t.deleteText(10));
		t.addText("HelloWorld");
		System.out.println(t.cursorLeft(5));
		System.out.println(t.left.toString());
		System.out.println(t.right.toString());
		System.out.println(t.cursorRight(2));
		System.out.println(t.left.toString());
		System.out.println(t.right.toString());
	}
}
