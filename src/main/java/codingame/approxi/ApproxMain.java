package codingame.approxi;

public class ApproxMain {

    static double approx(double[][] pts) {
        if (pts.length == 1) {
            double prob = Math.pow(pts[0][0], 2) + Math.pow(pts[0][1], 2);
            if (prob <= 1) {
                return prob;
            } else {
                return 0;
            }
        } else {
            int cp = 0;
            for (int i = 0; i < pts.length; i++) {
                double prob = Math.pow(pts[i][0], 2) + Math.pow(pts[i][1], 2);
                if (prob < 1) {
                    cp++;
                }
            }
            if (cp > 0) {
                System.out.println("cp : " + cp);
                double estimation = cp * 4 / (double) (pts[0].length);
                System.out.println("estimation : " + estimation);
                return estimation;
            }

            return cp;

        }
    }

    public static void main(String args[]) {
        double[][] array = {{0.5, 0.5},{0.25, 0.25}};
        System.out.println(approx(array));
    }

}
