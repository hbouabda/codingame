package codingame.kariakoo;

public class Kariakoo {

    static int getPositionAt(int n) {

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        if (n == 2)
            return -1;


        int etapeAvantDernierePosition = 1;
        int etapeDernierePosition = -2;
        int position = -1;
        int stage = 2;

        while (stage < n) {
            int etapePositionActuel = etapeDernierePosition - etapeAvantDernierePosition;
            position = position + etapePositionActuel;
            stage++;
            etapeAvantDernierePosition = etapeDernierePosition;
            etapeDernierePosition = etapePositionActuel;

        }

        return position;

    }

    public static void main(String args[]){
        System.out.println(getPositionAt(0));
        System.out.println(getPositionAt(1));
        System.out.println(getPositionAt(2));
        System.out.println(getPositionAt(3));
        System.out.println(getPositionAt(100000));
        System.out.println(getPositionAt(Integer.MAX_VALUE));

    }
}
