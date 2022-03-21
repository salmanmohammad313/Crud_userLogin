package com.LoginApp;

import com.LoginApp.dto.User;
import com.LoginApp.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    public UserRepository repo;

    @PostMapping("/add-user")
    public Integer addUser(@RequestBody User user)  {
        System.out.println(user);

        User u=repo.save(user);

        return u.getUserId();

    }

    @GetMapping("/getUser/{userName}/{password}")
   public String getUser(@PathVariable String userName, @PathVariable String password) {
        User u=repo.findByUserNameAndPassword(userName,password);
        System.out.println(u);
        if(u==null){
          return "user not found in db for userName "+ userName;
        }
        return u.toString();
   }

    // start the db
    // connect db with spring boot
    // to check api working or not need postman
    // angular flag are responsible for making connection bet the angular and spring boot
    //localhost:8080/getUser/salman/12345
    //save data
    //return tru or false based username and password
}
