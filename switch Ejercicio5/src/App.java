import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.print("Calificación de examen [1-5]: ");
        nota = sc.nextInt();
        sc.close();
        switch (nota) {
            case 0:
                System.out.print("ULTRA-FRACASO");
                break;
            case 1:
                System.out.print("FRACASO");
                break;
            case 2:
                System.out.print("SUSPENSO");
                break;
            case 3:
                System.out.print("APROBADO");
                break;
            case 4:
                System.out.print("NOTABLE");
                break;
            case 5:
                System.out.print("SOBRESALIENTE");
                break;
            default:
                System.out.print("...DATO MAL INTRODUCIDO...");
                break;
        }

    }
}
