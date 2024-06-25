import java.util.Scanner;
public class CalculateAvg{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		float avg=0;
	
		for(int i=0;i<=n;i++){
			avg +=i;
		}

		System.out.println("avg "+avg);
	}
}