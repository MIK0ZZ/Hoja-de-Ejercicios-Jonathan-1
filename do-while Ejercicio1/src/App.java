import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        int unoaldiez = 1;
        System.out.print("Dime un número y te digo su tabla de multiplicar: ");
        numero = sc.nextInt();
        
        sc.close();

        do {
            System.out.println(numero + " x " + unoaldiez + " = " + numero*unoaldiez);
            ++unoaldiez;
        } while (unoaldiez < 11);
        
        //efectivamente, he hecho ctrl c, ctrl v de el ejercicio 3 de los bucles for, no me escondo.
    }
}
