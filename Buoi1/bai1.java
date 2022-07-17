
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ngay;
        int thang;
        System.out.println("Nhap ngay:");
        ngay = scanner.nextInt();
        System.out.println("Nhap thang:");
        thang = scanner.nextInt();
        if (ngay < 1 || ngay > 31 || thang < 1 || thang > 12)
            System.out.println("Khong co ngay thang do.");
        else
        {
            System.out.println("Ngay "+ngay +"Thang "+thang);
            if((ngay >= 21 && thang == 3) || (ngay <= 19 && thang == 4))
                System.out.println("Thuoc cung Bach Duong:(21/3 - 19/4)");
            else if((ngay >= 20 && thang == 4) || (ngay <= 20 && thang == 5))
                System.out.println("Thuoc cung Kim Nguu:(20/4 - 20/5)");
            else if((ngay >= 21 && thang == 5) || (ngay <= 21 && thang == 6))
                System.out.println("Thuoc cung Song Tu:(21/5 - 21/6)");
            else if((ngay >= 22 && thang == 6) || (ngay <= 22 && thang == 7))
                System.out.println("Thuoc cung Cu Giai:(22/6 - 22/7)");
            else if((ngay >= 23 && thang == 6) || (ngay <= 22 && thang == 8))
                System.out.println("Thuoc cung Su Tu:(23/6 - 22/8)");
            else if((ngay >= 23 && thang == 8) || (ngay <= 23 && thang == 9))
                System.out.println("Thuoc cung Xu Nu:(23/8 - 23/9)");
            else if((ngay >= 24 && thang == 9) || (ngay <= 23 && thang == 10))
                System.out.println("Thuoc cung Thien Binh:(24/9 - 23/10)");
            else if((ngay >= 24 && thang == 10) || (ngay <= 22 && thang == 11))
                System.out.println("Thuoc cung Than Nong:(24/10 - 22/11)");
            else if((ngay >= 23 && thang == 11) || (ngay <= 21 && thang == 12))
                System.out.println("Thuoc cung Nhan Ma:(23/11 - 21/12)");
            else if((ngay >= 22 && thang == 12) || (ngay <= 19 && thang == 1))
                System.out.println("Thuoc cung Ma Ket:(22/12 - 19/1)");
            else if((ngay >= 20 && thang == 1) || (ngay <= 18 && thang == 2))
                System.out.println("Thuoc cung Song Tu:(20/1 - 18/2)");
            else
                System.out.println("Thuoc cung Song Ngu:(19/2 - 20/3)");
        }
    }
}
