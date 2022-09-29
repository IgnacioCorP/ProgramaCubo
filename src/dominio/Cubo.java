/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Cubo {
    public int ancho;
    public int alto;
    public int profundo;

    public Cubo() {
    }

    public Cubo(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }
    
    public int CalcularVolumen(){
        
      return alto*ancho*profundo;  
       
    };

    @Override
    public String toString() {
        return "Cubo{" + "ancho=" + ancho + ", alto=" + alto + ", profundo=" + profundo + '}';
    }
    
    
    
}
