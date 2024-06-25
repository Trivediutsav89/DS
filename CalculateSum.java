import java.util.Scanner;
public class CalculateSum{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a lower number ");
		int m = sc.nextInt();
		System.out.println("Enter a higher number ");
		int n = sc.nextInt();
		int sum=0;
		for(int i=m;i<=n;i++){
			sum +=i;
		}

		System.out.println("sum "+sum);
	}
}