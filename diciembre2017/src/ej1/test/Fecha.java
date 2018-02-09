package ej1.test;

public class Fecha {
  private int dia;
  private int mes;
  private int agno;

  public Fecha (int dia, int mes, int agno) {
    this.dia = dia;
    this.mes = mes;
    this.agno = agno;
  }
  
  public int getDia () { return this.dia; }

  public int getMes () { return this.mes; }

  public int getAgno () { return this.agno; }

  public void setDia (int dia) { this.dia = dia; }

  public void setMes (int mes) { this.mes = mes; }

  public void setAgno (int agno) { this.agno = agno; }

  public String toString() { return this.dia + "/" + this.mes + "/" + this.agno; }

  public boolean equals (Object o) {
    Fecha c = (Fecha) o;

    return this.dia == c.getDia()
           && this.mes == c.getMes()
           && this.agno == c.getAgno()
           ? true : false;
  }

  public int compareTo (Object o) {
    Fecha c = (Fecha) o;

    if (this.agno > c.getAgno()) {
      return 1;
    } else if (this.agno == c.getAgno()) {
      if (this.mes > c.getMes()) {
        return 1;
      } else if (this.mes == c.getMes()) {
        if (this.dia > c.getDia()) {
          return 1;
        } else if (this.dia == c.getDia()) {
          return 0;
        }
      }
    }
    return -1;
  }
}
