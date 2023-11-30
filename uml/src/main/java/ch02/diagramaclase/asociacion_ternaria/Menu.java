package ch02.diagramaclase.asociacion_ternaria;

/**
 * La asociacion N-Aria se implementa como una clase (Menu)
 */
public class Menu {
    // hacemos una combinacion de entreda, segundo, postre
    private Entrada entrada;
    private Segundo segundo;
    private Postre postre;

    // los atributos se inicializan en el constructor
    public Menu(Entrada e, Segundo s, Postre p){
        entrada = e;
        segundo = s;
        postre = p;
    }

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Segundo segundo1 = new Segundo();
        Segundo segundo2 = new Segundo();
        Postre postre = new Postre();

        Menu menu1 = new Menu(entrada, segundo1, postre);
        Menu menu2 = new Menu(entrada, segundo2, postre);
    }
}
