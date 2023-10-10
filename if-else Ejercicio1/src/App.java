import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int respuesta;

        System.out.print("Hey tio, ¿que has sacado en el examen? (Del 0 al 100): ");
        respuesta = sc.nextInt();
        if (respuesta >= 60){
            System.out.println("Joder cabrón has aprobado, yo he suspendido x'd");
        } else {System.out.println("jsjsjsjs yo tambien he suspendio xD");}


        sc.close();
    }
}
