import java.util.*;
public class StatisticsMain {
    public static void main(String[] args) {
        String cont;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Select Averages from below");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("1.Arithmetic Mean \n2.Harmonic Mean \n3.Median \n4.Mode");
            System.out.println("------------------------------------------------------------------------");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Arithmetic Mean ");
                    System.out.println("Select Series Type ");
                    System.out.println("1.Simple \n2.Discrete \n3.Continuous");
                    ArithmeticMean am = new ArithmeticMean();
                    int type = sc.nextInt();
                    System.out.println("------------------------------------------------------------------------");
                    switch (type) {
                        case 1:
                            System.out.println("You Selected Simple ");
                            System.out.printf("Arithmetic Mean for Simple Series is :\n%.2f", am.simple());
                            System.out.println();
                            System.out.println("------------------------------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("You Selected Discrete ");
                            //  System.out.println("------------------------------------------------------------");
                            System.out.printf("Arithmetic Mean for Discrete series is :\n%.2f", am.discrete());
                            System.out.println();
                            System.out.println("------------------------------------------------------------------------");
                            break;
                        case 3:
                            System.out.println("You Selected Continuous ");
                            System.out.printf("Arithmetic Mean for Continuous Series is :\n%.2f", am.continuous());
                            System.out.println();
                            System.out.println("------------------------------------------------------------------------");
                            break;
                        default:
                            System.out.println("invalid type ");
                    }
                    break;
                case 2:
                    System.out.println("You selected Harmonic Mean ");
                    HarmonicMean hm = new HarmonicMean();

                    System.out.println("Select Series");
                    System.out.println("1.Simple \n2.Discrete \n3.Continuous");
                    int hmChoice = sc.nextInt();

                    switch (hmChoice) {
                        case 1:
                            System.out.println("You Selected Simple ");
                            System.out.printf("Harmonic Mean For Simple Series is :\n %.2f", hm.simple());
                            System.out.println();
                            System.out.println("------------------------------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("You Selected Discrete ");
                            System.out.printf("Harmonic Mean For Discrete Series is :\n %.2f", hm.discrete());
                            System.out.println();
                            System.out.println("------------------------------------------------------------------------");
                            break;
                        case 3:
                            System.out.println("You Selected Continuous ");
                            System.out.printf("Harmonic Mean for Continuous Series is :\n %.2f", hm.continuous());
                            System.out.println();
                            System.out.println("------------------------------------------------------------------------");
                            break;
                        default:
                            System.out.println("Invalid Choice ");
                    }
                    break;
                case 3:
                    System.out.println("You selected Median");
                    Median median=new Median();
                    System.out.println("Select Series");
                    System.out.println("1.Simple \n2.Discrete \n3.Continuous");
                   int  med=sc.nextInt();
                    System.out.println("------------------------------------------------------------------------");
                    switch(med)
                    {
                        case 1:
                            System.out.println("You Selected Simple ");
                            System.out.printf("Median for Simple Series is : \n%.2f",median.simple());
                            System.out.println();
                            System.out.println("------------------------------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("You Selected Discrete ");
                            System.out.printf("Median for Discrete Series is : \n%.2f",median.discrete());
                            System.out.println();
                            System.out.println("------------------------------------------------------------------------");
                            break;
                        case 3:
                            System.out.println("You Selected Continuous ");
                            System.out.printf("Median for Continuos Series is : \n%.2f",median.continuous());
                            System.out.println();
                            System.out.println("------------------------------------------------------------------------");
                           // System.out.printf("%.2f",median);
                            break;
                        default:
                            System.out.println("invalid");
                    }
                    break;
                 case 4:
                     System.out.println("You selected Mode ");
                     Mode mode=new Mode();
                     System.out.println("Select Series");
                     System.out.println("1.Simple \n2.Discrete \n3.Continuous");
                     int  mod=sc.nextInt();
                     System.out.println("------------------------------------------------------------------------");
                     switch(mod)
                     {
                         case 1:
                             System.out.println("You Selected Simple ");
                             System.out.println("Mode for Simple series is =\n"+mode.simple());
                             System.out.println();
                             System.out.println("------------------------------------------------------------------------");
                             break;
                         case 2:
                             System.out.println("You Selected Discrete");
                             System.out.println("Mode for Discrete Series is =\n"+mode.discrete());
                             System.out.println();
                             System.out.println("------------------------------------------------------------------------");
                             break;
                         case 3:
                             System.out.println("You Selected Continuous");
                             System.out.printf("Mode for Continuos Series is : \n%.2f",mode.continuous());
                             System.out.println();
                             System.out.println("------------------------------------------------------------------------");
                             break;
                         default:
                             System.out.println("invalid");
                     }
                    break;
                default:
                    System.out.println("invalid choice");
            }
            System.out.println(" Do you want to continue Press 1 ");
             cont=sc.next();
        }while(cont.equalsIgnoreCase("1"));
    }
}
