package ch02.diagramaclase;

import java.security.PublicKey;

public class Invitado {
    public static final double MIN = 200.0;
    public static String status = "Rey";
    private double cantidadDinero;
    boolean hambre;
    protected String[] amigos;
    public char[] alfabeto;

    // atributo derivado
    public boolean invitarAmigos(){
        return cantidadDinero > MIN;
    }

    public Invitado(){
        hambre = true;
        amigos = new String[10];
        amigos[0] = new String();
        for(int i = 0; i < 26; i++){
            alfabeto[i] = (char) ('a' + i);
        }
    }

    public void setCantidadDinero(double cantidadDinero){
        if(cantidadDinero > 0){
            this.cantidadDinero = cantidadDinero;
        }
    }

    public double getCantidadDinero(){
        return this.cantidadDinero;
    }

    public static String getMINAsString(){
        return "Cantidad minima de dinero " + MIN;
    }

    public void setAmigo(final String amigo, int pos){
        if(pos <= 9 && pos > 0){
            amigos[pos] =  amigo;
        }
    }

    public void getMejorAmigo(StringBuffer amigo){
        amigo.append(this.amigos[0]);
    }

    public String[] getAmigos(){
        return this.amigos;
    }

    public String getAlphabet(int start, int end){
        StringBuffer temp = new StringBuffer();
        for(int i = start-1; ){}
    }
}
