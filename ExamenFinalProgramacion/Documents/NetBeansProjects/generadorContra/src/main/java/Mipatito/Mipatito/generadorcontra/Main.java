
package com.mycompany.Mipatitogeneradorcontra;

public class Main {
    public static void main(String[] args) {
        // generador preterminado
        GeneradorContra generadorPredeterminado = new GeneradorContraDefault();
        String contraseñaPredeterminada = generadorPredeterminado.generaContraseña();
        
        // Uso de un generador configurable
        ConfiguracionContraseñaDTO configuracion = new ConfiguracionContraseñaDTO(8, 2, 2, 4, 1, true, true, true, true);
        GeneradorContra generadorConfigurable = new ContraConfigurable(configuracion);
        String contraseñaConfigurable = generadorConfigurable.generaContraseña();
        
        System.out.println("Contraseña predeterminada: " + contraseñaPredeterminada);
        System.out.println("Contraseña configurable: " + contraseñaConfigurable);
    }
}



