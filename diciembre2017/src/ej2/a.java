/**
 * a. Diseñar un metodo repite() que permita obtener el número de veces que aparece
 * un dígito (de 0 a 9) en un número entero de n cifras. Se mostrará el resultado.
 * 
 * Por ej: 215610 si el dígito es 1 mostraría 2 (el 1 se repite 2 veces)
 */

public int repite (int n, int d) {
  int[] nArr = toArray(n);
  int count = 0;

  for (int i = 0; i < nArr.length; i++) {
    if (nArr[i] == d)
      count++;
  }

  System.out.println(count);
}