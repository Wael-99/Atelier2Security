package com.wael.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wael.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
  Role findByRole(String role);
}
