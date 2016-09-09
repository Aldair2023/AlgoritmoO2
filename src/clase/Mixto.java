/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author aldair
 */
public class Mixto {
    private int Entero;
    private int Numerador;
    private int Denominador;
    
    public Mixto(int Entero, int Numerador, int Denominador) throws DenominadorCeroException{
        this.Entero = Entero;
        this.Numerador = Numerador;
        this.Denominador = Denominador;
        
        if(Denominador == 0){
            throw new DenominadorCeroException();
        }
    }

    public int getEntero() {
        return Entero;
    }

    public void setEntero(int Entero) {
        this.Entero = Entero;
    }

    public int getNumerador() {
        return Numerador;
    }

    public void setNumerador(int Numerador) {
        this.Numerador = Numerador;
    }

    public int getDenominador() {
        return Denominador;
    }

    public void setDenominador(int Denominador) {
        this.Denominador = Denominador;
    }
    
    public Mixto sumar(Mixto f2) throws DenominadorCeroException{
        Mixto f;
        int num, den;
        
        num = this.Numerador * f2.Denominador + this.Denominador * f2.Numerador;
        den = this.Denominador * f2.Denominador;
        
        f = new Mixto(num, den);
        return f;
    }
    
    public Mixto restar(Mixto f2) throws DenominadorCeroException{
        Mixto f;
        int num, den;
        
        num = this.Numerador * f2.Denominador - this.Denominador * f2.Numerador;
        den = this.Denominador * f2.Denominador;
        
        f = new Mixto(num, den);
        return f;
    }
    
    public Mixto multiplicar(Mixto f2) throws DenominadorCeroException{
        Mixto f;
        int num, den;
        
        num = this.Numerador * f2.Numerador;
        den = this.Denominador * f2.Denominador;
        
        f = new Mixto(num, den);
        return f;
    }
    
    public Mixto division(Mixto f2) throws DenominadorCeroException{
        Mixto f;
        int num, den;
        
        num = this.Numerador * f2.Denominador;
        den = this.Denominador * f2.Numerador;
        
        f = new Mixto(num, den);
        return f;
    }
}
