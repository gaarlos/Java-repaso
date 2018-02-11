/**
 * 2. Diseñar un método obtener binario que permita convertir un número en base 10
 * en una lista de 0's y 1's (un 0 o un 1 en cada nodo) que represente el número binario 
 * correspondiente en complemento a 1 (sobre 8 bits).
 */
package ej2;

 public class ej2 {
  public static void main (String [] args) {
    Lista binario = MisMetodos.obtenerBinario(127);
    binario.imprimir();
  }
}
