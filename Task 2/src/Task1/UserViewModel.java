package Task1;

import java.util.ArrayList;
import java.util.List;

public class UserViewModel {
    private List<UserModel> users;

    public UserViewModel() {
        users = new ArrayList<>();
    }

    public void addUser(String name) {
        users.add(new UserModel(name));
    }

    public String[] getUserNames() {
        return users.stream().map(UserModel::getName).toArray(String[]::new);
    }

    public int getUserCount() {
        return users.size();
    }
}

