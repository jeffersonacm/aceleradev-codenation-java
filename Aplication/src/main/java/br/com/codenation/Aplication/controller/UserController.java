package br.com.codenation.Aplication.controller;

import br.com.codenation.Aplication.domain.entity.User;
import br.com.codenation.Aplication.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PutMapping
    public ResponseEntity updateName(@Param("id") Long id, @Param("name") String name) {
        System.out.println(id);
        User user = userService.updateName(id,name);
        return ResponseEntity.ok(User.toUserVo(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.ok(User.toUserVo(new User()));
    }
}
