package br.com.codenation.Aplication.domain.vo;

import br.com.codenation.Aplication.domain.entity.Address;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class CompanyVo {

    private String name;

    private String document;

    private Integer vacancies;

    private String site;

    private Address address;
}
