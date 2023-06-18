package com.example.Librarie.Controller;

import com.example.Librarie.Model.Utilizator;
import com.example.Librarie.Service.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/utilizator_app")
public class AdminController {

    @Autowired
    private UtilizatorService userService;

    @GetMapping("/getUsers")
    @ResponseBody
    public List<Utilizator> getAllUsers() {
        return this.userService.getUsers();
    }

    @GetMapping("/getUser/{id_utilizator}")
    @ResponseBody
    public Optional<Utilizator> getUser(@PathVariable("id_utilizator") Long idUtilizator){
        return this.userService.getUserById(idUtilizator);
    }

    @PostMapping("/insertUser")
    @ResponseBody
    public Utilizator insertUser(@RequestBody Utilizator user){
        return this.userService.insertUser(user);
    }

    @DeleteMapping("/deleteUser/{id_utilizator}")
    @ResponseBody
    public String deleteUser(@PathVariable("id_utilizator") Long idUtilizator){
        return this.userService.deleteUser(idUtilizator);
    }

    @PutMapping("/updateUser")
    @ResponseBody
    public Utilizator updateUser(@RequestBody Utilizator user){
        return this.userService.updateUser(user);
    }

}

