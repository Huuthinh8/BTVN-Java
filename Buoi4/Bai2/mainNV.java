
import java.util.Scanner;

public class mainNV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien NV1 = new NhanVien();
        NhanVien NV2 = new NhanVien();
        NhanVien NV3 = new NhanVien();
        NhanVien NV4 = new NhanVien();
        NhanVien NV5 = new NhanVien();
        System.out.println("Nhap ten NV1: ");
        NV1.setTenNV(scanner.nextLine());
        System.out.println("Nhap tuoi NV1:");
        NV1.setTuoi(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap dia chi NV1:");
        NV1.setDiaChi(scanner.nextLine());
        System.out.println("Nhap bo phan NV1:");
        NV1.setBoPhan(scanner.nextLine());

        System.out.println("Nhap ten NV2: ");
        NV2.setTenNV(scanner.nextLine());
        System.out.println("Nhap tuoi NV2:");
        NV2.setTuoi(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap dia chi NV2:");
        NV2.setDiaChi(scanner.nextLine());
        System.out.println("Nhap bo phan NV2:");
        NV2.setBoPhan(scanner.nextLine());

        System.out.println("Nhap ten NV3: ");
        NV3.setTenNV(scanner.nextLine());
        System.out.println("Nhap tuoi NV3:");
        NV3.setTuoi(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap dia chi NV3:");
        NV3.setDiaChi(scanner.nextLine());
        System.out.println("Nhap bo phan NV3:");
        NV3.setBoPhan(scanner.nextLine());

        System.out.println("Nhap ten NV4: ");
        NV4.setTenNV(scanner.nextLine());
        System.out.println("Nhap tuoi NV4:");
        NV4.setTuoi(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap dia chi NV4:");
        NV4.setDiaChi(scanner.nextLine());
        System.out.println("Nhap bo phan NV4:");
        NV4.setBoPhan(scanner.nextLine());

        System.out.println("Nhap ten NV5: ");
        NV5.setTenNV(scanner.nextLine());
        System.out.println("Nhap tuoi NV5:");
        NV5.setTuoi(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap dia chi NV5:");
        NV5.setDiaChi(scanner.nextLine());
        System.out.println("Nhap bo phan NV5:");
        NV5.setBoPhan(scanner.nextLine());

        System.out.println("MaNV "+ " TenNV" + "  Tuoi" + "  Diachi " + "  BoPhan");
        System.out.println(NV1.manv()+"      "+NV1.getTenNV()+"     "+NV1.getTuoi()+"     "+NV1.getDiaChi()+"   "+NV1.getBoPhan());
        System.out.println(NV2.manv()+"      "+NV2.getTenNV()+"     "+NV2.getTuoi()+"     "+NV2.getDiaChi()+"   "+NV2.getBoPhan());
        System.out.println(NV3.manv()+"      "+NV3.getTenNV()+"     "+NV3.getTuoi()+"     "+NV3.getDiaChi()+"   "+NV3.getBoPhan());
        System.out.println(NV4.manv()+"      "+NV4.getTenNV()+"     "+NV4.getTuoi()+"     "+NV4.getDiaChi()+"   "+NV4.getBoPhan());
        System.out.println(NV5.manv()+"      "+NV5.getTenNV()+"     "+NV5.getTuoi()+"     "+NV5.getDiaChi()+"   "+NV5.getBoPhan());
    }
}
