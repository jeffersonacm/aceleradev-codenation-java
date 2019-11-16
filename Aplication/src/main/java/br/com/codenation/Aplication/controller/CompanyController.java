package br.com.codenation.Aplication.controller;

import br.com.codenation.Aplication.domain.entity.User;
import br.com.codenation.Aplication.domain.vo.CompanyVo;
import br.com.codenation.Aplication.service.impl.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping
    public ResponseEntity create(@RequestBody CompanyVo companyVo) {
        return ResponseEntity.ok(companyService.insertCompany(companyVo));
    }

    @GetMapping("/{name}")
    public ResponseEntity getCompaniesByName(@PathVariable String name) {
        return ResponseEntity.ok(companyService.getCompaniesByName(name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        companyService.delete(id);
        return ResponseEntity.ok(User.toUserVo(new User()));
    }
}
