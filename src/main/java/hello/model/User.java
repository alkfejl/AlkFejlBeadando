package hello.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="email", nullable=false, unique = true, length=100)
    private String email;

    @Column(name="password", nullable=false, length=100)
    private String password;

    @Column(name="role", nullable=false)
    private String role;

}
