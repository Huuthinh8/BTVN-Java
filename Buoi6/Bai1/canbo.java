import java.util.Scanner;

public class canbo {
    protected int id;
    protected String Hoten;
    protected int Namsinh;
    protected String Gioitinh;
    protected String Diachi;

    public canbo() {
    }

    public canbo(int id, String hoten, int namsinh, String gioitinh, String diachi) {
        this.id = id;
        Hoten = hoten;
        Namsinh = namsinh;
        Gioitinh = gioitinh;
        Diachi = diachi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public int getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(int namsinh) {
        Namsinh = namsinh;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

}
