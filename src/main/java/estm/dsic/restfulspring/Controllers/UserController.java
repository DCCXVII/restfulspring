package estm.dsic.restfulspring.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

import estm.dsic.restfulspring.Models.User;
import estm.dsic.restfulspring.Services.UserServices;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/Users")
@AllArgsConstructor

public class UserController {

    private final UserServices userServices;

    @PostMapping("/createUser")

    public User createUser(@RequestBody User user){
        return userServices.createUser(user);
    }

    @GetMapping("/AllUsers")
    public List<User> getAllUsers(){
        return userServices.getAll();
    }
    
    @PutMapping("/updateUser/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user){
        return userServices.updateUser(id, user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        return userServices.deleteUser(id);
    }
}
