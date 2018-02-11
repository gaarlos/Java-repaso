/**
 * 1. Diseñar un método que reciba dos listas Lista lista1 y Lista lista2
 * y determine si lista2 está contenida en lista1 y si es así eliminar esta
 * lista de lista1 (todas las ocurrencias).
 */

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

class MisMetodos {
  public static void eliminar (Lista lista1, Lista lista2) {
    Nodo it1 = lista1.getComienzo();
    Nodo it2 = lista2.getComienzo();
    int counter = 0;

    while (it1 != null) {
      if(it2 != null && it1.getInfo() == it2.getInfo()) {
        counter++;
        it2 = it2.getSig();
      } else {
        it2 = lista2.getComienzo();
        counter = 0;
      }

      if (lista2.getSize() == counter) {
        it2 = lista2.getComienzo();
        while (it2 != null) {
          lista1.borrado(it2.getInfo());
          it2 = it2.getSig();
        }
        counter = 0;
        it2 = lista2.getComienzo();
      }

      it1 = it1.getSig();
    }
  }
}

class Lista {
  private Nodo comienzo;
  private int size;

  public void add (int dato) {
    Nodo nodo = new Nodo();
    nodo.setInfo(dato);
    nodo.setSig(this.comienzo);
    this.comienzo = nodo;
    this.size++;
  }

  public void recorrido () {
    Nodo p = this.comienzo;

    while(p != null) {
      System.out.print(p.getInfo() + " ");
      p = p.getSig();
    }
    System.out.println();    
  }

  public void borrado (int dato) {
    boolean encontrado = false;
    Nodo p = this.comienzo.getSig();

    if (this.comienzo.getInfo() == dato) { this.comienzo = this.comienzo.getSig(); }

    else {
      while (p != null && encontrado == false) {
        if (p.getInfo() == dato) { encontrado = true; }

        else {
          this.comienzo = this.comienzo.getSig();
          p = p.getSig();
        }
      }

      if (encontrado == true) { this.comienzo.setSig(p.getSig()); }
    }
  }

  public Nodo getComienzo () { return this.comienzo; }
  public int getSize () { return this.size; }
}

class Nodo {
  private int info;
  private Nodo sig;

  public int getInfo () { return this.info; }
  public Nodo getSig () { return this.sig; }

  public void setInfo (int info) { this.info = info; }
  public void setSig (Nodo sig) { this.sig = sig; }
}