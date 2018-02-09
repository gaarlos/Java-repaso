package ej2.test;

public class Test {
  public static void main (String [] args) {
    MisMetodos mm = new MisMetodos();
    System.out.println(mm.masSeRepite(22454));
  }
}

class MisMetodos {
  public MisMetodos () {}

  public int masSeRepite (int n) {
    int[] nArr = toArray(n);
    int min = 1;
    int dig = 0;
    int aux;

    for (int i = 0; i < nArr.length; i++) {
      aux = repite(nArr, nArr[i]);

      if (aux > min && nArr[i] > dig) {
        min = aux;
        dig = nArr[i];
      }
    }

    if (min == 1)
      return -1;

    return dig;
  }

  public int repite (int[] n, int d) {
    int count = 0;

    for (int i = 0; i < n.length; i++) {
      if (n[i] == d)
        count++;
    }

    return count;
  }

  public int[] toArray (int n) {
    String temp = Integer.toString(n);
    int[] nArr =  new int[temp.length()];

    for (int i = 0; i < temp.length(); i++) {
      nArr[i] = n % 10;
      n /= 10;
    }

    return nArr;
  }
}
