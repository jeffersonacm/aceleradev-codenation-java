package br.com.codenation.Aplication.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private BigInteger id;

    @Column(name = "name", nullable = false)
    private String name;
}
