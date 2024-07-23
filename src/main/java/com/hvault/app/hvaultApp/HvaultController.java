package com.hvault.app.hvaultApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HvaultController {

    @Autowired
    private VaultConfig vaultConfiguration;

    @GetMapping("/getDataFromVault")
    public String getDataFromVault() {
        return "UserName: " + vaultConfiguration.getUsername() + ", Password: " + vaultConfiguration.getPassword();
    }
}
