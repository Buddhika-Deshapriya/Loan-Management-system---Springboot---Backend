package com.example.easyloan.management.Controller.User.UserController;

import com.example.easyloan.management.Message.Request.UserCreateForm;
import com.example.easyloan.management.Message.Response.ResponseMessage;
import com.example.easyloan.management.Model.Role;
import com.example.easyloan.management.Model.RoleName;
import com.example.easyloan.management.Model.User;
import com.example.easyloan.management.Repository.RoleRepository;
import com.example.easyloan.management.Repository.UserRepository;
import com.example.easyloan.management.Security.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    JwtProvider jwtProvider;

    @Autowired
    PasswordEncoder encoder;

    @PostMapping("/add")
    public ResponseEntity<?> addUser(@Valid @RequestBody UserCreateForm signUpRequest) {
        if (userRepository.existsByUsername(signUpRequest.getUsername())) {
            return new ResponseEntity<>(new ResponseMessage("Fail -> Username is already taken!"),
                    HttpStatus.BAD_REQUEST);
        }

        if (userRepository.existsByEmail(signUpRequest.getEmail())) {
            return new ResponseEntity<>(new ResponseMessage("Fail -> Email is already in use!"),
                    HttpStatus.BAD_REQUEST);
        }

        // Creating user's account
        //String currentPWD = signUpRequest.getPassword();

        User user = new User(
                null,
                signUpRequest.getFirstName(),
                signUpRequest.getMiddleName(),
                signUpRequest.getLastName(),
                signUpRequest.getAddress(),
                signUpRequest.getNic(),
                signUpRequest.getDob(),
                signUpRequest.getEmail(),
                signUpRequest.getUsername(),
                encoder.encode(signUpRequest.getPassword()),
                null);
        //signUpRequest.setPassword(encoder.encode(currentPWD));
        Set<String> strRoles = signUpRequest.getRole();
        Set<Role> roles = new HashSet<>();

        strRoles.forEach(role -> {
            switch (role) {
                case "admin":
                    Role adminRole = roleRepository.findByName(RoleName.ROLE_ADMIN)
                            .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
                    roles.add(adminRole);

                    break;


                case "fro":
                    Role froRole = roleRepository.findByName(RoleName.ROLE_FRO)
                            .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
                    roles.add(froRole);

                    break;

                case "mgr":
                    Role mgrRole = roleRepository.findByName(RoleName.ROLE_MGR)
                            .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
                    roles.add(mgrRole);

                    break;

                case "dir":
                    Role dirRole = roleRepository.findByName(RoleName.ROLE_DIR)
                            .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
                    roles.add(dirRole);

                    break;

                default:
                    Role userRole = roleRepository.findByName(RoleName.ROLE_USER)
                            .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
                    roles.add(userRole);
            }
        });

        user.setRoles(roles);
        userRepository.save(user);

        return new ResponseEntity<>(new ResponseMessage("User registered successfully!"), HttpStatus.OK);
    }


}

