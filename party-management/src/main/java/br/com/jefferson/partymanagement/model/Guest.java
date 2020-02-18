package br.com.jefferson.partymanagement.model;

import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Guest implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Integer accompanyingQuantity;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAccompanyingQuantity() {
        return this.accompanyingQuantity;
    }

    public void setAccompanyingQuantity(Integer accompanyingQuantity) {
        this.accompanyingQuantity = accompanyingQuantity;
    }
}