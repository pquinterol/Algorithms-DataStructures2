/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller02;


/**
 *
 * @author Pedro Quintero
 */
public class Taller02 {
    
    public static boolean esValido(int[] tablero) {

        for(int i = 0; i<tablero.length; i++){

          for(int j = i+1; j<tablero.length; j++){

            //int operation = Math.abs((tablero[i]-tablero[j])/(i-j));

            if(Math.abs(tablero[i]-tablero[j])==Math.abs(i-j)){

              return false;

            }
          }
        }

        return true;
		
     }
    
    public static int permutaciones(String s){
        
        return permutacionesAux("", s);
        
    }
    
    public static int permutacionesAux(String respuesta, String pregunta){
        
        int num = 0;
        
        if(pregunta.length()==0){
            
            int array[] = new int [respuesta.length()];
            
            for(int i = 0; i<respuesta.length();i++){
                array[i] = Integer.parseInt(respuesta.charAt(i)+"");
                //System.out.print(array[i]);
            }
            //System.out.println("\n"+esValido(array));
            
            if(esValido(array)){
                
                num+=1;
                
            }
            
            
        }else{
            
            for(int i = 0; i<pregunta.length(); i++){
                
                num += permutacionesAux(respuesta+pregunta.charAt(i),pregunta.substring(0,i)+pregunta.substring(i+1));
                
            }
            
        }
        
        return num;
        
    }
    
    
    public static int queens(int n){
        
        String str = "";
        for(int i = 1; i <=n ; i++){
            str+=i;
        }
        return permutaciones(str);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 10;
        System.out.println(queens(n));
        
    }
    
}
