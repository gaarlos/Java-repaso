package ej1.test;
import java.util.Scanner;

public class LeerMostrarDatos {
  private static Scanner teclado = new Scanner(System.in);  

  public static int leerEntero () {
    int n;
    n = teclado.nextInt();
    return n;
  }

  public static double leerDouble () {
    double n;
    n = teclado.nextDouble();
    return n;
  }

  public static String leerString () {
    String s;
    s = teclado.next();
    return s;
  }

  public static Cuenta leerCuenta () {
    double sld = 0;
    int ndi = 0;
    int ndr = 0;

    System.out.println("\nNumero de cuenta: ");
    int nc = leerEntero();

    System.out.println("\nDia de creacion: ");
    int d = leerEntero();

    System.out.println("\nMes de creacion: ");
    int m = leerEntero();

    System.out.println("\nAño de creacion: ");
    int a = leerEntero();

    Fecha fc = new Fecha(d, m, a);
    Cuenta c = new Cuenta(nc, sld, fc, ndi, ndr);
    
    return c;
  }
}