import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        /*  Para borrar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush(); */

        Scanner sc = new Scanner(System.in);
        
        int n_random = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        
        int respuesta = 0;
        

        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int intentos = 10; intentos != 0;) {

            for (int acierto = 0; acierto < 1 ;) {
            System.out.println("---------------------------------");
            System.out.println("Intentos restantes: " + intentos);
            System.out.println("Respuesta anterior: " + respuesta);
            System.out.println("---------------------------------");
        
            System.out.print("Número desconocido: ");
            respuesta = sc.nextInt();
            if (respuesta == n_random) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Buena");
                acierto++;
                intentos = 0;
                sc.close();
                
            } else if (respuesta < n_random) {
                intentos--;
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Te has quedado CORTO");
            } else if (respuesta > n_random) {
                intentos--;
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Te has PASADO");
            }
            
            if (intentos == 0) {
                break;
                
            }

            } 
        }   
    }
}
