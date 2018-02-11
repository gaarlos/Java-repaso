package ej2;

class MisMetodos {
  public static Lista obtenerBinario (int numero) {
    Lista binario = new Lista();
    while (numero > 1) {
      binario.add(numero % 2);
      numero = (numero - (numero % 2)) / 2;
    }
    binario.add(numero);

    while (binario.getSize() < 8) { binario.add(0); }

    complementoDos(binario);
    return binario;
  }

  private static void complementoDos (Lista binario) {
    Nodo p = binario.getComienzo();
    int info;

    while (p != null) {
      info = p.getInfo() == 0 ? 1 : 0;
      p.setInfo(info);
      p = p.getSig();
    }
  }
}
