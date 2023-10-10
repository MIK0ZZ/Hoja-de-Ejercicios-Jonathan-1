import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float num1;
        float num2;
        String operacion;
        System.out.println("Dime dos números y una operación (suma, resta, etc...) y te la hago champion: ");
        System.out.print("Primer número: ");
        num1 = sc.nextFloat();
        System.out.print("Operador: ");
        operacion = sc.next();
        System.out.print("Segundo número: ");
        num2 = sc.nextFloat();
        
        sc.close();
        switch (operacion) {
            case "+":
                System.out.println("Suma: "+ (num1 + num2));
                break;
            case "-":
                System.out.println("Resta: "+ (num1 - num2));
                break;
            case "*":
                System.out.println("Multiplicación: "+ (num1 * num2));
                break;
            case "/":
                System.out.println("División: "+ (num1 / num2) + ", de resto: " +(num1%num2));
                break;
            default:
                System.out.println("Algo has hecho mal, intentalo de nuevo");
                break;
        }   
    }
}