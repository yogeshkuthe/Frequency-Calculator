import java.util.HashMap;
import java.util.Scanner;

public class Mode {
    Scanner sc = new Scanner(System.in);

    public int simple() {
        System.out.println("Enter Range(Number of Observation)");
        int range = sc.nextInt();
        int[] observation = new int[range];
        System.out.println("Enter X(Observation)");
        for (int i = 0; i < range; i++) {
            observation[i] = sc.nextInt();       //x
        }
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i : observation) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        int maxvalue = 0;
        int maxKey = 0;
        for (int key : hm.keySet()) {
            if (hm.get(key) > maxvalue) {
                maxvalue = hm.get(key);
                maxKey = key;
            }
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Maximum repeating value is =" + maxKey);
        System.out.println("------------------------------------------------------------------------");
        return maxKey;
    }

    public int discrete() {
        System.out.println("Enter Range(Number of Observation)");
        int range = sc.nextInt();
        int[] observation = new int[range];
        int[] freq = new int[range];
        System.out.println("Enter X(Observation)");
        for (int i = 0; i < range; i++) {
            observation[i] = sc.nextInt();                          //x
        }
        System.out.println("Enter F (Frequency)");
        for (int i = 0; i < range; i++) {
            freq[i] = sc.nextInt();                         //y
        }
        int max = 0;
        int maxvalue = 0;
        for (int i = 0; i < range; i++) {
            if (freq[i] > max) {
                max = freq[i];
                maxvalue = observation[i];
            }
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Maximum Freuency is=\n" + max);
//        System.out.println("------------------------------------------------------------------------");
//        System.out.println("Mode for Discrete Series is =\n"+maxvalue);
        return maxvalue;
    }

    public double continuous() {
        System.out.println("Enter Range(Number of Observation)");
        int range = sc.nextInt();
        double[] lower = new double[range];
        double[] upper = new double[range];
        System.out.println("Enter Lower limit");
        for (int i = 0; i < range; i++) {
            lower[i] = sc.nextDouble();            //x
        }
        System.out.println("Enter Upper limit");
        for (int i = 0; i < range; i++) {
            upper[i] = sc.nextDouble();            //y
        }
//        for (int i = 0; i < range; i++) {
//            w[i] = y[i] - x[i];
//        }

        System.out.println("C.I(Class Interval");
        for (int i = 0; i < range; i++) {
            System.out.print(lower[i] + "-" + upper[i] + "\t");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        double[] freq = new double[range];
        System.out.println("Enter F (Frequency)");
        for (int i = 0; i < range; i++) {
            freq[i] = sc.nextDouble();          //z
        }
        double max = 0;
        double lowerlimit = 0;
        double upperlimit = 0;
        for (int i = 0; i < range; i++) {
            if (freq[i] > max) {
                max = freq[i];
                lowerlimit = lower[i];
                upperlimit = upper[i];
            }
        }
        double f0 = 0;
        double f2 = 0;
        if (max == freq[0] | max == freq[freq.length - 1]) {
            System.out.println("Cannot find Frequency");
        } else {
            for (int i = 0; i < range; i++) {
                if (max == freq[i]) {
                    f0 = freq[i - 1];
                    f2 = freq[i + 1];
                }
            }
        }

            System.out.println("------------------------------------------------------------------------");
            System.out.println("Maximum Frequency is=\n" + max);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Modal class is =\n" + lowerlimit + "-" + upperlimit);
            System.out.println("------------------------------------------------------------------------");
            System.out.print("L1=" + lowerlimit + "\t" + "L2=" + upperlimit + "\t" + "F1=" + max + "\t" + "F0=" + f0 + "\t" + "F2=" + f2);
            System.out.println();
            System.out.println("------------------------------------------------------------------------");
            double mode = lowerlimit + ((max - f0) / (2 * max - f0 - f2)) * (upperlimit - lowerlimit);
            return mode;

    }
}
