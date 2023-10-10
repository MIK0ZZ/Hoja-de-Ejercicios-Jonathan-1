import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        System.out.print("Dime un número y te digo los números desde ese hasta el 1: ");
        respuesta = sc.nextInt();
        sc.close();
        for (; respuesta > 0; --respuesta) {
            System.out.println(respuesta);
        }
    }
}
