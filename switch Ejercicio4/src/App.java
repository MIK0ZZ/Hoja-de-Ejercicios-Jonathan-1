import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean encendido = true;
        int respuesta;
        while (encendido == true) {
            System.out.println("--------------------------------------");
            System.out.println("|[1] Mostrar información");
            System.out.println("|[2] Editar perfil");
            System.out.println("|[3] Salir");
            System.out.println("--------------------------------------");
            System.out.print("Que desea hacer: ");
            respuesta = sc.nextInt();
            
            switch (respuesta) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush(); 
                    System.out.println("INFORMACIÓN INFORMACIÓN INFORMACIÓN INFORMACIÓN INFORMACIÓN INFORMACIÓN INFORMACIÓN INFORMACIÓN ");
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush(); 
                    System.out.println("AQUI PUEDES MODIFICAR TU PERFIL");
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.flush(); 
                    System.out.println("Apagando...");
                    sc.close();
                    encendido = false;
                    break;
                default: System.out.println("Vuelva a intentarlo");
            }

        }
    }
}
