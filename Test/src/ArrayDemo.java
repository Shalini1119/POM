
public class ArrayDemo {

	//private static final boolean True = True;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st Comment
		
		int[] arr = new int[5];
		arr[1]=4;
		arr[2]=2;
		String[] str = new String[3];
		str[2]="Hello";
		for (int a :arr)
		{
			System.out.println(a);
		}
		int[] n= {0,2,5,8,6,3,5,8};
		
		//for (int a :n)
		for(int i=0;i<n.length;i++)
		{
		System.out.println(n[i]);
		}
		System.out.println(str[2]);
	}
}
		
		
				

		
		
		
		
		

