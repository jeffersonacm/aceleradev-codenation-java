package br.com.codenation.Aplication;

import br.com.codenation.Aplication.domain.entity.Company;
import br.com.codenation.Aplication.service.impl.CompanyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AplicationApplicationTests {
	@Autowired
	CompanyService companyService;

	@Test
	void contextLoads() {
//		for (Method declaredMethod : file.getDeclaredMethod()) {
//			Assertions.assertEquals(declaredMethod.getAno);
//		}
	}

	@Test
	void select() {
//		List<Company> companies = companyService.getCompaniesByName("2");
//		companies.forEach(e-> System.out.println(e.getName()));
	}

}
