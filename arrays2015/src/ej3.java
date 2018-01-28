/* 
 * 3. Diseñar un método paresImpares() que recibe un array a 
 * de n números enteros (int[]a, int n), ordenar el array 
 * colocando en la parte superior todos los pares y en la 
 * parte inferior los impares. No se podrá crear ningún otro
 * array y se ordenan los pares y los impares por separado.
 * 
 * - Paso1, separo pares e impares 8 4 22 2 6 34 54 62 7 3 5 21 33 1
 * - Paso 2, ordeno 2 4 6 8 22 34 54 62 1 3 5 7 21 33
 */

class Ejercicio3 {
  public static void main (String [] args) {
    int n = 21;
    int [] arr = new int[n];

    fillArray(arr);
    paresImpares(arr);

    for(int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
  }

  /**
   * Separates evens and odds and orders them
   * @param arr The array
   */
  public static void paresImpares (int [] arr) {
    int k = moveEvenToFront(arr);
    orderElements(arr, k, arr.length);
    orderElements(arr, 0, k);
  }

  /**
   * Order elements inside an array
   * @param arr The array
   * @param ini The initial position of the ordering
   * @param length The final position of the ordering
   */
  public static void orderElements (int [] arr, int ini, int length) {
    int aux;

    for (int i = ini; i < length; i++) {
      for(int j = i + 1; j < length; j++) {
        if (arr [j] < arr [i]) {
          aux = arr[j];
          arr[j] = arr[i];
          arr[i] = aux;
        }
      }
    }
  }
 
  /**
   * Moves all evens to the front of the array
   * @param arr The array
   * @return The number of evens
   */
  public static int moveEvenToFront (int [] arr){
    int aux;
    int a = 0;

    for(int i = 0; i < arr.length; i++){
      if(esPar(arr[i])){
        for (int j = i; j > a; j--){
          aux = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = aux;
        }
        a++;
      }
    }

    return a;
  }

  /**
   * Return if a number is even or not
   * @param num The number
   * @return Boolean
   */
  public static boolean esPar (int num) {
    if (num % 2 == 0)
      return true;

    return false;
  }

  /**
   * Fills 'arr' with ints
   * @param arr The array to fill
   */
  public static void fillArray (int [] arr) {
    for(int i = 0; i < arr.length; i++)
      arr[i] = i + 1;
  }
}