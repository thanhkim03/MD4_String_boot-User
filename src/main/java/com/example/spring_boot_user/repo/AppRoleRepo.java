package com.example.spring_boot_user.repo;

import com.example.spring_boot_user.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepo extends JpaRepository<AppRole,Long> {
}
