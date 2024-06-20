import java.util.Scanner;

public class ArithmeticMean {
    Scanner sc=new Scanner(System.in);
    public double simple()
    {
        System.out.println("Enter Range");
       int range=sc.nextInt();
        double sum=0;
        double[] x=new double[range];
        System.out.println("Enter X(Observation)");
        for(int i=0;i<range;i++)
        {
            x[i]=sc.nextDouble();
            sum=sum+x[i];
        }
        System.out.println("------------------------------------------------------------------------");
       double am=(sum/range);
return am;
    }
    public double discrete()
    {
        System.out.println("Enter Range");
        int range=sc.nextInt();
        double[] x=new double[range];
        System.out.println("Enter X(Observation)");
        for(int i=0;i<range;i++)
        {
            x[i]=sc.nextDouble();
        }
        System.out.println("Enter F(Frequency)");
       double sumFreq=0;
        double[] f=new double[range];

        for(int i=0;i<range;i++)
        {
            f[i]=sc.nextDouble();
            sumFreq=sumFreq+f[i];            // sum of the frequency
        }

        double[] result=new double[range];
       double sumXandF=0;
        for (int i=0;i<range;i++)
        {
            result[i]=x[i]*f[i];
            sumXandF=sumXandF+result[i]; //summation of xifi
        }
        System.out.println("------------------------------------------------------------------------");
       double am=sumXandF/sumFreq;
        System.out.printf("Summation of F (Frequency) is : \n%.2f",sumFreq);
        System.out.println();
        System.out.printf("Summation of (X*F)  is : \n%.2f",sumXandF);
        System.out.println();
        return am;
    }

    public double continuous()
    {
        System.out.println("Enter Range");
       int range=sc.nextInt();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Enter Lower limit");
        double[] lower=new double[range];
        for(int i=0;i<range;i++)
        {
            lower[i]=sc.nextDouble();
        }
        System.out.println("Enter Upper limit");
        double[] upper=new double[range];
        for(int i=0;i<range;i++)
        {
            upper[i]=sc.nextDouble();
        }
        System.out.println("C.I(Class Interval");
        for(int i=0;i<range;i++)
        {
            System.out.print(lower[i]+"-"+upper[i]+"\t");

        }
        System.out.println();
        System.out.println("Enter F (Frequency)");
        double[] freq=new double[range];
        double sum=0;
        for(int i=0;i<range;i++)
        {
            freq[i]=sc.nextDouble();
            sum=sum+freq[i];
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println(" M.V. (Mid Value)");

        double[] midvalue=new double[range];
        for(int i=0;i<range;i++)
        {
           double  midv=(lower[i]+upper[i])/2;
            midvalue[i]=midv;
            System.out.print(midv);
            System.out.print("\t");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Multiplication F*M is ");//summation of xifi

        double[] fm=new double[range];
        for(int i=0;i<range;i++)
        {
            fm[i]=freq[i]*midvalue[i];
            System.out.printf ("%.2f", fm[i]);
            System.out.print("\t");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        double summation=0;
        for(int i=0;i<range;i++)
        {
            summation=summation+fm[i];
        }
        System.out.printf("summation of F*M.V is=\n%.2f",summation);
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("Summation of F (Frequency) is=\n%.2f",sum);
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
       double am=(summation/sum);
        return am;
    }
}
