package ch02.diagramaclase;

import java.security.PublicKey;

public class Invitado {
    public static final double MIN = 200.0;
    public static String status = "Rey";
    private double cantidad_dinero;
    boolean hambre;
    protected String[] amigos;
    public char[] alfabeto;

    // atributo derivado
    public boolean invitarAmigos(){
        return cantidad_dinero > MIN;
    }

    public Invitado(){
        hambre = true;
        amigos = new String[10];
        amigos[0] = new String();
        for(int i = 0; i < 26; i++){
            alfabeto[i] = (char) ('a' + i);
        }
    }

}
