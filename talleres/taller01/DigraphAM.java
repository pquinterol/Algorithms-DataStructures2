/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.pkg2;
import java.util.Scanner;
/**
 *
 * @author Santiago duque
 */
public class DigraphAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //creamos el grafo.
       System.out.println("Ingrese la cantidad de Nodos del Grafo");
       Scanner lector=new Scanner(System.in);
       int size=lector.nextInt();
       int MaGra[][]=new int [size][size];
       int x;
       int y;
       int peso;
       int aris;
       //Asignamos el peso de la arista que une al nodo origen y llegada.
       System.out.println("Ingrese la cantidad de aristas que tiene en Grafo");
       aris=lector.nextInt();
       for(int i=0; i<aris;i++)
       {
       System.out.println("Ingrese el nodo de origen");
       x=lector.nextInt();
       System.out.println("Ingrese el nodo de llegada");
       y=lector.nextInt();
       System.out.println("Ingrese el peso de cada arista");
       peso=lector.nextInt();
       MaGra [x][y]=peso;
       MaGra [y][x]=peso;
       }
       
                
      //Metodo para obtener una lista de hijos desde un nodo, es decir todos los nodos
      //asociados al nodo pasado como argumento.
      System.out.println("Ingrese el nodo por el que desea averiguar sus conexiones");
      int origen=lector.nextInt();
      int act;
      for(int i=0;i<size;i++)
      {
          act=MaGra[origen][i];
          
          if(act>0)
          {
              
              System.out.println("EXISTE CONEXION ENTRE: "+origen +" y "+i);
          }
          else
          {
              System.out.println("NO EXISTE CONEXION ENTRE: "+origen +" y "+i);
          }
      }
      
      //Obtener el peso entre dos nodos
      
        System.out.println(">>>AVERIGUAR PESO ENTRE DOS NODOS<<<");
        System.out.println("");
        System.out.println("Ingrese el nodo de origen");
        System.out.println("");
        int or=lector.nextInt();
        System.out.println("Ingrese el nodo de llegada");
        int lle=lector.nextInt();
        int pe=MaGra[or][lle];
        System.out.println("El peso es: "+pe);    

    }
}
