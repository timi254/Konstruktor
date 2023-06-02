public class TestZival {
    public static void main(String[] args) {
        Pes p1=new Pes("piki");
        Pes p2=new Pes("bobi");
        Macka m1=new Macka("Liza");
        
        Zival[]tab=new Zival[3];
        tab[0]=p1;
        tab[1]=p2;
        tab[2]=m1;

        for(int i=0;i<tab.length;i++)
        {
            System.out.print(tab[i].vrniIme()+" ");
            tab[i].oglasanje();
        }
    }
}
