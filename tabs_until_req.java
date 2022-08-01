// Code to analyze Multiples to one number By Danni
import java.util.Scanner;

public class tabs_until_req {
  public static void main(String[] args) {
   
Scanner scanner = new Scanner(System.in);
System.out.println("Select Multiplication table (Factor1)");
int n = scanner.nextInt();  
Scanner scanner2 = new Scanner(System.in);
System.out.println("Select repetitions (factor2) ");
Integer o = scanner2.nextInt();
System.out.println("Multiples of " + n +" until "+ o + " are: " );
for(int x = 1; x <=o; x++) 
System.out.printf("%d * %d = %d %n", n, x,x*n);
  // System.out.println(x  +  n + x*n);
  
scanner.close();
scanner2.close();
  
  }
}
