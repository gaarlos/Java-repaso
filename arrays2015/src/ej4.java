/**
 * 4. Dado un array de caracteres char [] a de contenido
 * A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 *
 * Diseñar un método cifrar() que recibe un mensaje (array de caracteres de n
 * caracteres) y un número d de desplazamiento, cifre el mensaje modificando cada
 * carácter de mensaje con el correspondiente desplazado d posiciones en el array.
 * 
 * Ejemplo mensaje E X A M E N -> Para desplazamiento 5 -> J C F R J S
 */
import java.util.Scanner;

class Ejercicio4 {
  public static void main (String [] args) {
    Scanner read = new Scanner(System.in);

    System.out.println("Introduce la palabra a cifrar");
    String word = read.nextLine();
    System.out.println("Introduce el desplazamiento");
    int d = read.nextInt();
    read.close();

    char [] arr = strToArr(word.toUpperCase());
    cifrar(arr, d);

    for(int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
  }

  /**
   * Transforms a word by changing it letters
   * @param word The word converted to array
   * @param d The new letter
   */
  public static void cifrar (char [] word, int d) {
    char [] arr = strToArr("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

    for(int i = 0; i < word.length; i++) {
      for(int j = 0; j < arr.length; j++) {
        if(word[i] == arr[j]) {
          int let = j + d;
          if(let > arr.length)
            let = let - arr.length;

          word[i] = arr[let];
          break;
        }
      }
    }
  }

  /** 
   * Transforms strings into array of chars
   * @param word The string
   * @return The array
  */
  public static char [] strToArr (String word) {
    return word.toCharArray();
  }
}