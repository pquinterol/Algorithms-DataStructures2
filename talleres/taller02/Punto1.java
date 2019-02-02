/**
 * Write a description of class Punto2 here.
 * 
 * @author (Santiago Duque) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Punto1
{
//GERERAMOS LOS ATRIBUTOS DE LA CLASE
static String [] Herra={"martillo","hacha","piedra","chaleco","cuchillo","pistola","fusil","casco","balas","botiquin"};   
static int [] Peso ={5,6,2,7,6,10,12,6,3,3};
    public static void main(System [] args)
{
   Avatar();
}
//CREAMOS NUESTRO AVATAR (NOMBRE Y CAPACIDAD)
public static void Avatar()
{
    int peso;
    Scanner lector=new Scanner(System.in);
    System.out.println("BIENVENIDO AL JUEGO");
    System.out.println("INGRESE EL NOMBRE DE SU AVATAR ");
    String nombre=lector.next();
    System.out.println("INGRESE EL TIPO MDE AVATAR");
    System.out.println("1.Monstruo");
    System.out.println("2.Hombre");
    System.out.println("3.Pirata");
    int x=lector.nextInt();
    if(x==1)
    {
        peso=30;
        ConjuntoP(nombre,peso);
    }
    if(x==2)
    {
        peso=40;      
        ConjuntoP(nombre,peso);
    }
    if(x==3)
    {
        peso=50;
        ConjuntoP(nombre,peso);
    }
    
}
//IMPRIMIMOS EL CONJUNTO POTENCIA
public static void ConjuntoP(String nombre,int peso)
{
    System.out.println("Avatar: "+nombre);
    System.out.println("Capacidad: "+peso);
    System.out.println("");
    System.out.println("CONJUNTO DE HERRAMIENTAS DISPONIBLES: ");
    for(int i=0;i<Herra.length;i++)
    {
        System.out.println("| "+Herra[i]+" | "+" | "+Peso[i]+" |");
    }
    SubConjuntos(peso);
}
//GENERAMOS 3 SUBGRUPOS DEL CONJUNTO POTENCIA
public static void SubConjuntos(int peso)
{
    int numero = (int) (Math.random() * 9);
    int conta=0;
    int contb=0;
    int contc=0;
    ArrayList<String> a= new ArrayList<String>();
    ArrayList<String> b= new ArrayList<String>();
    ArrayList<String> c= new ArrayList<String>();
    while(conta<peso)
    {
        a.add(Herra[numero]);
        conta=conta+Peso[numero];
        numero = (int) (Math.random() * 9);
    }
    while(contb<peso)
    {
        b.add(Herra[numero]);
        contb=contb+Peso[numero];
        numero = (int) (Math.random() * 9);
    }
    while(contc<peso)
    {
        c.add(Herra[numero]);
        contc=contc+Peso[numero];
        numero = (int) (Math.random() * 9);
    }
    System.out.println("ESTAS SON LAS POSIBLES HERRAMIENTAS QUE USTED PUEDE ESCOGER CON RESPECTO AL PESO DE SU AVATAR");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}
}
