package ej1;

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

    this.size--;
  }

  public Nodo getComienzo () { return this.comienzo; }
  public int getSize () { return this.size; }
}
