package ch02.diagramaclase.asociacion;

public class Comensal {
    // un invitado puede asistir a un restaurante
    public Restaurante restaurante;
     public Comensal(Restaurante restaurante){
         this.restaurante = restaurante;
     }
}
