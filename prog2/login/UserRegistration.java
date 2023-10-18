import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRegistration {
    private List<String> usernames;
    private List<String> passwords;
    private List<String> emails;

    private Scanner scanner;

    public void displayMenu() {
        boolean keepRunning = true;

        usernames = new ArrayList<>();
        passwords = new ArrayList<>();
        emails = new ArrayList<>();

        scanner = new Scanner(System.in);

        while (keepRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Crear usuario");
            System.out.println("2. Consultar usuario");
            System.out.println("3. Modificar usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("5. Salir");

            System.out.print("Elige una opción: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    createUser();
                    break;
                case "2":
                    consultUser();
                    break;
                case "3":
                    modifyUser();
                    break;
                case "4":
                    deleteUser();
                    break;
                case "5":
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}

    private void createUser() {
        System.out.print("Introduce el nombre de usuario: ");
        usernames.add(scanner.nextLine());

        System.out.print("Introduce la contraseña: ");
        passwords.add(scanner.nextLine());

        System.out.print("Introduce el email: ");
        emails.add(scanner.nextLine());

        System.out.println("Usuario creado exitosamente.");
    }

    private int getUserIndexByUsername(String username) {
        return usernames.indexOf(username);
    }

    private void consultUser() {
        System.out.print("Introduce el nombre de usuario a consultar: ");
        int index = getUserIndexByUsername(scanner.nextLine());

        if (index != -1) {
            System.out.println("Usuario: " + usernames.get(index) + ", Email: " + emails.get(index));
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    private void modifyUser() {
        System.out.print("Introduce el nombre de usuario a modificar: ");
        int index = getUserIndexByUsername(scanner.nextLine());

        if (index != -1) {
            System.out.print("Introduce el nuevo email (actual: " + emails.get(index) + "): ");
            emails.set(index, scanner.nextLine());
            System.out.println("Usuario modificado exitosamente.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
    private void deleteUser() {
        System.out.print("Introduce el nombre de usuario a eliminar: ");
        int index = getUserIndexByUsername(scanner.nextLine());

        if (index != -1) {
            usernames.remove(index);
            passwords.remove(index);
            emails.remove(index);
            System.out.println("Usuario eliminado exitosamente.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    public static void main(String[] args) {
        new UserRegistration().displayMenu();
    }
