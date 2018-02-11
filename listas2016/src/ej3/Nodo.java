package ej3;

class Nodo {
  private int info;
  private Nodo sig;

  public int getInfo () { return this.info; }
  public Nodo getSig () { return this.sig; }

  public void setInfo (int info) { this.info = info; }
  public void setSig (Nodo sig) { this.sig = sig; }
}