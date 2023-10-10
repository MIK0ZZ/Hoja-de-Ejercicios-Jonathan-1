import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        int factorial = 1;
        int subiendo = 1;
        System.out.print("Dime un número entero positivo y te digo sus factoriales: ");
        numero = sc.nextInt();
        sc.close();
        if (numero > 0) {
            for (;subiendo < (numero+1); subiendo++) {
                factorial = factorial * subiendo;
                System.out.println(factorial);
            } System.out.println("Resultado: "+ factorial);
        } else {System.out.println("Si no te lo vas a tomar enserio paso");}
    }
}
