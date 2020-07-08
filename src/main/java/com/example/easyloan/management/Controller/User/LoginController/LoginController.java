package com.example.easyloan.management.Controller.User.LoginController;

import com.example.easyloan.management.Message.Request.LoginForm;
import com.example.easyloan.management.Message.Response.JwtResponse;
import com.example.easyloan.management.Model.User;
import com.example.easyloan.management.Repository.RoleRepository;
import com.example.easyloan.management.Repository.UserRepository;
import com.example.easyloan.management.Security.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginForm loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtProvider.generateJwtToken(authentication);
        //UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        Optional <User> userObj = userRepository.findByUsername(loginRequest.getUsername());
        userObj.get().setPassword("Hide");

        return ResponseEntity.ok(new JwtResponse(jwt,userObj));
    }


}
