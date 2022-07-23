import java.util.Scanner;

public class BTVN3 {
    public static  double tinhtong(int a[],int n){
        int dem=0;
        float tong=0;
        for(int i=0;i<n;i++)
        {
            if(a[i] % 2 != 0 && i % 2 != 0)
            {
                dem++;
                tong+=a[i];
            }
        }
        return tong/dem;
    }

    public static void vitrimin(int a[],int n){
        int Min=a[0];
        for(int i=1;i<n;i++)
        {
            if(Min>a[i])
            {
                Min=a[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==Min)
                System.out.print((i+1)+" ");
        }
    }

    public static boolean kiemtra(int n){
        for(int i=2;i<n;i++)
        {
            if(n % i == 0)
                return false;
        }
        return n>=2;
    }

    public static void songuyento(int a[],int n){
        for(int i=0;i<n;i++)
        {
            if(kiemtra(a[i])==true)
                System.out.print(a[i]+" ");
        }
    }
    public static boolean ktscp(double n){
        double c = Math.sqrt(n);
        return (c - Math.floor(c) == 0);
    }
    public static void scp(int a[],int n){
        for(int i=0;i<n;i++)
        {
            if(ktscp(a[i])==true)
                System.out.print(a[i]+" ");
        }
    }
    public static void sapxep(int a[],int n){
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int tg=a[i];
                        a[i]=a[j];
                        a[j]=tg;
                }
            }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[],n;
        System.out.println("Nhap n:");
        n=scanner.nextInt();
        a =new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"]=");
            a[i]=scanner.nextInt();
        }
        System.out.println("Mang vua nhap la:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\n-TBC = "+tinhtong(a,n));
        System.out.println("-Cac vi tri co gia tri nho nhat trong mang la:");
        vitrimin(a,n);
        System.out.println("\n-Cac so nguyen to la:");
        songuyento(a,n);
        System.out.println("\nSo chinh phuong trong mang la:");
        scp(a,n);
        sapxep(a,n);
        System.out.println("\nMang da sap xep la:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
