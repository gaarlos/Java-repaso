/**
 * a. Diseñar un método estático en LeerMostrarDatos
 *
 * public static Cuenta leerCuenta () {...}
 * 
 * que nos proporcione un objeto Cuenta, con numeroCuenta, saldo = 0,
 * fechaAlta, numeroDeIngresos = 0 y numeroDeRetiradas = 0
 */

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