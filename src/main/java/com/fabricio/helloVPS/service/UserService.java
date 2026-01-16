package com.fabricio.helloVPS.service;

import com.fabricio.helloVPS.entity.AttributesGoogle;
import com.fabricio.helloVPS.repository.AttributesRepository;
import jakarta.servlet.http.HttpServletResponse;

import java.net.URLEncoder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@Service
public class UserService {
    private final AttributesRepository attributesRepository;
    private final EmailService emailService;

    public UserService(AttributesRepository attributesRepository, EmailService emailService) {
        this.attributesRepository = attributesRepository;
        this.emailService = emailService;
    }

    public void processUser(OAuth2User principal, HttpServletResponse response) throws IOException {
        Map<String, Object> attributes = principal.getAttributes();

        String sub = String.valueOf(attributes.get("sub"));
        String name = String.valueOf(attributes.get("name"));
        String givenName = String.valueOf(attributes.get("given_name"));
        String picture = String.valueOf(attributes.get("picture"));
        String email = String.valueOf(attributes.get("email"));
        String emailVerified = String.valueOf(attributes.get("email_verified"));

        AttributesGoogle entity = new AttributesGoogle();
        entity.setSub(sub);
        entity.setName(name);
        entity.setGivenName(givenName);
        entity.setPicture(picture);
        entity.setEmail(email);
        entity.setEmailVerified(emailVerified);

        attributesRepository.save(entity);
        emailService.sendHtmlEmail(email, attributes.toString());

        response.sendRedirect(
                String.format("/success?username=%s&email=%s&picture=%s",
                URLEncoder.encode(givenName, StandardCharsets.UTF_8),
                        URLEncoder.encode(email, StandardCharsets.UTF_8),
                        URLEncoder.encode(picture, StandardCharsets.UTF_8)
        ));
    }
}
