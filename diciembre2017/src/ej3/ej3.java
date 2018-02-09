/**
 * 3. Los números Catalán deben su nombre al matemático belga Eugène Catalan (1814-1894)
 * 1,2,5 ,14, 42 ,132, 429 ,1430,4862,16796, 58786 ,208012,... números Catalan para n=1,2, ...
 * 
 * El número Catalán n: catalanN = (2*n)!/(n+1)!*n!
 * 
 * Se pide diseñar un método main () que nos permita calcular la suma de los primeros x
 * números Catalán solo para los n que sean primos n=1,2,3,5,7,11,13, ...
 * Por ej. si x =7 se sumarían los catalán para n =1,2,3,5,7,11,
 */

package ej3;
import java.util.Scanner;

public class ej3 {
  public static void main (String [] args) {
    Scanner read = new Scanner(System.in);
    double suma = 0.0;
    int i = 1;
    int count = 0;

    System.out.println("Introduce la cantidad (recuerda que se utilizaran los primos)");
    double n = read.nextDouble();
    read.close();

    while(count < n) {
      if (esPrimo(i)) {
        suma += catalan(i);
        count++;
      }
      i++;    
    }

    System.out.println("\nLa suma es: " + suma);
  }

  private static double catalan (int n) {
    return factorial(2*n)/(factorial(n+1)*factorial(n));
  }

  private static double factorial (int n) {
    double factorial = 1;

    for (; n > 0; n--)
      factorial *= n;
    
    return factorial;
  }

  public static boolean esPrimo (int n) {
    int counter = 0;

    for(int i = 1; i <= n; i++) {
      if(n % i == 0)
        counter++;
    }

    if(counter <= 2)
      return true;

    return false;
  }
}