/**
 * 1. Diseñar un método que reciba dos listas Lista lista1 y Lista lista2
 * y determine si lista2 está contenida en lista1 y si es así eliminar esta
 * lista de lista1 (todas las ocurrencias).
 */
package ej1;

public class ej1 {
  public static void main(String[] args) {
    Lista lista1 = new Lista();
    Lista lista2 = new Lista();

    lista1.add(7);
    lista1.add(8);
    lista1.add(15);
    lista1.add(8);
    lista1.add(15);
    lista1.add(8);
    lista1.add(15);

    lista2.add(8);
    lista2.add(15);

    lista1.recorrido();
    MisMetodos.eliminar(lista1, lista2);
    lista1.recorrido();
  }
}
