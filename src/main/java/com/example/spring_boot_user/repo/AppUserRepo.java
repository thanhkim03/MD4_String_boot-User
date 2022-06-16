package com.example.spring_boot_user.repo;

import com.example.spring_boot_user.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepo extends JpaRepository<AppUser,Long> {
    AppUser findByName(String name);
}
