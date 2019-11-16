package br.com.codenation.Aplication.domain.entity;

import br.com.codenation.Aplication.domain.vo.UserVo;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

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

    @Column(name = "idade", nullable = false, length = 255)
    private int idade;

    @Column(name = "login", nullable = false, length = 255)
    private String login;

    @Column(name = "senha", nullable = false, length = 255)
    private String senha;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "salario")
    private BigDecimal salario;

    public static UserVo toUserVo(User user) {
        return UserVo.builder()
                .id(user.getId())
                .name(user.getName())
                .document(user.getDocument())
                .idade(user.getIdade())
                .login(user.getLogin())
                .salario(user.getSalario())
                .build();
    }
}
