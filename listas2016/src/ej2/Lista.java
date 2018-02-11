package ej2;

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

  public void imprimir () {
    Nodo p = this.comienzo;

    while (p != null) {
      System.out.print(p.getInfo() + " ");
      p = p.getSig();
    }
  }

  public int getSize () { return this.size; }
  public Nodo getComienzo () { return this.comienzo; }
}
