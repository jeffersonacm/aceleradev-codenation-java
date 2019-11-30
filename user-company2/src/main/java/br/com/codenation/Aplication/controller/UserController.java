package br.com.codenation.Aplication.controller;

import br.com.codenation.Aplication.domain.entity.User;
import br.com.codenation.Aplication.service.impl.MyUserDetailsService;
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

    @Autowired
    MyUserDetailsService myUserDetailsService;

    @GetMapping
    public ResponseEntity getAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/username/{name}")
    public ResponseEntity updateName(@Param("name") String name) {
        return ResponseEntity.ok(myUserDetailsService.loadUserByUsername(name));
    }

    @PutMapping
    public ResponseEntity updateName(@Param("id") Long id, @Param("name") String name) {
        User user = userService.updateName(id,name);
        return ResponseEntity.ok(User.toUserVo(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.ok(User.toUserVo(null));
    }
}
