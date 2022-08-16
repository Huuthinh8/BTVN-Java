import java.util.Scanner;

public class nhanvien extends canbo{
    protected String congviec;

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
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
        System.out.println("Nhap cong viec quan ly:");
        congviec = scanner.nextLine();
    }
    public void xuat(){
        System.out.println(id+" "+Hoten+" "+Namsinh+" "+Gioitinh+" "+Diachi+" "+congviec);
    }
}
