package com.chaima.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chaima.users.entities.Role;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Long> {
Role findByRole(String role);


    @Query("select r from Role r where r.role_id = ?1")
    Role findRoleById(Long id);

}