package com.example.gestiondeslivraison1.DTO.auth;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthentificationResponse {

    private String accessToken;

    @Override
    public String toString() {
        return "AuthentificationResponse{" +
                "accessToken='" + accessToken + '\'' +


                '}';
    }
}
