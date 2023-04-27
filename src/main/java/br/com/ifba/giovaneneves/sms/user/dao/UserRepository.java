package br.com.ifba.giovaneneves.sms.user.dao;

import br.com.ifba.giovaneneves.sms.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByEmailAndPassword(String email, String password);
    User findByName(String name);
}
