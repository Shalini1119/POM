import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList a = new ArrayList();
		//a.add("Hii");
		//a.add("Kavitha");
		//System.out.println(a);
		//a.get(0);
		//System.out.println(a.get(0));
		String str= "Hello how are You";
		System.out.println(str.charAt(0));
		String[] Strsplit = str.split(" ");
		for(String s : Strsplit)
		{
			System.out.println(s);
		}
		
		for (int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
		
		
		

	}

	}

