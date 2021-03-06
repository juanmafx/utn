/*
Eje 10
Calcular las raíces de un polinomio de segundo grado.
Mostrar un mensaje indicando si son reales o imaginarias.
Si son reales distintas, mostrar sus dos valores, 
si son reales iguales, mostrar solo una.
Discriminante  determina la naturaleza de las raíces de la ecuación
(considerando coeficientes reales) y se pueden presentar 3 situaciones:
Si Δ es negativo, ambas raíces son números complejos.
Si Δ es igual a cero, existen dos raíces reales e iguales, por lo tanto hay una solución.
Si Δ es positivo, ambas raíces son reales y distintas.
*/ 

import java.util.*;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
public class ej10enu1{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
double detmin;
double rdetmin;
double r1=0;
double r2=0;

System.out.println("Ingrese coeficiente de grado 2 (a):");
int a = sc.nextInt();

System.out.println("Ingrese coeficiente de grado 1 (b):");
int b = sc.nextInt();

System.out.println("Ingrese coeficiente de grado 0. (c):");
int c = sc.nextInt();

detmin = (b*b) - (4*a*c);
rdetmin = sqrt(detmin);

if (detmin > 0){
	r1=(-b + rdetmin)/(2*a);
	r2=(-b - rdetmin)/(2*a);
	System.out.println("Las raices del polinomio son R1 = " + r1 + " y R2 = " + r2);
}

if (detmin == 0){
	r1= -b/(2*a);
	r2= r1;
	System.out.println("Las raices del polinomio son iguales  = " + r1 + " y  R2 = " + r2);
}

if (detmin <= 0){
System.out.println(" Las raices  son complejas  por un determinante negativo "+ detmin);
}
	
}
}
