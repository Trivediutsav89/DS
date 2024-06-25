import java.util.Scanner;
public class insertnoatindex {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of array elements: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter elements:");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter n=a number you have to add: ");
        int b=sc.nextInt();
        System.out.println("enter index at which you have to add a number: ");
        int c=sc.nextInt();
        int d[]=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            if(i<c)
            {
                d[i] = a[i];
            }
            if(i==c)
            {
                d[i]=b;
            }
            if(i>c)
            {
                d[i]=a[i-1];
            }
        }
        for(int i=0;i<n+1;i++){
            System.out.println(d[i]);
        }
    }
}
