import java.util.Scanner;
public class ReadAndDisplayNnumberUsingArray{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an size array ");
		int n = sc.nextInt();
		int [] array =new int[n];
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter value of element");
			array[i]=sc.nextInt();

		}
		for(int i=0;i<array.length;i++){
			System.out.println(+array[i]);
		}

	}
}