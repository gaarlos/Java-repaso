/*
 * c. Diseñar el método public boolean equals (Object o)
 * 
 * tomando como criterio la fecha de alta (fechaAlta), el saldo de
 * cada Cuenta y la diferencia entre el número de ingresos y retiradas
 * en cada cuenta. Será iguales si las fechas de alta,el saldo y esta
 * diferencia son iguales y distintos en caso contrario.
 */

public boolean equals (Object o) {
  Cuenta c = (Cuenta) o;

  return this.fechaAlta.equals(c.fechaAlta)
         && this.saldo == c.getSaldo()
         && this.getDiferencia() == c.getDiferencia()
         ? true : false;
}