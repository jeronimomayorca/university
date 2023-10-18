public class UserController {
    private UserModel model;
    private UserView view;

    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        boolean keepRunning = true;

        while (keepRunning) {
            view.displayMenu();
            String option = view.getInput(message:””);

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
                    view.showMessage(message: "Opción no válida.");
            }
        }

        view.showMessage(message: “Hasta pronto!”);

        private void createUser() {
            String username = view.getInput(message: “Introduce el nombre de usuario: ”);
            String password = view.getInput(message: “Introduce la contraseña: ”);
            String email = view.getInput(message: “Introduce la dirección de correo electrónico: ”);

            model.addUser(new User(username, password, email));
            view.showMessage(message: “Usuario creado exitosamente.”);
        }


        private void consultUser() {
            String username = view.getInput(message: "Introduce el nombre de usuario a consultar: ”);
            User user = model.getUserByUsername(username);
            if (user != null) {
                view.printUserDetails(user);
            } else {
                view.showMessage(message: “Usuario no encontrado.”);
            }
        }

        private void modifyUser() {
            String username = view.getInput(message:” Introduce el nombre de usuario a modificar: ”);
            User user = model.getUserByUsername(username);
            if (user != null) {
                String newEmail = view.getInput(“Introduce la nueva dirección de correo electrónico (actual: ” + user.getEmail() + "): ”);
                // Nota: Parece que parte del código ha sido cortado en la imagen.
                view.showMessage(message: “Usuario modificado exitosamente.”);
            } else {
                view.showMessage(message: “Usuario no encontrado.");
            }
        }

        private void deleteUser() {
            String username = view.getInput(message: "Introduce el nombre de usuario a eliminar: ");
            User user = model.getUserByUsername(username);
            if (user != null) {
                model.deleteUser(user);
                view.showMessage(message: “Usuario eliminado exitosamente.”);
            } else {
                view.showMessage(message: “Usuario no encontrado.”);
            }
        }

