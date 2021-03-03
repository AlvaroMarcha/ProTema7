package actividad2t7;
import java.util.Scanner;
public class Actividad2T7 {
    public static void main(String[] args) {
        //Scanner
        Scanner tec=new Scanner(System.in);
        
        //Array
        String alfanumericos[]=new String[10];
        int posicion=0;
        //Pedimos por teclado
        System.out.println("Introduce 10 elementos alfanumericos. ");
        for(int i=0; i<alfanumericos.length; i++){
            System.out.print(">_ ");
            alfanumericos[i]=tec.nextLine();
        }
        System.out.println("Números introducidos.");
        
        for(int i=0; i<alfanumericos.length; i++){
            posicion=i;
            //Posicion par
            if(posicion%2==0){
                System.out.println("Par "+alfanumericos[i]);
            //Posicion impar
            }else{
                System.out.println("Impar "+alfanumericos[i]);
            }
        }
        
     
        
    }
    
}
