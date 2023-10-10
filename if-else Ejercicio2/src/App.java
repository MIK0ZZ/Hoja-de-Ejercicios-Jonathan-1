import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int respuesta;

        System.out.print("Dime un número cualquiera y te diré si es positivo o negativo: ");
        respuesta = sc.nextInt();
        if (respuesta < 0) {
            System.out.println("Es negativo");
        } else if (respuesta == 0){
            System.out.println("Es 0");
        } else {System.out.print("Es positivo");}


        sc.close();
    }
}
