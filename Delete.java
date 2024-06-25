import java.util.Scanner;
public class Delete{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of array elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter array elements: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter index at which you want to delete element: ");
        int b=sc.nextInt();
        int arr2[]=new int[n-1];
        for(int i=0;i<n;i++)
        {
            if(i<b)
            {
                arr2[i]=arr[i];
            }
            if(i>b)
            {
                arr2[i-1]=arr[i];
            }
        }
        for(int i=0;i<n-1;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
