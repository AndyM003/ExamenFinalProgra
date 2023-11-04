/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dell
 */
package com.mycompany.Mipatitogeneradorcontra;

import java.security.SecureRandom;

public class NewClassName implements NewInterface {
    private final NewConfigDTO newConfig;

    public NewClassName(NewConfigDTO newConfig) {
        this.newConfig = newConfig;
    }

    @Override
    public String generatePassword() {
        int newPasswordLength = newConfig.getMinLength();
        StringBuilder newPassword = new StringBuilder();
        SecureRandom newRandom = new SecureRandom();

        if (newConfig.hasMinUppercase()) {
            for (int i = 0; i < newConfig.getMinUppercase(); i++) {
                newPassword.append((char) (newRandom.nextInt(26) + 'a'));
            }
        }

        for (int i = 0; i < newPasswordLength - newPassword.length(); i++) {
            newPassword.append((char) (newRandom.nextInt(26) + 'a'));
        }

        return newPassword.toString();
    }
}
