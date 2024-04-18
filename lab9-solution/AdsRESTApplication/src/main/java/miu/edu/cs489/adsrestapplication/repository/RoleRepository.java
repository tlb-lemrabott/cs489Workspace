package miu.edu.cs489.adsrestapplication.repository;

import miu.edu.cs489.adsrestapplication.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(String roleName);
}
