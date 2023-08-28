package com.produto.celta.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produto.celta.dto.CredenciaisDeUsuario;

@RestController
@RequestMapping("/api")
public class AuthController {
    
    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody CredenciaisDeUsuario credenciais) {
        return null;
    }
    
    @PostMapping("/logout")
    public ResponseEntity<Object> logout() {
        return null;
    }
}
