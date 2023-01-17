package DIO.aula_spring_data_JPA;

import DIO.aula_spring_data_JPA.model.User;
import DIO.aula_spring_data_JPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {

    User user        = new User();

    user.setName("Robson");
    user.setPassword("dio159");
    user.setUser_name("robinho");


    repository.save(user);

    for (User u: repository.findAll() ){

        System.out.println(u);
    }

    }




}
