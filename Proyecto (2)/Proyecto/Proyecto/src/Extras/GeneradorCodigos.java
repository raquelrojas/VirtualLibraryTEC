/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

import java.util.Random;

/**
 *
 * @author Ignacio
 */
public class GeneradorCodigos {
    private String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private int largoCodigo;
    private Random random;

    public String getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(String caracteres) {
        this.caracteres = caracteres;
    }

    public int getLargoCodigo() {
        return largoCodigo;
    }

    public void setLargoCodigo(int largoCodigo) {
        this.largoCodigo = largoCodigo;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public GeneradorCodigos(int largoCodigo) {
        this.largoCodigo = largoCodigo;
        this.random = new Random();
    }

    @Override
    public String toString() {
        return "GeneradorCodigos{" + "caracteres=" + caracteres + ", largoCodigo=" + largoCodigo + ", random=" + random + '}';
    }
    
    public String generateCode(){
        String msg = "";
        for (int i =  0; i < largoCodigo; i++){
         msg += caracteres.charAt(random.nextInt(caracteres.length()));
         }
         return msg;
    }

    public  String generarCodigo() {
        String msg = "";
        for(int i =0; i < largoCodigo; i++){
            msg += caracteres.charAt(random.nextInt(caracteres.length()));
        }
        return msg;
    }
    
}
