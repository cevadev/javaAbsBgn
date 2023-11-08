package ch02.diagramaclase;
// corte
public class Court implements Meal{
    public String name;

    public Court(String n){
        this.name = n;
    }
    @Override
    public void eaten() {
        System.out.println("Court " + this.name + " is eaten");
    }
}
