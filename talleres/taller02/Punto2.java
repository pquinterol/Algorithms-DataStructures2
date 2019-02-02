
/**
 * Write a description of class Punto1 here.
 * 
 * @author (Santiago Duque) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Punto2
{
   public static void main(String[] args) {
        // TODO code application logic here
       Scanner lector=new Scanner(System.in);
       String s=lector.next();
       SubConjuntos(s);
    }
    
    
        public static void SubConjuntos(String s)
   {
       SubConjuntosAux("",s);
   }
   
   public static void SubConjuntosAux(String respuesta,String pregunta)
   { 
    if(pregunta.length()==0)
    {
      System.out.println(respuesta);
    }
    else
    {
       
      SubConjuntosAux(respuesta,pregunta.substring(1));
      
      SubConjuntosAux(respuesta+pregunta.substring(0,1),pregunta.substring(1));
    }
   }
}
