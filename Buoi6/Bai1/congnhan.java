import java.util.Scanner;

public class congnhan extends canbo{
    protected String Bac;

    public String getBac() {
        return Bac;
    }

    public void setBac(String bac) {
        Bac = bac;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id:");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ho ten:");
        Hoten = scanner.nextLine();
        System.out.println("Nhap nam sinh:");
        Namsinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh:");
        Gioitinh = scanner.nextLine();
        System.out.println("Nhap dia chi:");
        Diachi = scanner.nextLine();
        System.out.println("Nhap bac:");
        Bac = scanner.nextLine();
    }
    public void xuat(){
        System.out.println(id+" "+Hoten+" "+Namsinh+" "+Gioitinh+" "+Diachi+" "+Bac);
    }
}
