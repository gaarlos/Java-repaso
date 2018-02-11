package ej1;

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
