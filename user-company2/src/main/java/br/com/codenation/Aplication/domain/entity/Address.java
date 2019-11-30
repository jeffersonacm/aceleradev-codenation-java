package br.com.codenation.Aplication.domain.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 255)
    private Long id;

    @Column(name = "zip_code", nullable = false, length = 255)
    private String zip_code;

    @Column(name = "street", nullable = false, length = 255)
    private String street;

    @Column(name = "number", nullable = false, length = 255)
    private Integer number;

    @Column(name = "district", nullable = false, length = 255)
    private String district;

    @Column(name = "city", nullable = false, length = 255)
    private String city;

    @Column(name = "country", nullable = false, length = 255)
    private String country;
}
