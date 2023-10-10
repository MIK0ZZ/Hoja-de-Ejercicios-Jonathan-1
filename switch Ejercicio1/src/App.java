import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        System.out.print("Dime un número del 1 al 7 y te diré a que día de la semana corresponde: ");
        respuesta = sc.nextInt();
        sc.close();
        switch (respuesta) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miércoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sábado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("Bro eres gilipollas? Te he dicho del 1 al 7 xd");
        }
    }
}
