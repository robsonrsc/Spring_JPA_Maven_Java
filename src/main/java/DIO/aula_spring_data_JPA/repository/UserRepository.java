package DIO.aula_spring_data_JPA.repository;

import DIO.aula_spring_data_JPA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {


}
