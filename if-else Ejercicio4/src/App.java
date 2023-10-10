import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int year_u;
        int year = 2023;
        int year_n;
        System.out.print("Introduzca su año de nacimiento: ");
        year_u = sc.nextInt();
        
        
        if (year_u >= year) {
            System.out.println("Usted no ha nacido todavia...");
        } else {
            year_n = year - year_u;
            System.out.print("Usted tiene: " + year_n + " años");
        }

        sc.close();

    }
}
