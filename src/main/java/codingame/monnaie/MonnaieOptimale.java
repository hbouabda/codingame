package codingame.monnaie;

public class MonnaieOptimale {

    static Monnaie monnaieOptimale( long s){

        Monnaie monnaie = new Monnaie();

        if(s == 2L) {
            monnaie.setMonnaie2(1);
        }else if ( s == 5L){
            monnaie.setMonnaie5(1);
        }else if ( s ==10L){
            monnaie.setMonnaie10(1);
        }else{
            long reste=0;
            monnaie.setMonnaie10((s/10L));
            reste = s%10L;
            monnaie.setMonnaie5((reste/5L));
            reste= reste%5L;
            monnaie.setMonnaie2((reste/2L));
            reste= reste%2L;
            monnaie.setReste(reste);
        }
        return monnaie;
    }

    public static void main (String args[]){
        Monnaie monnaie = monnaieOptimale( 8);
        System.out.println("nombre de 10  "+ monnaie.getMonnaie10());
        System.out.println("nombre de 5  "+ monnaie.getMonnaie5());
        System.out.println("nombre de 2  "+ monnaie.getMonnaie2());
        System.out.println("reste  "+ monnaie.getReste());
    }
}
