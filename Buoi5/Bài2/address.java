import java.util.Scanner;

public class address {
    private int id;
    private String  district;
    private String province;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id:");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap huyen:");
        district = scanner.nextLine();
        System.out.println("Nhap tinh:");
        province=scanner.nextLine();
    }
    public void xuat(){

        System.out.println(id+ "   "+province+"   "+district);
    }
}
