package ej3;

class Lista {
  private Nodo comienzo;
  private int size;

  public void add (int dato) {
    Nodo p = new Nodo();
    p.setInfo(dato);
    p.setSig(this.comienzo);
    this.comienzo = p;
    this.size++;
  }

  public void imprimir () {
    Nodo p = this.comienzo;

    while (p != null) {
      System.out.print(p.getInfo() + " ");
      p = p.getSig();
    }
    System.out.println();
  }

  public void eliminarPenultimo () {
    Nodo p = this.comienzo.getSig().getSig();
    Nodo aux = this.comienzo;

    while (p != null) {
      if (p.getSig() == null) { 
        aux.setSig(p);
        this.size--;
      }

      aux = aux.getSig();
      p = p.getSig();
    }
  }

  public Nodo getComienzo () { return this.comienzo; }
  public int getSize () { return this.size; }
}