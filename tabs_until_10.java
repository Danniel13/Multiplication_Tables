//Programa para validar tablas de multiplicar según requerimiento del usuario hasta 10 By Danni
import java.util.Scanner;
public class tabs_until_10  {
  public static void main(String[] args) {
    

Scanner scanner = new Scanner(System.in);
System.out.println("Ingrese la tabla a evaluar (Multiplicando)");
int n = scanner.nextInt();  


System.out.println("Los multiplos de " + n +" hasta 10 son: " );
for(int x = 1; x <=10; x++) 
System.out.printf("%d * %d = %d %n", x, n,x*n);

  
scanner.close();

  }
}