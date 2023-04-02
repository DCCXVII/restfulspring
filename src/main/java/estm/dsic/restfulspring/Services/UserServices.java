package estm.dsic.restfulspring.Services;

import java.util.List;

import estm.dsic.restfulspring.Models.User;

public interface UserServices {
    
    User createUser(User user);
    List<User> getAll();
    User updateUser(int id, User user);
    String deleteUser(int id);
}
