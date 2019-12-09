package codingame.premier;

public class Premier {

    public static void estPremier(int nbr) {
        // test 0 et 1
        int reste;
        boolean flag = true;

        for(int i=2; i <= nbr/2; i++)
        {
            //si le reste est 0, alors arrete la boucle. Sinon continuer la boucle
            if(nbr%i == 0)
            {
                flag = false;
                break;
            }
        }
        //si flag est true, alors nombre est premier, sinon non premier
        if(flag)
            System.out.println(nbr + " est un nombre premier");
        else
            System.out.println(nbr + " n'est pas un nombre premier");
    }

    public static void main(String args[]) {

        estPremier(7);
        estPremier(14);
        estPremier(15);
        estPremier(17);
        estPremier(-17);
    }
}
