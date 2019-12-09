package codingame.closestozero;

public class ClosestToZero {


    static int closestToZero(int[] ints) {
        if (ints == null || ints.length == 0)
            return 0;
        else {
            int plusProche = ints[0];
            int absPlusProche = Math.abs(plusProche);
            int abs=0;
            for (int i = 1 ; i < ints.length ; i++) {
                abs = Math.abs(ints[i]);
                if( abs == absPlusProche){
                    if( ints[i] >= plusProche){
                        plusProche = ints[i];
                    }
                }else{

                    if( abs <= absPlusProche){
                        plusProche = ints[i];
                        absPlusProche = abs;
                    }
                }
            }
            return plusProche;

        }
    }

    public static void main(String args[]) {
        int[] array = {-3,4,3};
        System.out.println(closestToZero(array));
    }
}
