package br.com.claudia.cursoTestes.services;

import br.com.claudia.cursoTestes.domain.User;
import br.com.claudia.cursoTestes.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
