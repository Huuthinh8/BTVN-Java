import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap n:");
        n = scanner.nextInt();
        System.out.println("Tong cac so nguyen to la:"+tinhtong(n));
    }
    public static int tinhtong(int n)
    {
        int tong=0;
        for(int i=1;i<=n;i++)
        {
            if(kiemtrasonguyento(i)==1)
                tong+=i;
        }
        return tong;
    }
    public static int kiemtrasonguyento(int n)
    {
        int dem=0;
        for(int i=1; i<=n; i++) {
            if (n % i == 0)
                dem++;
        }
        if(dem==2)
            return 1;
        else
            return 0;
    }
}
