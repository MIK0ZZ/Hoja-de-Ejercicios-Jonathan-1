import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int respuesta;

        System.out.print("Dime un número y te digo si es par o impar: ");
        respuesta = sc.nextInt();

        if ((respuesta%2) == 0) {
            System.out.println("Es par");
        } else {System.out.println("Es impar");}


        sc.close();
    }
}
