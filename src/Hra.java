public class Hra {

    private Hrac hrac1;
    private Hrac hrac2;

    public Hra() {
        this.hrac1 = new Hrac("player1", 'o');
        this.hrac2 = new Hrac("player2", 'x');
    }



    public void start(){
        Hra hra = new Hra();
        System.out.println(hrac1.getSymbol()+"  " +hrac2.getSymbol());
    }
}

