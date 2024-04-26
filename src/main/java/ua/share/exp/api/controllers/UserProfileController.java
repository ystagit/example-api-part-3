package ua.share.exp.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.share.exp.api.models.UserProfile;

@RestController
@RequestMapping("/user")
public class UserProfileController {

    @GetMapping("/one")
    public ResponseEntity<?> get() {
        final UserProfile userProfile = new UserProfile("Yurii", 33, true);

        return new ResponseEntity<>(userProfile, HttpStatus.OK);
    }
}
