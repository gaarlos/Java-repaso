/**
 * 2. Diseñar un método cribaEratostenes()
 * que recibe un array a de n elementos con los números de 1 a n y 
 * lo modifica para que sólo contenga los números primos. 
 *
 * Para esto se deben seguir los siguientes pasos:
 *
 * - Se elimina el 1
 * - Se eliminan todos los pares excepto el 2: **2** 3 5 7 9 11 13 15 17 19 21 23 25 27 29
 * - Se eliminan todos los múltiplos de 3 excepto el 3: 2 **3** 5 7 11 13 17 19 23 25 29...
 * - Se elimina todos los múltiplos de 5 excepto el 5: 2 3 **5** 7 11 13 17 19 21 29...
 * - Etc.
 */

class Ejercicio2 {
  public static void main (String [] args) {
    int n = 40;
    int [] arr = new int[n];

    fillArray(arr);
    n = eliminar(arr, n, 0);
    n = cribaEratostenes(arr, n);

    for(int i = 0; i < n -1; i++)
      System.out.print(arr[i] + " ");
  }

  /**
   * Clears non-prime values from an array given
   * @param arr Array to clear
   * @param n Size of the array
   * @return New size of array
   */
  public static int cribaEratostenes (int [] arr, int n) {

    for(int i = 0; i < n - 1; i++) {
      if(esPrimo(arr[i])) {
        n = eliminarMult(arr, n, arr[i]);
      }
    }

    return n;
  }

  /**
   * Deletes multiples of num
   * @param arr Array to clear
   * @param n Size of the array
   * @param num Reference number
   * @return New size of array
   */
  public static int eliminarMult (int [] arr, int n, int num) {

    for(int i = 0; i < n - 1; i++) {
      if(arr[i] % num == 0 && arr[i] != num) {
        n = eliminar(arr, n, i);
        n--;
      }
    }

    return n;
  }

  /**
   * Deletes an element of the array
   * 
   * @param arr Array
   * @param n Size of 'arr'
   * @param p Position to delete
   * @return New size of 'arr'
   */
  public static int eliminar (int [] arr, int n, int p) {

    for(int i = p; i < n - 1; i++) {
      arr[i] = arr[i+1];
    }

    return n;
  }

  /**
   * Returns if a number is prime
   * @param n Number
   * @return Boolean
   */
  public static boolean esPrimo (int n) {
    int counter = 0;

    for(int i = 1; i <= n; i++) {
      if(n % i == 0) {
        counter++;
      }
    }

    if(counter <= 2) {
      return true;
    }

    return false;
  }

  /**
   * Fills 'arr' with ints
   * @param arr The array to fill
   */
  public static void fillArray (int [] arr) {

    for(int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
  }
}