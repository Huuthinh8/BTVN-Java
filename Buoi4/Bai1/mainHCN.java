import java.util.Scanner;

public class mainHCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HinhChuNhat HCN1 = new HinhChuNhat();
        HinhChuNhat HCN2 = new HinhChuNhat();
        System.out.print("Nhap chieu dai 1: ");
        HCN1.setChieudai(scanner.nextFloat());
        System.out.print("Nhap chieu rong 1: ");
        HCN1.setChieurong(scanner.nextFloat());
        System.out.println("Chieu dai 1 = "+ HCN1.getChieudai());
        System.out.println("Chieu rong 1 = "+ HCN1.getChieurong());
        HCN1.DienTich();
        HCN1.ChuVi();

        System.out.print("Nhap chieu dai 2: ");
        HCN2.setChieudai(scanner.nextFloat());
        System.out.print("Nhap chieu rong 2: ");
        HCN2.setChieurong(scanner.nextFloat());
        System.out.println("Chieu dai 2 = "+ HCN2.getChieudai());
        System.out.println("Chieu rong 2 = "+ HCN2.getChieurong());
        HCN2.DienTich();
        HCN2.ChuVi();

        if(HCN1.dientich() < HCN2.dientich())
            System.out.println("Dien tich HCN 2 = "+HCN2.dientich());
        else
            System.out.println("Dien tich HCN 1 = "+HCN1.dientich());
    }
}
