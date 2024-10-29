package Task2;

class DataModel {

    private String data;

    // Constructor to initialize the model with initial data.
    public DataModel(String data) {
        this.data = data;
    }

    // Method to get the current data.
    public String getData() {
        return data;
    }

    // Method to update the data.
    public void updateData(String newData) {
        this.data = newData;
    }

    // Method to append more data to the existing data.
    public void appendData(String moreData) {
        this.data += " "+ moreData;
    }
}
