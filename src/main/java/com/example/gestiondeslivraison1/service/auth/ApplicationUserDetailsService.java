package com.example.gestiondeslivraison1.service.auth;



import com.example.gestiondeslivraison1.Model.Utilisateur;
import com.example.gestiondeslivraison1.repository.UtilisateurRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Collections;


@Service
public class ApplicationUserDetailsService implements UserDetailsService {

    @Autowired
    private UtilisateurRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    Utilisateur utilisateur = repository.findByEmail_utilisateur(email).orElseThrow(()->
            new EntityNotFoundException("Utilisateur inexistant")
        );
            return new User(utilisateur.getEmail_utilisateur(),utilisateur.getPassword_utilisateur(), Collections.emptyList());
    }
}
