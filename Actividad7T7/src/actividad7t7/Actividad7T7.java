package actividad7t7;
import java.util.Arrays;
import java.util.Scanner;
public class Actividad7T7 {
    public static void main(String[] args) {
        //Scanner 
        Scanner tec=new Scanner(System.in);
        
        //Array
        int[] numeros=new int[5];
        boolean encontrado=false;
        int posi;
        //Pedimos por teclado
        System.out.println("Introduce 5 números. ");
        for (int i=0; i<numeros.length; i++) {
            System.out.print(">_. ");
            numeros[i]=tec.nextInt();
        }
        
        for (int i=0; i<numeros.length; i++) {
            posi=i;
            if(numeros[i]==0){
                System.out.println("En la posición "+(posi+1)+" esta el valor "+numeros[i]);
                encontrado=true;
                break;
            }
        }
        
        if(!encontrado){
            System.out.println("No se ha encontrado 0");
        }
        
    }
    
}
