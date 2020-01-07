package br.com.codenation.Aplication.service.impl;

import br.com.codenation.Aplication.domain.entity.User;
import br.com.codenation.Aplication.domain.repository.UserRepository;
import br.com.codenation.Aplication.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService implements UserInterface {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    
    public User updateName(Long id, String name) {
        User user = userRepository.findById(id).get();
        user.setName(name);
        return userRepository.save(user);
    }

    public void delete(Long id) {
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
    }

    @Override
    public User findByUsername(String name) {
        return userRepository.findByUsername(name);
    }
}
