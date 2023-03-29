package com.example.gestiondeslivraison1.Ressource;


import com.example.gestiondeslivraison1.DTO.auth.AuthentificationRequest;
import com.example.gestiondeslivraison1.DTO.auth.AuthentificationResponse;
import com.example.gestiondeslivraison1.service.auth.ApplicationUserDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.example.gestiondeslivraison1.repository.constant.AUTHENTICATION_ENDPOINT;

@RestController
@RequestMapping(AUTHENTICATION_ENDPOINT)
public class AuthenticationRessource {

    private AuthenticationManager authenticationManager;

    private ApplicationUserDetailsService userDetailsService;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthentificationResponse> authenticate( @RequestBody AuthentificationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getLogin(),
                        request.getPassword()
                )
        );

        final UserDetails userDetails = userDetailsService.loadUserByUsername(request.getLogin());

        return ResponseEntity.ok(AuthentificationResponse.builder().accessToken("dummy_acccess_token").build());

    }




}
