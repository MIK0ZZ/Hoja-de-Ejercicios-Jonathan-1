import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        int digitos = 0;
        System.out.print("Dime un número y te digo la cantidad de dígitos que tiene: ");
        numero = sc.nextInt();
        sc.close();
        if (numero>=0){
            while (numero>0) {
                numero = numero / 10;
                digitos++;
            } System.out.println(digitos);
        } else {
            while (numero<0) {
                numero = numero / 10;
                digitos++;
            } System.out.println(digitos);
        }
            

    }
}
