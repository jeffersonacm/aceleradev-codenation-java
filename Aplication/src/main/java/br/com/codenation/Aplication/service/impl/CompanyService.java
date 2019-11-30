package br.com.codenation.Aplication.service.impl;

import br.com.codenation.Aplication.domain.entity.Company;
import br.com.codenation.Aplication.domain.repository.CompanyRepository;
import br.com.codenation.Aplication.domain.vo.CompanyVo;
import br.com.codenation.Aplication.service.CompanyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CompanyService implements CompanyInterface {
    @Autowired
    private CompanyRepository companyRepository;

    @Modifying
    public CompanyVo insertCompany(CompanyVo companyVo) {
        Company company = Company.builder()
                .name(companyVo.getName())
                .document(companyVo.getDocument())
                .vacancies(companyVo.getVacancies())
                .site(companyVo.getSite())
                .build();

        company = companyRepository.save(company);

        return Company.toCompanyVo(company);
    }

    public List<CompanyVo> getCompaniesByName(String name) {
        List<Company> companies = companyRepository.findAllByNameOrderByName(name);

        List<CompanyVo> companyVos = companies
                .stream()
                .map(company -> Company.toCompanyVo(company))
                .collect(Collectors.toList());

        return companyVos;
    }

    public Long getCompanyCount() {
        return companyRepository.count();
    }

    public void delete(Long id) {
        Company company = companyRepository.findById(id).get();
        companyRepository.delete(company);
    }
}
