
import java.util.Scanner;
public class insertsortingg{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println();
         System.out.println("Enter value");
        int value=sc.nextInt();
        System.out.println();
        int [] arr2 =new int[n+1];
        int i=0;

         while (arr[i] < value && i<arr2.length)
         {
         	arr2[i]=arr[i];
         	i++;
         }
         arr2[i]= value;
         i++;
         while(i< arr2.length)
         {
         	arr2[i]=arr[i-1];
         	i++;
         }
        for(int j=0;jarr2.length;j++){
            System.out.println(arr2[j]);
        }
    }
}
