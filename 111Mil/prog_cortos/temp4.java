import java.util.*;

public class tem4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double prom;
double ampt;
double may = 0;
double men = 0;
    
System.out.println("Ingrese cuatro temeperaturas:");
double t1 = sc.nextInt();
double t2 = sc.nextInt();
double t3 = sc.nextInt();
double t4 = sc.nextInt();

prom =( t1 +t2 +t3 +t4)/4;

if( (t1>t2)  && (t1>t3)  &&  (t1>t4)    )
    may=t1;

if ( (t2>t1) && (t2>t3)  &&  (t2 > t4)  )
    may=t2;

if (  (t3>t1) && ( t3>t2 ) && (t3 >t4)  )
    may = t3;

if (  (t4>t1) && ( t4>t2 ) && (t4 >t3)  )
    may = t4;


if( (t1<t2)  && (t1<t3)  &&  (t1<t4)    )
    men=t1;

if ( (t2<t1) && (t2<t3)  &&  (t2 < t4)  )
    men=t2;

if (  (t3<t1) && ( t3<t2 ) && (t3 <t4)  )
    men = t3;

if (  (t4<t1) && ( t4<t2 ) && (t4 <t3)  )
    men = t4;

ampt = may-men;



System.out.println("El promedio de temeraruras es igual a  = "+ prom);
System.out.println("La amplitud termica es  = "+ ampt);

if (t1<prom)
        System.out.println("La temperatura T1 es menor al promedio  " + t1);
if (t1<prom)
        System.out.println("La temperatura T2 es menor al promedio  " + 2);
if (t1<prom)
        System.out.println("La temperatura T3 es menor al promedio  " + t1);





    
}
}
