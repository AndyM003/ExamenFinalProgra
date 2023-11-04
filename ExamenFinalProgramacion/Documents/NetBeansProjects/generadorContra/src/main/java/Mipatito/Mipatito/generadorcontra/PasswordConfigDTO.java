
package com.mycompany.generadorcontra;

/**
 *
 * @author dell
 */

public class ConfiguracionContrasena {
    private int longitudMinima;
    private int minimoDigitos;
    private int minimoLetrasMayusculas;
    private int minimoLetrasMinusculas;
    private int minimoCaracterNoAlfa;
    private boolean restringirMinimoDigitos;
    private boolean restringirMinimoLetrasMayusculas;
    private boolean restringirMinimoLetrasMinusculas;
    private boolean restringirMinimoCaracterNoAlfa;

    public ConfiguracionContrasena(int longitudMinima, int minimoDigitos, int minimoLetrasMayusculas, int minimoLetrasMinusculas,
                                   int minimoCaracterNoAlfa, boolean restringirMinimoDigitos, boolean restringirMinimoLetrasMayusculas,
                                   boolean restringirMinimoLetrasMinusculas, boolean restringirMinimoCaracterNoAlfa) {
        this.longitudMinima = longitudMinima;
        this.minimoDigitos = minimoDigitos;
        this.minimoLetrasMayusculas = minimoLetrasMayusculas;
        this.minimoLetrasMinusculas = minimoLetrasMinusculas;
        this.minimoCaracterNoAlfa = minimoCaracterNoAlfa;
        this.restringirMinimoDigitos = restringirMinimoDigitos;
        this.restringirMinimoLetrasMayusculas = restringirMinimoLetrasMayusculas;
        this.restringirMinimoLetrasMinusculas = restringirMinimoLetrasMinusculas;
        this.restringirMinimoCaracterNoAlfa = restringirMinimoCaracterNoAlfa;
    }

    public int getLongitudMinima() {
        return longitudMinima;
    }

    public void setLongitudMinima(int longitudMinima) {
        this.longitudMinima = longitudMinima;
    }

    public int getMinimoDigitos() {
        return minimoDigitos;
    }

    public void setMinimoDigitos(int minimoDigitos) {
        this.minimoDigitos = minimoDigitos;
    }

    public int getMinimoLetrasMayusculas() {
        return minimoLetrasMayusculas;
    }

    public void setMinimoLetrasMayusculas(int minimoLetrasMayusculas) {
        this.minimoLetrasMayusculas = minimoLetrasMayusculas;
    }

    public int getMinimoLetrasMinusculas() {
        return minimoLetrasMinusculas;
    }

    public void setMinimoLetrasMinusculas(int minimoLetrasMinusculas) {
        this.minimoLetrasMinusculas = minimoLetrasMinusculas;
    }

    public int getMinimoCaracterNoAlfa() {
        return minimoCaracterNoAlfa;
    }

    public void setMinimoCaracterNoAlfa(int minimoCaracterNoAlfa) {
        this.minimoCaracterNoAlfa = minimoCaracterNoAlfa;
    }

    public boolean isRestringirMinimoDigitos() {
        return restringirMinimoDigitos;
    }

    public void setRestringirMinimoDigitos(boolean restringirMinimoDigitos) {
        this.restringirMinimoDigitos = restringirMinimoDigitos;
    }

    public boolean isRestringirMinimoLetrasMayusculas() {
        return restringirMinimoLetrasMayusculas;
    }

    public void setRestringirMinimoLetrasMayusculas(boolean restringirMinimoLetrasMayusculas) {
        this.restringirMinimoLetrasMayusculas = restringirMinimoLetrasMayusculas;
    }

    public boolean isRestringirMinimoLetrasMinusculas() {
        return restringirMinimoLetrasMinusculas;
    }

    public void setRestringirMinimoLetrasMinusculas(boolean restringirMinimoLetrasMinusculas) {
        this.restringirMinimoLetrasMinusculas = restringirMinimoLetrasMinusculas;
    }

    public boolean isRestringirMinimoCaracterNoAlfa() {
        return restringirMinimoCaracterNoAlfa;
    }

    public void setRestringirMinimoCaracterNoAlfa(boolean restringirMinimoCaracterNoAlfa) {
        this.restringirMinimoCaracterNoAlfa = restringirMinimoCaracterNoAlfa;
    }

    boolean restringirMinimoLetrasMayusculas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    int getRestringirMinimoLetrasMayusculas() {
        throw new UnsupportedOperationException("Not supported
