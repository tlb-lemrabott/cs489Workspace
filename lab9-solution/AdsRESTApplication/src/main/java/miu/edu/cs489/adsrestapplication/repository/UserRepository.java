package miu.edu.cs489.adsrestapplication.repository;

import miu.edu.cs489.adsrestapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByUsername(String username);

}
