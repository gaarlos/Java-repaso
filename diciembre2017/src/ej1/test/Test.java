package ej1.test;

public class Test {
  public static void main (String [] arg) {
    double cant;

    System.out.println("Rellenar datos."
                      +"\nDatos de la primera cuenta");

    Cuenta c = LeerMostrarDatos.leerCuenta();

    System.out.println("\nIngresar en la cuenta. Introduce la cantidad: ");
    cant = LeerMostrarDatos.leerDouble();
    c.ingreso(cant);
    System.out.println("\nRetirar de la cuenta. Introduce la cantidad: ");
    cant = LeerMostrarDatos.leerDouble();
    c.retirar(cant);


    System.out.println("\n\nDatos de la segunda cuenta");
    Cuenta d = LeerMostrarDatos.leerCuenta();

    System.out.println("\nIngresar en la cuenta. Introduce la cantidad: ");
    cant = LeerMostrarDatos.leerDouble();
    d.ingreso(cant);
    System.out.println("\nRetirar de la cuenta. Introduce la cantidad: ");
    cant = LeerMostrarDatos.leerDouble();
    d.retirar(cant);


    System.out.println("\n\nCuenta 1\n" + c + "\n\nCuenta 2\n" + d);

    int a = c.compareTo(d);
    String compareResult;

    if(a > 0) {
      compareResult = "LA CUENTA DE NUMERO " + c.getNumeroDeCuenta() + " ES MAYOR QUE LA CUENTA " + d.getNumeroDeCuenta();
    } else if (a == 0) {
      compareResult = "AMBAS CUENTAS SON IGUALES";
    } else {
      compareResult = "LA CUENTA DE NUMERO " + d.getNumeroDeCuenta() + " ES MAYOR QUE LA CUENTA " + c.getNumeroDeCuenta();
    }

    System.out.println("\n\n" + compareResult);
  }
}
