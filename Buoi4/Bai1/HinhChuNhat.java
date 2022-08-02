import java.util.Scanner;

public class HinhChuNhat {
    private float chieudai;
    private float chieurong;
    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai:");
        chieudai = scanner.nextFloat();
        System.out.println("Nhap chieu rong:");
        chieurong = scanner.nextFloat();
    }
    void xuat(){
        System.out.println("Nhap chieu dai:" + chieudai);
        System.out.println("Nhap chieu rong:" + chieurong);
    }
    double dientich(){
        double S = chieudai * chieurong ;
        return S;
    }
    double chuvi(){
        double P = 2*( chieudai + chieurong) ;
        return P;
    }

    public HinhChuNhat() {
    }

    public float getChieudai() {
        return chieudai;
    }

    public void setChieudai(float chieudai) {
        this.chieudai = chieudai;
    }

    public float getChieurong() {
        return chieurong;
    }

    public void setChieurong(float chieurong) {
        this.chieurong = chieurong;
    }
    public void DienTich(){
       double dt = chieudai * chieurong;
        System.out.println("Dien tich HCN = " + dt);
    }
    public void ChuVi(){
        double cv = 2*(chieudai + chieurong);
        System.out.println("Dien tich HCN = " + cv);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HinhChuNhat HCN = new HinhChuNhat();
        HCN.nhap();
        HCN.xuat();
        System.out.println("Dien tich HCN = "+ HCN.dientich());
        System.out.println("Chu vi HCN = "+ HCN.chuvi());
    }
}
