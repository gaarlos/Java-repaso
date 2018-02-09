/**
 * b. Crear un método llamado ingreso() de la clase Cuenta
 * que recibe como parámetro la cantidad que se va a ingresar (double).
 * La cantidad se incrementa al saldo. Cada vez que se realiza un ingreso
 * se incrementará elnúmeroDeIingresos
 * 
 * Crear un método retirar() de la clase Cuenta que reciba la cantidad que
 * se va a retirar (double). El saldo no puede ser negativo. En caso de que
 * se pretenda retirar una cantidad superior al saldo se retirará sólo hasta
 * dejar el saldo a 0. El método retirar() devolverá true si se pudo realizar
 * la operación con éxito(se retira la cantidad pedida) y false en caso
 * contrario. La cantidad que se retira se resta del saldo.Cada vez que se
 * realiza una retirada se incrementaránumeroDeRetiradas.
 */

public void ingreso (double cantidad) {
  this.saldo += cantidad;
  this.numeroDeIngresos++;
}

public boolean retirar (double cantidad) {
  this.numeroDeRetiradas++;

  if(cantidad >= this.saldo) {
    this.saldo -= (cantidad - (cantidad - this.saldo));
    return false;
  }

  this.saldo -= cantidad;
  return true;
}