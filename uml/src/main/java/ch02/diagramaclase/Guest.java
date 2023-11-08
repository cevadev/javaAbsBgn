package ch02.diagramaclase;

public class Guest {
    public static final double MIN = 200.0;
    public static String status = "Rey";
    private double moneyQuantity;
    boolean hungry;
    protected String[] friends;
    public char[] alphabet;

    // atributo derivado
    public boolean inviteFriends(){
        return moneyQuantity > MIN;
    }

    public Guest(){
        hungry = true;
        friends = new String[10];
        friends[0] = new String();
        for(int i = 0; i < 26; i++){
            alphabet[i] = (char) ('a' + i);
        }
    }

    public void setCantidadDinero(double cantidadDinero){
        if(cantidadDinero > 0){
            this.moneyQuantity = cantidadDinero;
        }
    }

    public double getMOneyQuantity(){
        return this.moneyQuantity;
    }

    public static String getMINAsString(){
        return "Cantidad minima de dinero " + MIN;
    }

    public void setFriend(final String amigo, int pos){
        if(pos <= 9 && pos > 0){
            friends[pos] =  amigo;
        }
    }

    public void getBestFriend(StringBuffer amigo){
        amigo.append(this.friends[0]);
    }

    public String[] getFriends(){
        return this.friends;
    }

    public String getAlphabet(int start, int end){
        StringBuffer temp = new StringBuffer();
        for(int i = start-1; i < alphabet.length && i < end; i++){
            temp.append(alphabet[i]);
        }
        return temp.toString();
    }
}
