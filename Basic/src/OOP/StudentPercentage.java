
package OOP;
import java.util.Scanner;
public class StudentPercentage {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int m1=sc.nextInt(), m2=sc.nextInt(), m3=sc.nextInt(),
                    m4=sc.nextInt(), m5=sc.nextInt();

            int total=m1+m2+m3+m4+m5;
            double p=total/5.0;

            System.out.println("Total = "+total);
            System.out.println("Percentage = "+p);

            if(m1<35||m2<35||m3<35||m4<35||m5<35)
                System.out.println("Fail");
            else if(p>=85) System.out.println("Distinction");
            else if(p>=70) System.out.println("First Class");
            else if(p>=60) System.out.println("Second Class");
            else if(p>=50) System.out.println("Pass Class");
            else System.out.println("Pass");

            int max=Math.max(m1,Math.max(m2,Math.max(m3,Math.max(m4,m5))));
            System.out.println("Highest Marks = "+max);
        }
    }
