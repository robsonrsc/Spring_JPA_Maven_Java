package DIO.aula_spring_data_JPA.model;


import javax.persistence.*;

@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "user_id")
    private  Integer id;
    @Column (length = 50, nullable = false)
    private String name;
    @Column (length = 20, nullable = false)

    private  String user_name;
    @Column (length = 100, nullable = false)

    private  String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
