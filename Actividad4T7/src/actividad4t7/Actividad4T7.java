package actividad4t7;
import java.util.Scanner;
public class Actividad4T7 {
    public static void main(String[] args) {
        //Scanner
        Scanner tec=new Scanner(System.in);
        
        //Array
        int[] numeros=new int[10];
        int posicion=0;
        //Pedimos por teclado
        System.out.print("Introduce 10 números. ");
        for (int i=0; i<numeros.length; i++) {
            System.out.print("\n>-. ");
            numeros[i]=tec.nextInt();
            posicion=i;
           //Números pares
            if(posicion%2==0){
                System.out.println("Par, Posición: "+(i+1));
            }else{
                System.out.println("Impar, Posición: "+(i+1));
            }
        }
    }
    
}
