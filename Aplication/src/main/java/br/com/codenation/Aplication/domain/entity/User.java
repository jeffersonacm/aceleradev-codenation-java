package br.com.codenation.Aplication.domain.entity;

import br.com.codenation.Aplication.domain.vo.UserVo;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 255)
    private Long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "document", nullable = false, length = 255)
    private String document;

    @Column(name = "age", nullable = false, length = 255)
    private int age;

    @Column(name = "username", nullable = false, length = 255)
    private String username;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "salario")
    private BigDecimal salario;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="user_role",
            joinColumns=@JoinColumn(name="user_id"),
            inverseJoinColumns=@JoinColumn(name="role_id")
    )
    private List<Role> roles;

    public static UserVo toUserVo(User user) {
        return UserVo.builder()
            .id(user.getId())
            .name(user.getName())
            .document(user.getDocument())
            .idade(user.getAge())
            .login(user.getUsername())
            .salario(user.getSalario())
            .build();
    }

    public User (User user) {
        super();
        this.name = user.getName();
        this.username = user.getUsername();
        this.password = user.getUsername();
        this.age = user.getAge();
        this.document = user.getUsername();
        this.roles = user.getRoles();
    }
}
