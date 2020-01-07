package br.com.codenation.Aplication.domain.entity;

import br.com.codenation.Aplication.domain.vo.CompanyVo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 255)
    private Long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "document", nullable = false, length = 255)
    private String document;

    @Column(name = "vacancies", nullable = false, length = 255)
    private Integer vacancies;

    @Column(name = "site", nullable = false, length = 255)
    private String site;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<User> userList;

    public static CompanyVo toCompanyVo(Company company) {
        return CompanyVo.builder()
                .name(company.getName())
                .document(company.getName())
                .vacancies(company.getVacancies())
                .site(company.getSite())
                .build();
    }
}
