/*
5 Postulantes a un empleo
Se tienen los datos de tres postulantes a un empleo, 
a los que se les realizó un test de capacitación. 
Por cada postulante, se tiene entonces la siguiente información:
 nombre del postulante, cantidad total de preguntas que se le realizaron 
 cantidad de preguntas que contestó correctamente. 
 Se pide confeccionar un programa que lea los datos de los tres postulantes,
 informe el nivel de cada uno según los criterios de aprobación que se indican mas abajo, e indique finalmente el nombre del postulante que ganó el puesto. Los criterios de aprobación son los siguientes, en función del porcentaje de respuestas correctas sobre el total de preguntas realizadas a cada postulante:
Nivel Superior:       Porcentaje >= 90%
Nivel Medio:          75% <= Porcentaje < 90%     
Nivel Regular:        50% <= Porcentaje < 75%
Fuera de Nivel:       Porcentaje < 50%
*/

import java.util.*;
public class ej5enu1 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double ppc1;
String rango1="";
double ppc2;
String rango2="";
double ppc3;
String rango3="";

System.out.println("Nombre postulante 1:");
String p1 = sc.next();
System.out.println("Cantidad de Preguntas Correctas de "+p1+ " ?");
double pc1 = sc.nextDouble();
System.out.println("Cantidad de preguntas Totals de "+p1+ " ?");
double pt1 = sc.nextDouble();

System.out.println("Nombre postulante 2:");
String p2 = sc.next();
System.out.println("Cantidad de Preguntas Correctas de "+p2+ " ?");
double pc2 = sc.nextDouble();
System.out.println("Cantidad de preguntas Totals de "+p2+ " ?");
double pt2 = sc.nextDouble();

System.out.println("Nombre postulante 3:");
String p3 = sc.next();
System.out.println("Cantidad de Preguntas Correctas de "+p3+ " ?");
double pc3 = sc.nextDouble();
System.out.println("Cantidad de preguntas Totals de "+p3+ " ?");
double pt3 = sc.nextDouble();

ppc1 = (pc1/pt1)*100;

if (ppc1 >= 90)
	rango1="superior";
if ((ppc1 >=75) && (ppc1 < 90))
	rango1="medio";
if ((ppc1 >= 50) && ( 75 > ppc1))
	rango1="regular";
if (ppc1 < 50)
	rango1="Fuera de Nivel";

ppc2 = (pc2/pt2)*100;

if (ppc2 >= 90)
	rango2="superior";
if ((ppc2 >=75) && (ppc2 < 90))
	rango2="medio";
if ((ppc2 >= 50) && ( 75 > ppc2))
	rango2="regular";
if (ppc2 < 50)
	rango2="Fuera de Nivel";

ppc3 = (pc3/pt3)*100;


if (ppc3 >= 90)
	rango3="superior";
if ((ppc3 >=75) && (ppc3 < 90))
	rango3="medio";
if ((ppc3 >= 50) && ( 75 > ppc3))
	rango3="regular";
if (ppc3 < 50)
	rango3="Fuera de Nivel";


if (( ppc1 > ppc2 ) && ( ppc1 > ppc3 ))
	System.out.println("El postulante " +  p1 + " Es el ganador del puesto.");

if (( ppc2 > ppc1 ) && ( ppc2 > ppc3 ))
	System.out.println("El postulante " + p2 + " Es el ganador del puesto.");

if (( ppc3 > ppc1 ) && ( ppc3 > ppc2 ))
	System.out.println("El postulante " + p3 + " Es el ganador del puesto.");


System.out.println("El postulante \""+ p1 +"\" posee un nivel "+ rango1 +" con un "+ ppc1 + "% de acierto .");
System.out.println("El postulante \""+ p2 +"\" posee un nivel "+ rango2 +" con un "+ ppc2 + "% de acierto .");
System.out.println("El postulante \""+ p3 +"\" posee un nivel "+ rango3 +" con un "+ ppc3 + "% de acierto .");

}
}
