import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        int i=2,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        while(i>n)
        {
     if(n%i==0){
        
        count++;
        break;
            }
            i++;

        }
        if(count==0)
        {
            System.out.println("Number is  prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    
        
    }
}