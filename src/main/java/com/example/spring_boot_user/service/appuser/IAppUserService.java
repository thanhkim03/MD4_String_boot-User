package com.example.spring_boot_user.service.appuser;

import com.example.spring_boot_user.model.AppUser;
import com.example.spring_boot_user.service.GeneralService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface IAppUserService extends GeneralService<AppUser> {
AppUser findByName(String name);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}

