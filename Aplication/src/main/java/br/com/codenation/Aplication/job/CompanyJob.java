package br.com.codenation.Aplication.job;
import br.com.codenation.Aplication.service.impl.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@Slf4j
public class CompanyJob {

    @Autowired
    CompanyService companyService;

    @Scheduled(fixedRate = 10000000)
    public void countCompany() {
        log.info("### START VERIFY COUNT COMPANIES");
        log.info("### FOUND " + companyService.getCompanyCount().toString() + " IN BASE");
        log.info("### END VERIFY COUNT COMPANIES");
    }
}
