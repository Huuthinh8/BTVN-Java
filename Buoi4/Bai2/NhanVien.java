public class NhanVien {
    static int MaNV = 0;
    private  String TenNV;
    int tuoi;
    private String DiaChi;
    private String BoPhan;

    public static int getMaNV() {
        return MaNV;
    }

    public static void setMaNV(int maNV) {
        MaNV = maNV;
    }

    public int manv(){
        MaNV++;
        return NhanVien.getMaNV();
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }
    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getBoPhan() {
        return BoPhan;
    }

    public void setBoPhan(String boPhan) {
        BoPhan = boPhan;
    }

    @Override
    public String toString() {
        return TenNV + '\'' + tuoi + DiaChi + '\'' + BoPhan ;
    }

    public static void main(String[] args) {

    }
}
