package Array.PrintEvenOdds;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int arraysize=scan.nextInt();
        int array[]=new int[arraysize];
        System.out.print("Enter the Array:");
        for(int i=0;i<arraysize;i++) array[i]=scan.nextInt();
        new EvenOdds().print(arraysize,array);
       
    }
    
}
