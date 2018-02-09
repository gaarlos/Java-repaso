/**
 * d. Diseñar el método public int compareTo(Object o) de acuerdo al mismo criterio.
 * Devolverá 1, 0 ó -1, según el caso.
 */

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