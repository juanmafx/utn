/*
Arreglos videminecionales 

Crear ua matrizde  5x5 llenar con zeros cada posicion.

Lalenar la matriz con numeros del 0 al 100 alazar.

Calcular la suma de cada fila.

Mostrar todos los emlementos de la diagonal principal.

Mostrar todos los elementos de la diagonal opuesta.

Sumar los elemensitr de ka nudas uzqyuerda


En una EMregistran la temeperatruda  en cuatro puntos de la ciudad

Se nessita un programa quje permitaq eingrersdar los valores de las temeperatuda en el informe 28 temeratrudeas 

Promediol de las temeperaturasd
promedio en cada pounto
promedio en la  dia. 
dias mas caluroso
Lugares y dia de la mejor remprearuda refisterdad





 */
package arreglosbidimencionales;

import java.util.*;

/**
 *
 * @author alumno
 */
public class ArreglosBidimencionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random r = new Random();
        int fs = 0;

        // Crea la matriz de 
        int m[][];
        m = new int[5][5];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = r.nextInt(4);

            }

        }

        // Miestra la matris
        for (int x = 0; x < m.length; x++) {
            System.out.println("+    -  -     +  -   -   -+- -   -   -   -   -   -   -+- -   -   -   -   -   -   -   -+----------+");

            for (int y = 0; y < m[x].length; y++) {
                System.out.printf("| %4d   ", m[x][y]);
            }
            System.out.println("|");
        }

        // Sumar Fila
        for (int i = 0; i < 5; i++) {
            fs = 0;
            for (int j = 0; j < 5; j++) {

                fs = fs + m[i][j];
            }
            System.out.println("Suma filas " + fs);

        }

        //  Mostrar todos los emlementos de la diagonal principal
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Mostrar todos los emlementos de la diagonal principal.");
        
        System.out.println("+    -  -     ++    -  -     ++    -  -     ++    -  -     ++    -  -     +  -   -   -+-+");
        for (int x = 0; x < m.length; x++) {

            System.out.printf("| %10d   ", m[x][x]);
        }
        System.out.println("\n+    -  -     ++    -  -     ++    -  -     ++    -  -     ++    -  -     +  -   -   -+-+");

        //  Mostrar todos los emlementos de la diagonal opuesta
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Mostrar todos los emlementos de la diagonal opuesta");
        System.out.println("+    -  -     ++    -  -     ++    -  -     ++    -  -     ++    -  -     +  -   -   -+-+");
        
        for (int x = 0; x < m.length; x++) {

            System.out.printf("| %10d   ", m[x][x]);
        }
        System.out.println("\n+    -  -     ++    -  -     ++    -  -     ++    -  -     ++    -  -     +  -   -   -+-+");

    }

}
1
