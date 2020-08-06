package com.genx.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.genx.models.ERole;
import com.genx.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
