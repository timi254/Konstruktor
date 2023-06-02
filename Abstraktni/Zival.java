public abstract class Zival{
    //atribut
    protected String ime;

    //konstruktor
    Zival(String imeZivali){
        ime=imeZivali;
    }

    //metode
    public String vrniIme(){
        return ime;
    }
    
    public abstract void oglasanje(); //abstraktna metoda
}