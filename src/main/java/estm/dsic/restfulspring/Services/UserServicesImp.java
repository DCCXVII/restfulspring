package estm.dsic.restfulspring.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import estm.dsic.restfulspring.Models.User;
import estm.dsic.restfulspring.repository.UserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServicesImp implements UserServices{

    private final UserRepository userRepository;


    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(int id, User user) {
        return userRepository.findById(id).
        map(t -> {
            t.setName(user.getName());
            t.setEmail(user.getEmail());
            t.setPassword(user.getPassword());
            return userRepository.save(user);
        }).orElseThrow(()-> new RuntimeException("User non trouve"));
    }

    @Override
    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "User deleted";
    }
    
}
