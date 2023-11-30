package ch02.diagramaclase.asociacio_reflexiva;

public class Empleado {
    Empleado superior;
    Empleado[] subordinados;

    public Empleado(int mx){
        subordinados = new Empleado[mx];
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado(10);
        empleado.superior = new Empleado(1);
        for(int i = 0; i < 10; i++){
            empleado.subordinados[i] = new Empleado(1);
        }
    }
}
