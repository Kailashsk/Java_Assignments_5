import java.util.Scanner;

public class Bulb{

public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
           int flag;
           int arr[]=new int[501];
           for(int i=0;i<50;i++) {
            arr[i]=0;
           }
           for(int i=2;i<=500;i++) {
             for(int j=i;j<=500;j++) {
              if(j%i==0) {
               if(arr[j]==0)
                 arr[j]=1;
               else if(arr[j]==1)
                arr[j]=0;
              }
             }
           }
      
   for(int i=2;i<=500;i++) {
    if(arr[i]==0)
     System.out.println("the bulb present in" +arr[i]+ " position is off");
   }

}
}
  
