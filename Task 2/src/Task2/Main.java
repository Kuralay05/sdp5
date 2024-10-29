package Task2;

public class Main {

    public static void main(String[] args) {
        DataModel model = new DataModel("Initial Data");

        ConsoleView view = new ConsoleView();

        DataPresenter presenter = new DataPresenter(model, view);

        // Display current data.
        presenter.showData();
        presenter.updateData();
        presenter.appendMoreData();
    }
}