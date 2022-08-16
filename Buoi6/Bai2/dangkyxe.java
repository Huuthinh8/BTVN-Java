import java.util.Scanner;

public class dangkyxe {
    private String Tenchuxe;
    private String Loaixe;
    private float dungtich;
    private float giatien;
    private float giacantra;
    public static int n;

    public dangkyxe() {
    }

    public dangkyxe(String tenchuxe, String loaixe, float dungtich, float giatien, float giacantra) {
        Tenchuxe = tenchuxe;
        Loaixe = loaixe;
        this.dungtich = dungtich;
        this.giatien = giatien;
        this.giacantra = giacantra;
    }

    public String getTenchuxe() {
        return Tenchuxe;
    }

    public void setTenchuxe(String tenchuxe) {
        Tenchuxe = tenchuxe;
    }

    public String getLoaixe() {
        return Loaixe;
    }

    public void setLoaixe(String loaixe) {
        Loaixe = loaixe;
    }

    public float getDungtich() {
        return dungtich;
    }

    public void setDungtich(float dungtich) {
        this.dungtich = dungtich;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }

    public float getGiacantra() {
        return giacantra;
    }

    public void setGiacantra(float giacantra) {
        this.giacantra = giacantra;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten chu xe:");
        Tenchuxe = scanner.nextLine();
        System.out.println("Nhap loai xe:");
        Loaixe = scanner.nextLine();
        System.out.println("Nhap dung tich:");
        dungtich = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gia tien:");
        giatien = Integer.parseInt(scanner.nextLine());
    }
    public  void xuat(){
        System.out.println(Tenchuxe+"      "+Loaixe+"      "+dungtich+"      "+giatien+"     "+tinhtien());
    }

    //tinh gia tien
    public  double tinhtien(){

            if(dungtich<100)
                return giatien * 2 / 100;
            else if(dungtich >=100 && dungtich <=200)
                return giatien * 6 / 100;
            else
                return giatien * 10 / 100;

    }
    //thue giam dan
    public static void giamdan(dangkyxe a[], int n){
        dangkyxe tg = a[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].tinhtien()<a[j].tinhtien())
                {
                    tg = a[i];
                    a[i]=a[j];
                    a[j]=tg;
                }
            }
        }
    }
    public static void tangdan(dangkyxe a[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            {
                if(a[i].giatien > a[j].giatien)
                {
                    dangkyxe tg = a[i];
                            a[i] = a[j];
                            a[j] = tg;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dangkyxe a[];
        int n;
        System.out.println("Nhap n thong tin xe:");
        n = scanner.nextInt();
        a = new dangkyxe[n];
        for(int i=0;i<n;i++){
            a[i]=new dangkyxe();
            a[i].nhap();
        }
        System.out.println("=============BANG KE KHAI============");
        System.out.println("Ten chu xe"+" "+"Loai xe"+" "+"Dung tich"+" "+"Gia tien"+" "+"Tien thue");
        for(int i=0;i<n;i++){
            a[i].xuat();
        }
        giamdan(a,n);
        System.out.println("=============BANG KE KHAI GIAM DAN TIEN THUE============");
        System.out.println("Ten chu xe"+" "+"Loai xe"+" "+"Dung tich"+" "+"Gia tien"+" "+"Tien thue");
        for(int i=0;i<n;i++){
            a[i].xuat();
        }
        tangdan(a,n);
        System.out.println("=============BANG KE KHAI TANG DAN TRI GIA============");
        System.out.println("Ten chu xe"+" "+"Loai xe"+" "+"Dung tich"+" "+"Gia tien"+" "+"Tien thue");
        for(int i=0;i<n;i++){
            a[i].xuat();
        }

    }
}
