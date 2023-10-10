import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        int numero = 1;
        int suma = 0;
        System.out.print("Dime un número y te sumo todos los pares desde el 1 hasta ese número: ");
        respuesta = sc.nextInt();
        sc.close();
        do {
            numero++;
            if ((numero%2)==0){
                
                System.out.println("numeros par: " + numero);
                suma = suma + numero;
                
            } else {}
        } while (numero < (respuesta+1));

    }
}
