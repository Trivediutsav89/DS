import java.util.Scanner;
public class FactorialReqursion
{
    public static void main(String[] args)
    {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int res = fact(n);
        
System.out.println("FactorialReqursion ="+res);
}
public ststic int fact (int n){
    if(n==1){
        return 1;
    }
    else{
        return n*fact(n-1);
    }
}
       
    
    
        
    }
