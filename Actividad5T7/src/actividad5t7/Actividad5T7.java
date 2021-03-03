package actividad5t7;
import java.util.Scanner;
public class Actividad5T7 {
    public static void main(String[] args) {
        //Escribe un programa que permita leer una secuencia de 50 números, 
        //guardarlos en un vector. Calcular e imprimir la suma de aquellos cuyo 
        //contenido sea par.
        
        //Instancia Scanner
        Scanner tec=new Scanner(System.in);
        int sumador=0;
        //Array
        int[] numeros=new int[5];
        
        System.out.println("Introduce 5 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=tec.nextInt();
            if(numeros[i]%2==0){
                sumador+=numeros[i];
            }
            
        }
        System.out.println("La suma de los números pares es: "+sumador);
        
        
        
    }
    
}
