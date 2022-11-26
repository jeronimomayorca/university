package methods;

import java.util.Scanner;

public class methods {
    public static void show_menu() {
        Scanner lector_option = new Scanner(System.in);
        Scanner lector_projectors = new Scanner(System.in);
        Scanner lector_conference_title = new Scanner(System.in);
        Scanner lector_pcs = new Scanner(System.in);
        int option;
        System.out.println("Bienvenido, ¿Cuál es su nombre?");
        String name = lector_option.nextLine();
        System.out.println("Bienvenido " + name);
        System.out.println("¿Que desea hacer?");
        System.out.println("Marque 1 para hacer una reserva");
        System.out.println("Marque 2 para hacer una consulta");
        System.out.println("Marque 3 para salir");
        option = lector_option.nextInt();
        if (option == 1) {

            // Título para su conferencia
            System.out.println("Cuál es el título de su conferencia?");
            String conference_name = lector_conference_title.nextLine();
            System.out.println("Ok " + name + ", hemos guardado <" + conference_name + "> como el título de su conferencia");

            // Cantidad de proyectores que va a necesitar
            System.out.println("¿Cuántos proyectores necesita para dar su conferencia?");
            int projectors_quantity = lector_projectors.nextInt();
            System.out.println("Vale, hemos reservado " + projectors_quantity + " proyector(es) para su conferencia");

            // Cantidad de computadores que va a necesitar
            System.out.println("¿Cuantos computadores necesita para llevar a cabo su charla?");
            int pcs_quantity = lector_pcs.nextInt();
            System.out.println("Perfecto, instalaremos " + pcs_quantity + " computador(es) en la sala");
        }
        else if (option == 2) {
            System.out.println("Aún no está disponible, estamos trabajando para dejarlo listo lo mas pronto posible");
        }
        else if (option == 3){
            System.out.println("Muchas gracias por utilizar nuestro software de logística, esperamos que solamente sea un hasta pronto ;)");
        }
    }
}
