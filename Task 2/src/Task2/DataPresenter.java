package Task2;

class DataPresenter {

    private DataModel model;
    private ConsoleView view;

    // Constructor to initialize the presenter with the model and view.
    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void showData() {
        view.displayInfo("Current Data: " + model.getData());
    }

    // Method to take input from the user and pass it to the model for updating.
    public void updateData() {
        String newData = view.gatherInput("Enter new data: ");
        model.updateData(newData);
        view.displayInfo("Data updated to: " + model.getData());
    }

    // Method to append more data and update the model.
    public void appendMoreData() {
        String moreData = view.gatherInput("Enter more data to append: ");
        model.appendData(moreData);
        view.displayInfo("Data appended. Final Data: " + model.getData());
    }
}
