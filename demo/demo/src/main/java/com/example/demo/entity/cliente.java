package com.example.demo.entity;
import org.springframework.boot.autoconfigure.client.EntityScan;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fname")
    private String firstName;

    @Column(name = "lname")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    // constructors

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // getters and setters
}


Client client = new Client();
client.setId(1L);
client.setFirstName("Alex");
client.setLastName("Done");
client.setEmail("alex.done@example.com");
client.setPassword("secret");

Long clientId = client.getId();
String clientFirstName = client.getFirstName();
String clientLastName = client.getLastName();
String clientEmail = client.getEmail();
String clientPassword = client.getPassword();

