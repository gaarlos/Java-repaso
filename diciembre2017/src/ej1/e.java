/**
 * e. Diseñar el método public String toString()
 * de manera que aparezca numeroCuenta, saldo, fecha de alta y has realizado
 * más ingresos o has realizado más retiradas de dinero según sea el caso.
 */

public String toString () {
  String a = this.numeroDeIngresos > this.numeroDeRetiradas 
             ? (this.numeroDeIngresos == this.numeroDeRetiradas)
             ? "los mismos ingresos que retiradas"
             : "mas ingresos que retiradas"
             : "mas retiradas que ingresos";

  String c = "Nº Cuenta: " + this.numeroCuenta 
             + "\nSaldo: " + this.saldo
             + "\nFecha de alta: " + this.fechaAlta
             + "\nHas realizado " + a;

  return c;
}