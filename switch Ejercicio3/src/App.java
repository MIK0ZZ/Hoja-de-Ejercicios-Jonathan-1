import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String moneda;
        float dinero;
        System.out.print("Introduzca la moneda que esta usando [$/'e']: ");
        moneda = sc.next();
        System.out.print("Introduzca la cantidad de '"+moneda+"'"+" : ");
        dinero = sc.nextFloat();
        sc.close();
        switch (moneda) {
            case "$":
                System.out.println(dinero + " dólares son: " + (dinero*0.94) + " euros");
                break;
            case "e":
                System.out.println(dinero + " euros son: " + (dinero*1.06) + " dólares");
                break;
            default:
                System.out.println("El tipo de moneda introducido no es correcto, intentelo de nuevo...");
        }
    }
}
