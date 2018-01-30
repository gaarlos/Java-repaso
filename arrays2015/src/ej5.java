import java.util.Arrays;

/**
 * 5. Realizar un método public static int composición(char [] texto, int n, int m) {...}
 * que recibe un array de caracteres texto, de n caracteres y visualiza línea a línea su contenido.
 * 
 * Una **línea** es un array de m elementos de tipo char extraído de texto. No se podrá 
 * romper palabras, los caracteres hasta alcanzar los m elementos serán espacios en 
 * blanco. Una palabra está separada de otra por un carácter en blanco.
 * 
 * El método cada vez que extrae del texto una línea, elimina su contenido de texto.
 * El método devolverá el nuevo n.
 * 
 * En un lugar de la Mancha de cuyo nombre no quiero acordarme no ha mucho
 * tiempo vivía un hidalgo de los de lanza en astillero y adarga antigua rocín flaco y
 * galgo corredor...
 * 
 * Si m = 25 la primera línea será **En un lugar de la Mancha**
 * 
 * Las palabras están separadas por un blanco.
 * 
 * No se podrán romper las palabras
 * 
 * El nuevo texto: **de cuyo nombre no quiero acordarme no ha mucho tiempo vivía un
 * hidalgo de los de lanza en astillero y adarga antigua rocín flaco y galgo corredor...**
 * 
 * | num_pal | linea                    |
 * |---------|--------------------------|
 * | 6       | En un lugar de la Mancha |
 * | 5       | de cuyo nombre no quiero |
 * | 4       | acordarme no ha mucho    |
 * | 4       | tiempo vivía un hidalgo  |
 * | ...     | ...                      |
 * 
 * con m = 25 en el ejemplo
 */

class Ejercicio5 {
  public static void main (String [] args) {
    String fullText = "En un lugar de la Mancha de cuyo nombre no quiero acordarme no ha mucho "
    + "tiempo vivia un hidalgo de los de lanza en astillero y adarga antigua rocin flaco y "
    + "galgo corredor...";
    char [] text = strToArr(fullText);
    int n = text.length;

    n = composicion(text, n, 25);
  }

  /**
   * Deletes a line
   * @param text The array
   * @param m Size to delete
   * @param n Size of the array
   * @return New size
   */
  public static int composicion (char [] text, int n, int m) {
    m = (m <= n) ? m : n - 1;
    int numWords = 0;
    String tempWord = "";
    String newText = "";

    for(int i = 0; i < m; i++) {
      tempWord += text[i];

      if(text[i + 1] == ' ') {
        numWords++;
        newText += tempWord;
        tempWord = "";
      }
    }

    int len = newText.length();
    len = text[len] == ' ' ? len + 1 : len;
    
    System.out.println("| num_pal: " + numWords + " | " + newText + " | " + len);
    n = delete(text, n, len);
    return n;
  }

  /**
   * Delete items in arrays
   * @param text The array
   * @param m Size to delete
   * @param n Size of the array
   * @return New size
   */
  public static int delete (char [] text, int n, int len) {
    n = n - len;

    for(int i = 0; i < n; i++) {
      text[i] = text[len + i];
    }

    return n;
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