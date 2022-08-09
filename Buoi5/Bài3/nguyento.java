import java.util.Scanner;

public class nguyento {
    public static boolean isPrime(int n) {
        if (n < 2)
            System.out.println(n + "khong phai so nguyen to");
        else {
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0)
                    return false;
            }
            return n >= 2;
        }
    }

}
   public static boolean isPrime(long n){
       if(n<2)
           System.out.println(n + "khong phai so nguyen to");
       else{
           for(int i=2;i<n-1;i++)
           {
               if(n%i==0)
                   return false;
           }
           return n>=2;
       }
}
    public  static  boolean isPrime(float n){
        if(n<2)
            System.out.println(n + "khong phai so nguyen to");
        else{
            for(int i=2;i<n-1;i++)
            {
                if(n%i==0)
                    return false;
            }
            return n>=2;
        }
    }
    public  static  boolean isPrime(double n) {
        if (n < 2)
            System.out.println(n + "khong phai so nguyen to");
        else {
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0)
                    return false;
            }
            return n >= 2;
        }
    }

    public static void main(String[] args) {

        if (isPrime(5.77) == false) {
            System.out.println("Day khong phai so nguyen to !");
        } else {
            System.out.println("Day la so nguyen to !");
        }
}
