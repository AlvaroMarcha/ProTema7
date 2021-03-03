package actividad1t7;
import java.util.Scanner;
public class Actividad1T7 {
    public static void main(String[] args) {
        //Scanner
        Scanner tec=new Scanner(System.in);
        
        //Array
        int[] numeros=new int[10];
        
        //Pedimos por teclado
        System.out.println("Introduce 10 números.");
        for(int i=0; i<numeros.length; i++){
            System.out.print(">_. ");
            numeros[i]=tec.nextInt();
        }
        
        //Mostramos por pantalla
        System.out.print("Los números son: ");
        for(int numero: numeros){
            System.out.print(numero+" ");
        }
    }
    
}
