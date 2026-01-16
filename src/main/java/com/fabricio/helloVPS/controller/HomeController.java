package com.fabricio.helloVPS.controller;

import com.fabricio.helloVPS.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
public class HomeController {
    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home() {
        return "Bem-vindo! Acesse /hellovps para logar com Google.";
    }


    @GetMapping("/hellovps")
    public void user(@AuthenticationPrincipal OAuth2User principal, HttpServletResponse response) throws IOException {
        userService.processUser(principal, response);
    }

    @GetMapping("/success")

    public String sucess(
            @RequestParam(name = "username") String username,
            @RequestParam(name="email") String email,
            @RequestParam(name="picture") String picture

    ){
        String bannerImg = "https://uploads.spiritfanfiction.com/historias/capitulos/202101/imagine-narutouma-nova-historia-21517745-200120211735.gif";

        return String.format("<p style='font-size: 20px;'> Olá, <b>%s</b> seu login foi efetuado com sucesso!\n\n Por favor, verifique seu email <b>%s</b> e me envie um print do email. <b>:)</b> </p> <br><br><br><br> <img src='%s' crossorigin='anonymous' alt='Avatar'/> <img src='%s' style='width:200px'/>", username, email, picture, bannerImg);
    }
}