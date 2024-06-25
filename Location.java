import java.util.Scanner;

public class Location{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr [i] = sc.nextInt();
         }
         
         System.out.println("Enter value:");
         int value = sc.nextInt();
         
         System.out.println("Enter index:");
         int x = sc.nextInt();

         int[] array = new int [n+1];
         for(int i=0;i<array.length;i++){
         	if(x>i)
         	{
         		array[i]=arr[i];
         	}
         	else if(x == i){
         		array[i]=value;
         	}
         	else if(x < i){
         		array[i]=arr[i-1];
         	}

         }
         for(int i=0;i<array.length;i++){
         	System.out.println(array[i]);
         }



	}
}