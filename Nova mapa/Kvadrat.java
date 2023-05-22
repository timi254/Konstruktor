public class Kvadrat extends Stirikotnik{
    int a;

    public Kvadrat(int xx, int yy, int ba, int aa){
        super(xx,yy,ba);
        this.a=aa;
    }
    public void izpisPloscine(){
        System.out.println("Ploščina je: "+this.a*this.a);
    }
}
