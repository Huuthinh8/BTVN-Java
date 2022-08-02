import java.util.Scanner;

public class PTB2 {
    float a;
    float b;
    float c;
    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri a: ");
        a = scanner.nextFloat();
        System.out.println("Nhap gia tri b: ");
        b = scanner.nextFloat();
        System.out.println("Nhap gia tri c: ");
        c = scanner.nextFloat();
    }
   void xuat(){
        System.out.println("Phuong trinh bac hai co dang:"+a+"x*x"+" + "+b+"x"+" + "+c+" =0");
    }
    void tinhnghiem(){
        double delta = b*b - 4*a*c;
        if(delta < 0)
        {
            System.out.println("Phuong trinh vo nghiem");
        }
        else if(delta == 0)
        {
            float x1;
            float x2 = x1 = -b/2/a;
            System.out.println("Phuong trinh co nghiem kep la: x1 = x2 = "+x2);
        }
        else{
            double x3 = (-b + Math.sqrt(delta))/2/a;
            double x4 = (-b - Math.sqrt(delta))/2/a;
            System.out.println("Phuong trinh co hai nghiem phan biet la: x1 = "+x3+" va x2 = "+x4);
        }
    }
}
