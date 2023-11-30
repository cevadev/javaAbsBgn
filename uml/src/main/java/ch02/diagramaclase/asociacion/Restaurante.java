package ch02.diagramaclase.asociacion;

public class Restaurante {
    // puede recibir desde 0 hasta 50 invitados
    public Comensal[] cliente;

    public Restaurante(){
        cliente = new Comensal[50];
    }
}
