package io.github.jenkinstest.service;

import io.github.jenkinstest.model.JenkinsUser;
import io.github.jenkinstest.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public List<JenkinsUser> listAll(){
        return repository.findAll();
    }

    public JenkinsUser insertUser(JenkinsUser jenkinsUser){
        return repository.save(jenkinsUser);
    }

    public void deleteUser(JenkinsUser jenkinsUser){
        repository.delete(jenkinsUser);
    }

    public JenkinsUser findUser(Integer id){
        Optional<JenkinsUser>  optional = repository.findById(id);
        return (optional.isPresent()) ? optional.get() : null;
    }
}
