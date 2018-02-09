/**
 * b. Diseñar en Java un método estático en MisMetodos masSeRepite()
 * que reciba un número de n cifras y devuelva
 *
 * \-1 si ninguno se repite
 * El dígito si existe alguno que se repite un mayor número de veces.
 * Cuando hay varios que se repiten se devolverá el mayor de todos ellos.
 * 
 * Por ej.: 22454 se devolvería el 4 que se repite el mismo número de veces
 * que el 2, pero 4 es mayor que 2.
 */

public int masSeRepite (int n) {
  int[] nArr = toArray(n);
  int min = 1;
  int dig = 0;
  int aux;

  for (int i = 0; i < nArr.length; i++) {
    aux = repite(nArr, nArr[i]);

    if (aux > min && nArr[i] > dig) {
      min = aux;
      dig = nArr[i];
    }
  }

  if (min == 1)
    return -1;

  return dig;
}