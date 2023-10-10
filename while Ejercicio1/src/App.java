import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        int i = 1;
        System.out.print("Dime un número y te digo todos los números desde 1 hasta ese: ");
        numero = sc.nextInt();
        sc.close();
        while (numero>0) {
            System.out.println(i++);
            numero--;
        }
    }
}
