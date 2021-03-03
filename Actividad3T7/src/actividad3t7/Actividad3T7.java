package actividad3t7;
import java.util.Arrays;
import java.util.Scanner;
public class Actividad3T7 {
    public static void main(String[] args) {
        //Scanner
        Scanner tec=new Scanner(System.in);
        
        //Array
        int[] numeros=new int[20];
        
        //Pedimos por teclado
        System.out.println("Introduce 20 numeros. ");
        for(int i=0; i<numeros.length; i++){
            System.out.print(">-.");
            numeros[i]=tec.nextInt();
        }
        
//        int[] numeros1To4=Arrays.copyOfRange(numeros, 0, 4);
//        System.out.println("1 al 4 "+Arrays.toString(numeros1To4));
//        
//        int[] numeros5To8=Arrays.copyOfRange(numeros, 4, 8);
//        System.out.println("5 al 8 "+Arrays.toString(numeros5To8));
//        
//        int[] numeros9To12=Arrays.copyOfRange(numeros, 8, 12);
//        System.out.println("9 al 12 "+Arrays.toString(numeros9To12));
//        
//        int[] numeros13To16=Arrays.copyOfRange(numeros, 12, 16);
//        System.out.println("13 al 16 "+Arrays.toString(numeros13To16));
//        
//        int[] numeros17To20=Arrays.copyOfRange(numeros, 16, 20);
//        System.out.println("17 al 20 "+Arrays.toString(numeros17To20));
        
      
        
        
        for (int i=0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
            if((i+1)%4==0){
                System.out.println("");
            }
        }
    }
    
}
