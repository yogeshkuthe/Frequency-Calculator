import java.util.Scanner;

public class HarmonicMean {
    Scanner sc = new Scanner(System.in);

    public double simple() {
        System.out.println("Enter Range(Number of Observation)");
        int range = sc.nextInt();
        System.out.println("Enter X(Observation)");
        double[] observation = new double[range];
        for (int i = 0; i < range; i++) {
            observation[i] = sc.nextDouble();
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("1/x is =");
        double[] inverseOfx = new double[range];
        for (int i = 0; i < range; i++) {
            inverseOfx[i] = 1 / observation[i];
            System.out.printf("%.2f", inverseOfx[i]);
            System.out.print("\t");
        }
        System.out.println();
        double sum = 0;
        for (int i = 0; i < range; i++) {
            sum = sum + inverseOfx[i];
        }
        System.out.println("------------------------------------------------------------------------");
        double hm;
        hm = (range / sum);
        return hm;
    }

    public double discrete() {
        System.out.println("Enter Range(Number of Observation)");
        int range = sc.nextInt();
        System.out.println("Enter X(Observation)");
        double[] observation = new double[range];

        for (int i = 0; i < range; i++) {
            observation[i] = sc.nextDouble();         //x
        }

        System.out.println("Enter F(Frequency)");
        double[] freq = new double[range];
        double sum = 0;
        for (int i = 0; i < range; i++) {
            freq[i] = sc.nextDouble();                     //y
            sum = sum + freq[i];
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("Summation of F(Frequency) is=\n %.4f", sum);// summation of f
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("F/X is =");
        double z[] = new double[range];

        double summation = 0;
        for (int i = 0; i < range; i++) {
            z[i] = freq[i] / observation[i];
            System.out.printf("%.4f", z[i]);
            System.out.print("\t");
            summation = summation + z[i];
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("Summation of F/X is =\n %.4f", summation);//summation of f/x
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        double hm = sum / summation;

        return hm;
    }

    public double continuous() {
        double hm;
        System.out.println("Enter Range(Number of Observation)");
        int range = sc.nextInt();
        System.out.println("Enter Lower limit");
        double[] lower = new double[range];

        for (int i = 0; i < range; i++) {
            lower[i] = sc.nextDouble();                        //x
        }

        System.out.println("Enter Upper limit");
        double upper[] = new double[range];
        for (int i = 0; i < range; i++) {
            upper[i] = sc.nextDouble();       //y
        }

        System.out.println("C.I(Class Interval");
        for (int i = 0; i < range; i++) {
            System.out.print(lower[i] + "-" + upper[i] + "\t");
        }
        System.out.println();

        double[] diff = new double[range];

        for (int i = 0; i < range; i++) {
            diff[i] = upper[i] - lower[i];
        }

        double value = upper[0] - lower[0];
        double cal = 0;
        for (int i = 0; i < range; i++) {
            if (value == diff[i]) {
                cal = cal + 1;
            }
        }

        if (cal == range & value != 0) {
            System.out.println();
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Enter F (Frequency)");
            double freq[] = new double[range];
            double sum = 0;
            for (int i = 0; i < range; i++) {
                freq[i] = sc.nextDouble();                     //v
                sum = sum + freq[i];
            }
            System.out.println("------------------------------------------------------------------------");
            System.out.println("M.V (Mid Value) is");

            double[] midValue = new double[range];
            for (int i = 0; i < range; i++) {
                double midv = (lower[i] + upper[i]) / 2;
                midValue[i] = midv;

                System.out.print(midv);
                System.out.print("\t");
            }
            System.out.println();
            System.out.println("------------------------------------------------------------------------");
            System.out.println("F/x (Division) is");
            double division[] = new double[range];
            for (int i = 0; i < range; i++) {
                division[i] = (freq[i] / midValue[i]);                            //w
                System.out.printf("%.2f", division[i]);
                System.out.print("\t");
            }
            System.out.println();
            System.out.println("------------------------------------------------------------------------");
            double summation = 0;
            for (int i = 0; i < range; i++) {
                summation = summation + division[i];
            }
            System.out.println("Summation of F/x is =");
            System.out.printf("%.2f", summation);
            System.out.println();
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Summation of F (Frequency)is =");
            System.out.printf("%.2f", sum);
            System.out.println();
            System.out.println("------------------------------------------------------------------------");
           hm = (sum / summation);
            return hm;

        }else
        {
            System.out.println("Class Interval is not in Continuous order");
            return 0;
        }
    }
}
