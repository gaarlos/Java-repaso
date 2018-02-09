```
1ª Evaluación.
14 de diciembre de 2017
```

#### [1. Dadas las clases LeerMostrarDatos y Fecha ya diseñadas (en última hoja).](ej1)

Diseñar una clase Cuenta, con los atributos
```
- numeroCuenta (int),
- saldo (double),
- fechaAlta (Fecha),
- numeroDeIngresos (int),
- numeroDeRetiradas (int).
```

[a. Diseñar un método estático en LeerMostrarDatos:](ej1/a.java)

```java
public static Cuenta leerCuenta () {...}
```
que nos proporcione un objeto Cuenta, con ```numeroCuenta```, ```saldo = 0```, ```fechaAlta```, ```numeroDeIngresos = 0``` y ```numeroDeRetiradas = 0```
**(0.5 puntos)**


[b. Crear un método llamado ingreso() de la clase Cuenta](ej1/b.java)

que recibe como parámetro la cantidad que
se va a ingresar (double). La cantidad se incrementa al saldo. Cada vez que se realiza un ingreso se
incrementará elnúmeroDeIingresos


Crear un método retirar() de la clase Cuenta que reciba la cantidad que se va a retirar (double).El
saldo no puede ser negativo. En caso de que se pretenda retirar una cantidad superior al saldo se
retirará sólo hasta dejar el saldo a 0. El método retirar() devolverá true si se pudo realizar la
operación con éxito(se retira la cantidad pedida) y false en caso contrario. La cantidad que se retira
se resta del saldo.Cada vez que se realiza una retirada se incrementaránumeroDeRetiradas.
**(1 punto)**


[c. Diseñar el método public boolean equals (Object o)](ej1/c.java)

tomando como criterio la fecha de alta (fechaAlta), el saldo de cada Cuenta y la diferencia entre el número de ingresos y retiradas en cada cuenta. Será iguales si las fechas de alta,el saldo y esta diferencia son iguales y distintos en caso
contrario.
**(1 punto)**

[d. Diseñar el método **public int compareTo(Object o)** de acuerdo al mismo criterio.](ej1/d.java)

Devolverá 1, 0 ó -1, según el caso.
**(1 punto)**

[e. Diseñar el método **public String toString()**](ej1/e.java)

de manera que aparezca numeroCuenta, saldo, fecha de
alta y has realizado más ingresos o has realizado más retiradas de dinero según sea el caso.
**(0.25 puntos)**

[f. Crear en una **clase** llamada **Test** que permita crear dos cuentas](ej1/test/Test.java)

y hacer un depósito y un retiro en cada cuenta. Visualizar el estado de las dos cuentas y comparar estas dos cuentas mostrando un mensaje ```“LA CUENTA DE NUMERO” ..... “ES MAYOR QUE LA CUENTA” ...``` (Rellenar ... con los números de cuenta correspondientes)
**(0.25 puntos)**

#### [2. Algoritmica.](ej2)

[a. Diseñar un metodo repite() que permita obtener el número de veces que aparece un dígito (de 0 a 9)](ej2/a.java)


en un número entero de n cifras. Se mostrará el resultado.
Por ej: 215610 si el dígito es 1 mostraría 2 (el 1 se repite 2 veces)
**(0.5 puntos)**

[b. Diseñar un algoritmo que nos permita obtener cuál es el dígito más repetido](ej2/b.java)

en un número de n cifras.

```
Por ej.: 31 333 el dígito más repetido es el 3 que se repite 4 veces
```

* Si no se repite ninguno de los dígitos (todos los dígitos son distintos) se mostrará un mensaje
“NO HAY DÍGITOS REPETIDOS”
* Si hay dos o más dígitos que se repiten el mismo número de veces se mostrará el mensaje
“VARIOS DÍGITOS SON LOS QUE MÁS SE REPITEN”
* Si hay un único dígito que es el que más se repite se mostrará el mensaje
> “EL DÍGITO QUE MÁS SE REPITE ES:” digitoRepetido
**(1 punto)**

[c. Diseñar en Java un método estático en MisMetodosmas seRepite()](ej2/c.java)
que reciba un número de n cifras y devuelva

* \-1 si ninguno se repite
* El dígito si existe alguno que se repite un mayor número de veces.
* Cuando hay varios que se repiten se devolverá el mayor de todos ellos.

Por ej.: 22454 se devolvería el 4 que se repite el mismo número de veces que el 2, pero 4 es mayor que 2.
**(0.5 puntos)**

#### [3. Los números Catalán deben su nombre al matemático belga Eugène Catalan (1814-1894).](ej3)

1,2,5 ,14, 42 ,132, 429 ,1430,4862,16796, 58786 ,208012,... números Catalan para n=1,2, ...

El número Catalán n: catalanN = (2*n)!
(n+1)!*n!

```
a. Se pide diseñar un método main () que nos permita calcular la suma de los primeros x
números Catalán solo para los n que sean primos n=1,2,3,5,7,11,13, ...
Por ej. si x =7 se sumarían los catalán para n =1,2,3,5,7,11,
(puede resolverse mediante Nassi-Schneiderman ó en Java)
```
**(4 puntos)**

##### Clases prediseñadas

```java
public class LeerMostrarDatos {
  public static int leerEntero () {
    int n;
    Scanner teclado = new Scanner(System.in);
    n = teclado.nextInt();
    return n;
  }

  public static int leerDouble () {
    double n;
    Scanner teclado = new Scanner(System.in);
    n = teclado.nextDouble();
    return n;
  }

public static int leerString () {
    String s;
    Scanner teclado = new Scanner(System.in);
    s = teclado.next();
    return s;
  }
}
```

```java
public class Fecha {
  private int dia;
  private int mes;
  private int año;

  public Fecha () {
    ...
  }

  public Fecha (intdia, int mes, int año) {
    this.dia = dia;
    this.mes = mes;
    this.año = año;
  }
  
  public int get ... () {
    return...
  }

  public void set.. (int ...) {
    this.... = ...;
  }

  public boolean equals (Object o) {
    ...
  }

  public int compareTo (Object o) {
    ...
  }

  public String toString () {
    ...
  }
}
```