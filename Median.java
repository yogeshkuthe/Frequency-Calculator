import java.util.Scanner;

public class Median {
    Scanner sc=new Scanner(System.in);
    public double simple()
    {
        System.out.println("Enter Range(Number of Observation)");
       int  range=sc.nextInt();
        System.out.println("Enter X(Observation)");
        double[] observation=new double[range];
        for(int i=0;i<range;i++)
        {
            observation[i]=sc.nextDouble();                   //x
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Arranged in Ascending order");
       double temp;
        for( int i=0;i<range;i++)
        {
            for(int j=i+1;j<range;j++)
            {
                if(observation[i]>observation[j])
                {
                    temp=observation[j];
                    observation[j]=observation[i];
                    observation[i]=temp;
                }
            }
            System.out.print(observation[i]+"\t");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
       double median;
        if(range%2==0)
        {
//            median=(int)(((range-1)/2)+(((range-1)/2))+1)/2;
//            median= ( ((range-1)/2) + ( (range-1)/2 + 1)  ) /2;
            int n1=((range-1)/2);
            int n2=( (range-1)/2 + 1);

             median=(observation[n1]+observation[n2])/2;

            return median;
        }
        else
        {
            int m=((range-1)/2);
            return observation[m];
        }
    }
    public double discrete(){
        System.out.println("Enter Range(Number of Observation)");
       int  range=sc.nextInt();
       double[] observation=new double[range];
        System.out.println("Enter X(Observation");
        for(int i=0;i<range;i++)
        {
            observation[i]=sc.nextDouble();                            //x
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Arranged in Ascending order");
       double  temp=0;

        for( int i=0;i<range;i++)
        {
            for(int j=i+1;j<range;j++)
            {
                if(observation[i]>observation[j])
                {
                    temp=observation[j];
                    observation[j]=observation[i];     // x
                    observation[i]=temp;
                }
            }
            System.out.print(observation[i]+"\t");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        double[] freq=new double[range];
        double sum=0;
        System.out.println("Enter F (Frequency)");
        for(int i=0;i<range;i++)
        {
            freq[i]=sc.nextDouble();                  //y
            sum=sum+freq[i];
        }
        System.out.println("Summation of Frequency is =");
        System.out.printf("%.2f",sum);
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Less Than C.F (Cumulative Frequency)");

        double[] cf=new double[range];
        double c=0;
        for(int i=0;i<range;i++)
        {
            c=c+freq[i];
            cf[i]=c;                                //z
            System.out.printf("%.2f",cf[i]);
            System.out.print("\t");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Calculation of (n+1)/2 is =");
      double  cal=(sum+1)/2;
        System.out.printf("%.2f",cal);
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        double median=0;
        for (int i=0;i<range;i++)
        {
            if(cf[i]>=cal)
            {
                median=observation[i];
//                System.out.println("Median for Discrete Series is =");
//                System.out.println(median);
//                i=5;
                return median;
            }
        }
        return  0;
    }

    public double continuous()
    {
        System.out.println("Enter Range(Number of Observation)");
       int  range=sc.nextInt();
        System.out.println("Enter Lower limit");
        double[] lower=new double[range];
        for(int i=0;i<range;i++)
        {
            lower[i]=sc.nextDouble();                             //x
        }
        System.out.println("Enter Upper limit");
        double[] upper=new double[range];
        for(int i=0;i<range;i++)
        {
            upper[i]=sc.nextDouble();                                   //y
        }
        System.out.println("C.I(Class Interval");
        for(int i=0;i<range;i++)
        {
            System.out.print(lower[i]+"-"+upper[i]+"\t");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("Enter F (Frequency)");
        double freq[]=new double[range];
        double sum=0;
        for(int i=0;i<range;i++)
        {
            freq[i]=sc.nextDouble();                         //v
            sum=sum+freq[i];
        }
        System.out.println("Summation of Frequency is =\n"+sum);
        System.out.println("------------------------------------------------------------");
        System.out.println("Less Than C.F (Cumulative Frequency)");
        double c=0;
        double cf[]=new double[range];

        for(int i=0;i<range;i++)
        {
            c=c+freq[i];
            cf[i]=c;                                      //z
            System.out.printf("%.2f",cf[i]);
            System.out.print("\t");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("Calculate n/2 (Summation of frequency /2)");
       double cal=sum/2;
        System.out.println(cal);
        System.out.println("------------------------------------------------------------");
        System.out.println("Value is >="+cal+" in cf column is=");
        double value=0;
        for (int i=0;i<range;i++)
        {
            if(cf[i]>=cal)
            {
                value=lower[i];
                System.out.println(value);
                System.out.println("------------------------------------------------------------");
                System.out.println("Median class is =\n"+lower[i]+"-"+upper[i]);
                System.out.println("------------------------------------------------------------");
                System.out.print("L1="+lower[i]+"\t"+"L2="+upper[i]+"\t"+"Frequency(F)="+freq[i]+"\n"+"Summation of Frequency is="+sum+"\n"+"Value just before the median class in cf column is="+cf[i-1]);
              double  median=lower[i]+((upper[i]-lower[i])/freq[i])*(cal-cf[i-1]);
                System.out.println();
                System.out.println("------------------------------------------------------------");
//                System.out.println("Median for Continuos Series is=");
//                System.out.printf("%.2f",median);
//                i=5;
                return median;
            }
        }
        return 0;
    }
}
