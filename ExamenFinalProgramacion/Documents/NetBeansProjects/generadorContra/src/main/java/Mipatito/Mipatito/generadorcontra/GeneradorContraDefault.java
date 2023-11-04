
/**
 *
 * @author dell
 */
package com.mycompany.Mipatitogeneradorcontra;

import java.security.SecureRandom;

public class GeneradorContraDefault implements GeneradorContra {
    @Override
    public String generarContraseña() {
        int length = 8; // Longitud mínima requerida para la contraseña

        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>?";
        SecureRandom random = new SecureRandom();
        StringBuilder contra = new StringBuilder();

        // caracteres especiales
        contra.append(caracteres.charAt(random.nextInt(26))); // Minúsculas
        contra.append(caracteres.charAt(random.nextInt(26) + 26)); // Mayúsculas
        contra.append(caracteres.charAt(random.nextInt(10) + 52)); // Dígitos
        contra.append(caracteres.charAt(random.nextInt(16) + 62)); // Caracteres especiales

        // crea contraseña aleatoria
        for (int i = 4; i < length; i++) {
            contra.append(caracteres.charAt(random.nextInt(caracteres.length()));
        }

        return contra.toString();
    }
}



