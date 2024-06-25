	import java.util.Scanner;
public class SandMnumber{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n ");
		int n = sc.nextInt();
		int [] array =new int[n];
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter value of element");
			array[i]=sc.nextInt();

		}
		int min=array[0],max=array[0],min_pos=0,max_pos=0;
		for(int i=0;i<array.length;i++){
			if(min>array[i]){
				min=array[i];
				min_pos =i;
			}
			if(max<array[i])
			{
				max =array[i];
				max_pos =i;
			}
		}
		
		System.out.println("Smallest number :"+min_pos+"\nlargest number :"+max_pos);

	}
}