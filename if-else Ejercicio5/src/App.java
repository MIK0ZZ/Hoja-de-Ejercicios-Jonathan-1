import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int respuesta;

        System.out.print("Introduzca un número para ver si se encunetra entre el 0 o el 100: ");
        respuesta = sc.nextInt();
        if (respuesta >= 0 && respuesta <= 100) {
            System.out.println("Efectivamente, se encuentra dentro");
        } else {System.out.println("No, no se encuentra entre el rango indicado");}

        sc.close();
    }
}
