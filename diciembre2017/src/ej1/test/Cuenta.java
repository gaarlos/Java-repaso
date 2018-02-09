package ej1.test;

public class Cuenta {
  private int numeroCuenta;
  private double saldo;
  private Fecha fechaAlta;
  private int numeroDeIngresos;
  private int numeroDeRetiradas;

  public Cuenta (int numeroCuenta, double saldo, Fecha fechaAlta, int numeroDeIngresos, int numeroDeRetiradas) {
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
    this.fechaAlta = fechaAlta;
    this.numeroDeIngresos = numeroDeIngresos;
    this.numeroDeRetiradas = numeroDeRetiradas;
  }

  // METHODS

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

  public String toString () {
    String a = this.numeroDeIngresos > this.numeroDeRetiradas 
               ? (this.numeroDeIngresos == this.numeroDeRetiradas)
               ? "los mismos ingresos que retiradas"
               : "mas ingresos que retiradas"
               : "mas retiradas que ingresos";

    String c = "No. Cuenta: " + this.numeroCuenta 
               + "\nSaldo: " + this.saldo
               + "\nFecha de alta: " + this.fechaAlta
               + "\nHas realizado " + a;
    
    return c;
  }

  // GETTERS

  public int getNumeroDeCuenta () { return this.numeroCuenta; }

  public double getSaldo () { return this.saldo; }

  public Fecha getFechaAlta () { return this.fechaAlta; }

  public int getNumeroDeIngresos () { return this.numeroDeIngresos; }

  public int getNumeroDeRetiradas () { return this.numeroDeRetiradas; }

  public int getDiferencia () { return ( this.numeroDeIngresos - this.numeroDeRetiradas ); }

  // EQUALS & COMPARETO

  public boolean equals (Object o) {
    Cuenta c = (Cuenta) o;

    return this.fechaAlta.equals(c.fechaAlta)
           && this.saldo == c.getSaldo()
           && this.getDiferencia() == c.getDiferencia()
           ? true : false;
  }

  public int compareTo (Object o) {
    Cuenta c = (Cuenta) o;

    if (this.fechaAlta.compareTo(c.fechaAlta) == 1) {
      return 1;
    } else if (this.fechaAlta.compareTo(c.fechaAlta) == 0) {
      if (this.saldo > c.getSaldo()) {
        return 1;
      } else if (this.saldo == c.getSaldo()) {
        if (this.getDiferencia() > c.getDiferencia()) {
          return 1;
        } else if (this.getDiferencia() == c.getDiferencia()) {
          return 0;
        }
      }
    }
    return -1;
  }
}
