
package com.hms.dao;

import com.hms.model.User;
import java.util.List;

public interface UserDao {
    public List<User> users();

    public void createUser(User user);

    public void updateUser(User user);

    public void deleteUser(String username);
}
