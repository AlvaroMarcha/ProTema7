package actividad6t7;
import java.util.Scanner;
public class Actividad6T7 {
    public static void main(String[] args) {
        //Scanner
        Scanner tec=new Scanner(System.in);
        
        //Array
        int[] numeros=new int[10];
        
        //Pedimos por teclado
        System.out.println("Introduce 10 números. ");
        for (int i=0; i<numeros.length; i++) {
            System.out.print("-. ");
            numeros[i]=tec.nextInt();
        }
        
        for (int i=0; i<numeros.length; i++) {
            if(numeros[i]%2==0){
                System.out.println("Contenido = "+numeros[i]+" Par, posición: "+(i+1));
            }else{
                System.out.println("Contenido = "+numeros[i]+" Impar, posición: "+(i+1));
            }
            if(numeros[i]%3==0){
                System.out.println("Son números múltiplos de 3 - "+numeros[i]);
            }
            
        }
    }
    
}
