public class Pole {
    private int delka;
    private int sirka;

    public Pole(int delka, int sirka) {
        this.delka = delka;
        this.sirka = sirka;
    }

    public int getDelka() {
        return delka;
    }

    public void setDelka(int delka) {
        this.delka = delka;
    }

    public int getSirka() {
        return sirka;
    }

    public void setSirka(int sirka) {
        this.sirka = sirka;
    }

    public void createPole(){
        for (int i = 0; i < 3; i++){
            System.out.println();
            for (int j = 0; j < 3; j++){
                System.out.print("/" + j + "/");
            }
        }
    }
}