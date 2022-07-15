package tqi.dio.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tqi.dio.springjpa.model.User;
import tqi.dio.springjpa.repository.UserRepository;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.findByNameContaining("SERGIO");
        for(User u: users){
            System.out.println(u);
        }
    }
    private void insertUser(){
        User user = new User();
        user.setName("VIDALTI");
        user.setUsername("Vid");
        user.setPassword("1234");
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
