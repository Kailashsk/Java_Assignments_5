import java.util.Scanner;

public class aq1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a array size");
        int n=sc.nextInt();
        double arr[]= new double[n];
        double sum=0,avg;

        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextDouble();
            sum=sum+arr[i];
        }
        avg=sum/n;
        System.out.println("Sum of Number is "+sum);
        System.out.println("Average of Number is "+avg);
    }
}
