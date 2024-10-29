package Task1;

public class Main {
    public static void main(String[] args) {
        UserViewModel viewModel = new UserViewModel();
        UserView view = new UserView(viewModel);
        view.runApp(); // Запуск приложения через View
    }
}
