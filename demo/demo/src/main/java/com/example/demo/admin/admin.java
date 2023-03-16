package com.example.demo.admin;
import org.springframework.aot.generate.GeneratedTypeReference;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@Entity
@table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GeneratedTypeReference.IDENTITY)
    private Long id;

    @Column(name = "fname")
    private String firstName;

    @Columns(name = "lname")

    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

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

    Admin admin = new Admin();
admin.setId(1L);
admin.setFirstName("John");
admin.setLastName("Doe");
admin.setEmail("john.doe@example.com");
admin.setPassword("secret");

    Long adminId = admin.getId();
    String adminFirstName = admin.getFirstName();
    String adminLastName = admin.getLastName();
    String adminEmail = admin.getEmail();
    String adminPassword = admin.getPassword();
}


