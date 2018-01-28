/**
 * 1. Diseñar un método ...eliminar(…) que reciba un array a de n elementos
 * y elimine todos los elementos menores que la media.
 */

class ArrayUtils {

  public static void main (String [] args) {
    int n = 5;
    int [] arr = new int[]{2, 3, 5, 6, 8};

    n = eliminar(arr, n);

    for(int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  
  /**
   * Returns a new size of the array 'arr' and modifies arr
   * if the value is less than average.
   * 
   * @param arr Array
   * @param n Size of 'arr'
   * @return New size of 'arr'S
   */
  public static int eliminar (int [] arr, int n) {
    double media = media(arr, n);

    for(int i = 0; i < n - 1; i++) {
      if(arr[i] < media) {
        for(int j = i; j < n - 1; j++) {
          arr[j] = arr[j+1];
        }
        n--;
        i--;
      }
    }

    return n;
  }

  /**
   * Takes an array and returns the average of it values
   * @param arr The array
   * @param n Size of 'arr'
   */
  public static double media (int [] arr, int n) {
    double res = 0;
    int counter = 0;

    for(int i = 0; i < n; i++) {
      res += arr[i];
      counter++;
    }

    return (res / counter);
  }
}