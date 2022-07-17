import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Nhap canh a:");
        a = scanner.nextInt();
        System.out.println("Nhap canh b:");
        b = scanner.nextInt();
        System.out.println("Nhap canh c:");
        c = scanner.nextInt();

        if(a <= 0 || b <= 0 || c <= 0)
            System.out.println("Khong hop le");
        else
        {
            if(( a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == a*a + b*b))
            {
                System.out.println("Tam giac do la tam giac vuong");
                if(a==b || a==c || b==c)
                    System.out.println("Tam giac do la tam giac vuong can");
            }
            else if(a==b && b==c)
                System.out.println("Tam giac do la tam giac deu");
            else if(a==b || a==c || b==c)
                System.out.println("Tam giac do la tam giac can");
            else
                System.out.println("Tam giac do la tam giac thuong");
        }
    }
}
