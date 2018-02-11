/**
 * 3. Diseñar un método para eliminar el penúltimo nodo de una lista de números enteros.
 */
package ej3;

public class ej3 {
  public static void main (String [] args) {
    Lista numeros = new Lista();

    numeros.add(1);
    numeros.add(2);
    numeros.add(4);
    numeros.add(5);
    numeros.add(6);
    numeros.add(3);
    numeros.add(4);
    numeros.add(5);
    numeros.add(6);

    numeros.eliminar();
    numeros.imprimir();
  }
}
