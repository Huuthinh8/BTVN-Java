import java.util.Scanner;

public class mainPhong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phong PH = new Phong();
        System.out.print("Nhap ma phong:");
        PH.setMaPH(scanner.nextLine());
        System.out.print("Nhap ten phong:");
        PH.setTenPH(scanner.nextLine());
        System.out.print("Nhap dien tich:");
        PH.setDientich(Integer.parseInt(scanner.nextLine()));

        QuanLy QL = new QuanLy();
        System.out.print("Nhap ma quan ly:");
        QL.setMaQL(scanner.nextLine());
        PH.setX(QL);
        System.out.print("Nhap ho ten quan ly:");
        QL.setHoten(scanner.nextLine());
        PH.setX(QL);

        May M = new May();
        System.out.print("Nhap ma may:");
        M.setMaM(scanner.nextLine());
        PH.setY(M);
        System.out.print("Nhap kieu may:");
        M.setKieuM(scanner.nextLine());
        PH.setY(M);
        System.out.print("Tinh trang:");
        M.setTinhtrang(scanner.nextLine());
        PH.setY(M);
        System.out.println("Ma phong: "+ PH.getMaPH());
        System.out.println("Ten phong: "+PH.getTenPH());
        System.out.println("Dien tich: "+PH.getDientich());
        System.out.print("Ma quan ly la:"+PH.getX().getMaQL());
        System.out.print("\nHo ten quan ly la:"+PH.getX().getHoten());
        System.out.print("\nMa may:"+PH.getY().getMaM());
        System.out.print("\nKieu may:"+PH.getY().getKieuM());
        System.out.print("\nTinh trang:"+PH.getY().getTinhtrang());
    }
}
