import java.util.Scanner;

public class kysu extends canbo{
    protected String Nganh;

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
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
        System.out.println("Nhap nganh dao tao:");
        Nganh = scanner.nextLine();
    }
    public void xuat(){
        System.out.println(id+" "+Hoten+" "+Namsinh+" "+Gioitinh+" "+Diachi+" "+Nganh);
    }
}
