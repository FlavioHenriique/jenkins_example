package io.github.jenkinstest.controller;

import io.github.jenkinstest.model.JenkinsUser;
import io.github.jenkinstest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
/*
    @Autowired
    private UserService service;

    @GetMapping("/findAll")
    public List<JenkinsUser> findAll(){
        return service.listAll();
    }

    @PostMapping("/save")
    public JenkinsUser save(@RequestBody JenkinsUser jenkinsUser){
        return service.insertUser(jenkinsUser);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody JenkinsUser jenkinsUser){
        service.deleteUser(jenkinsUser);
        return "deletado";
    }

    @GetMapping("/findById")
    public JenkinsUser findById(@RequestParam("id") int id){
        JenkinsUser jenkinsUser = service.findUser(id);
        return jenkinsUser;
    }
*/
    @GetMapping("/teste")
    public String teste(){
        return "teste";
    }
}
