```
2ª Evaluación. ARRAYS
27 de febrero de 2015
```

##### [1. Diseñar un método ...eliminar(...)](ej1.java)

que reciba un array a de n elementos y elimine todos los elementos menores que la media.


##### [2. Diseñar un método cribaEratostenes()](ej2.java)

que recibe un array a de n elementos con los números de 1 a n y lo modifica para que sólo contenga los números primos. 


Para esto se deben seguir los siguientes pasos:

    - Se elimina el 1
    - Se eliminan todos los pares excepto el 2: **2** 3 5 7 9 11 13 15 17 19 21 23 25 27 29
    - Se eliminan todos los múltiplos de 3 excepto el 3: 2 **3** 5 7 11 13 17 19 23 25 29...
    - Se elimina todos los múltiplos de 5 excepto el 5: 2 3 5 7 11 13 17 19 21 29...
    - Etc.


##### [3. Diseñar un método paresImpares()](ej3.java)

que recibe un array a de n números enteros (int[]a, int n), ordenar el array colocando en la parte superior todos los pares y en la parte inferior los impares. No se podrá crear ningún otro array y se ordenan los pares y los impares por separado.


 - Paso1, separo pares e impares 8 4 22 2 6 34 54 62 7 3 5 21 33 1

 - Paso 2, ordeno 2 4 6 8 22 34 54 62 1 3 5 7 21 33


##### [4. Dado un array de caracteres:](ej4.java)

char [] a de contenido
    A B C D E F G H I J K L M N O P Q R S T U V W X Y Z


Diseñar un método cifrar() que recibe un mensaje (array de caracteres de n
caracteres) y un número d de desplazamiento, cifre el mensaje modificando cada
carácter de mensaje con el correspondiente desplazado d posiciones en el array.

```
Ejemplo mensaje E X A M E N -> Para desplazamiento 5 -> J C F R J S
```


##### [5. Realizar un método](ej5.java)

```
public static int composición(char [] texto, int n, int m) {...}
```

que recibe un array de caracteres texto, de n caracteres y visualiza línea a línea
su contenido.

Una **línea** es un array de m elementos de tipo char extraído de texto. No se podrá
romper palabras, los caracteres hasta alcanzar los m elementos serán espacios en
blanco. Una palabra está separada de otra por un carácter en blanco.

El método cada vez que extrae de texto una línea, elimina su contenido de texto.
El método devolverá el nuevo n.

**En un lugar de la Mancha de cuyo nombre no quiero acordarme no ha mucho
tiempo vivía un hidalgo de los de lanza en astillero y adarga antigua rocín flaco y
galgo corredor...**

Si m = 25 la primera línea será **En un lugar de la Mancha**

Las palabras están separadas por un blanco.

No se podrán romper las palabras

El nuevo texto: **de cuyo nombre no quiero acordarme no ha mucho tiempo vivía un
hidalgo de los de lanza en astillero y adarga antigua rocín flaco y galgo corredor...**

| num_pal | linea                    |
|---------|--------------------------|
| 6       | En un lugar de la Mancha |
| 5       | de cuyo nombre no quiero |
| 4       | acordarme no ha mucho    |
| 4       | tiempo vivía un hidalgo  |
| ...     | ...                      |

con m = 25 en el ejemplo