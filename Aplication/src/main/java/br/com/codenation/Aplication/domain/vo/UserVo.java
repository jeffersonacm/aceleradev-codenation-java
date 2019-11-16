package br.com.codenation.Aplication.domain.vo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Data
@Getter
@Builder
public class UserVo {

    private Long id;

    private String name;

    private String document;

    private int idade;

    private String login;

    private BigDecimal salario;
}
