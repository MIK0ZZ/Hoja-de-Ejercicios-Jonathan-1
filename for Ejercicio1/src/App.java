import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        int numero = 1;
        System.out.print("Dime un número para contar desde el 1: ");
        respuesta = sc.nextInt();
        sc.close();
        for (;numero < (respuesta+1); numero++){
            System.out.println(numero);
            
        } 
        

        
    }
}
