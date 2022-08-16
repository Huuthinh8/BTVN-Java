import java.util.Scanner;

public class main {
    public  static int n,m,c;
    public static void nhapcn(congnhan[] cn){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n can bo cong nhan:");
        n = scanner.nextInt();
        for(int i=0;i<n;i++){
            cn[i]= new congnhan();
            cn[i].nhap();
        }
    }
    public static void nhapks(kysu[] ks){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap m can bo ky su:");
        m = scanner.nextInt();
        for(int i=0;i<m;i++){
            ks[i] = new kysu();
            ks[i].nhap();
        }
    }
    public static void nhapnv(nhanvien[] nv){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap c can bo nhan vien:");
        c= scanner.nextInt();
        for(int i=0;i<c;i++){
            nv[i]=new nhanvien();
            nv[i].nhap();
        }
    }
    public static void xuatcn(congnhan[] cn){
        for(int i=0;i<n;i++){
            cn[i].xuat();
        }
    }
    public static void xuatks(kysu[] ks){
        for(int i=0;i<m;i++){
            ks[i].xuat();
        }
    }
    public  static void xuatnv(nhanvien[] nv){
        for(int i=0;i<c;i++){
            nv[i].xuat();
        }
    }

    //ham xoa theo id
    public static void xoa(congnhan[] cn,kysu[] ks,nhanvien[] nv){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id can xoa:");
        int ID = scanner.nextInt();
        for(int i=0;i<n;i++){
            if(cn[i].id==ID)
                for(int j=i;j<n;j++){
                    cn[j]=cn[j+1];
                    n--;
                }
        }
        for(int i=0;i<m;i++){
            if(ks[i].id==ID)
                for(int j=i;j<m;j++){
                    ks[j]=ks[j+1];
                    m--;
                }
        }
        for(int i=0;i<c;i++){
            if(nv[i].id==ID)
                for(int j=i;j<c;j++){
                    nv[j]=nv[j+1];
                    c--;
                }
        }
    }
    //tim kiem theo id
    public static void timkiem(congnhan[] cn,kysu[] ks,nhanvien[] nv){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id can tim:");
        int ID = scanner.nextInt();
        for(int i=0;i<n;i++){
            if(cn[i].id==ID)
                cn[i].xuat();
        }
        for(int i=0;i<m;i++){
            if(ks[i].id==ID)
                ks[i].xuat();
        }
        for(int i=0;i<c;i++){
            if(nv[i].id==ID)
                nv[i].xuat();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luachon;
        congnhan[] cn = new congnhan[100];
        kysu[] ks = new kysu[100];
        nhanvien[] nv = new nhanvien[100];
        do {
            System.out.println("\t\t\tMENU");
            System.out.println("1.Add 1 cán bộ vào List tương ứng");
            System.out.println("2.Hiển thị danh sách các cán bộ");
            System.out.println("3.Xóa 1 cán bộ theo id");
            System.out.println("4.Tìm kiếm 1 cán bộ theo id\n");
            System.out.println("5.Dừng chương trình\n");
            System.out.print(" Nhap vao lua chon cua ban : ");
            luachon = scanner.nextInt();
            switch (luachon) {

                case 1: {
                    nhapcn(cn);
                    nhapks(ks);
                    nhapnv(nv);
                    break;
                }

                case 2: {
                    System.out.println("===========DANH SACH========");
                    xuatcn(cn);
                    xuatks(ks);
                    xuatnv(nv);
                    break;
                }
                case 3: {
                    System.out.println("===========DANH SACH========");
                    xoa(cn,ks,nv);
                    xuatcn(cn);
                    xuatks(ks);
                    xuatnv(nv);
                    break;
                }
//
                case 4: {
                    timkiem(cn,ks,nv);
                    break;
                }
//
               case 5: {
                    System.out.println(" Cam on ban da su dung chuong trinh");
                    return;
                }
               default: {
                    System.out.println("Khong co chuc nang nay ");
                    break;
                }
            }
        } while (true);
    }
}
