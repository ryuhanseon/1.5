package com.example.demo.User;


import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String username, String password){
        SiteUser userSite = new SiteUser();
        userSite.setUsername(username);
        userSite.setPassword(passwordEncoder.encode(password));
        this.userRepository.save(userSite);
        return userSite;
    }

}
