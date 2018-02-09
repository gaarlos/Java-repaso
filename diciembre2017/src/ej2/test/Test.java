package ej2.test;

public class Test {
  public static void main (String [] args) {
    // TEST A
    MisMetodos mm = new MisMetodos();
    System.out.println(mm.repite(1234789111, 1));

    // TEST B
  }
}

class MisMetodos {
  public MisMetodos () {}

  public int repite (int n, int d) {
    int[] nArr = toArray(n);
    int count = 0;

    for (int i = 0; i < nArr.length; i++) {
      if (nArr[i] == d)
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
