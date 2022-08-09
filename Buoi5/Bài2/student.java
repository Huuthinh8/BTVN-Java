import java.util.Locale;
import java.util.Scanner;

public class student {
    static  Scanner scanner = new Scanner(System.in);
    private int ID;
    private String name;
    private int age;
    private address x = new address();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public address getX() {
        return x;
    }

    public void setX(address x) {
        this.x = x;
    }

    public void nhap(){

            System.out.println("Nhap ID:");
            ID = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap ten:");
            name=scanner.nextLine();
            System.out.println("Nhap tuoi:");
            age= Integer.parseInt(scanner.nextLine());
            x.nhap();

    }
    public void xuat(){

            System.out.print(ID+"  "+name+"  "+age+"    ");
            x.xuat();

    }
    public static void timkiem(student a[],int n){
        System.out.println("Nhap id tim kiem:");
        Scanner scanner = new Scanner(System.in);
        int b=scanner.nextInt();
        for(int i=0;i<n;i++){
            if(a[i].ID==b)
                a[i].xuat();
        }
    }
    public static void thaydoi(student a[],int n){
        for(int i=0;i<n;i++){
            a[i].x.setProvince(a[i].x.getProvince().replaceAll("ThanhHoa","HaiPhong"));
        }
    }
    public static void xoa(student a[],int n){
        System.out.println("Nhap id can xoa:");
        int c=scanner.nextInt();
        for(int i=0;i<n;i++){
            if(a[i].ID==c)
            {
                for(int j=i;j<n-1;j++)
                    a[j]=a[j+1];
            }
            n--;
        }
    }
    public static void main(String[] args) {
        student a[];
        int n;
        System.out.println("Nhap n sinh vien:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = new student[n];
        for(int i=0;i<n;i++)
        {
            a[i] = new student();
            a[i].nhap();
        }
        System.out.println("=================DANH SACH SINH VIEN==================");
        System.out.println("ID"+" "+"Ten"+"   "+"Tuoi"+"  "+"id"+"   "+"Huyen"+"    "+"Tinh");
        for(int i=0;i<n;i++)
        {
            a[i].xuat();
        }
        System.out.println("=================DANH SACH SINH VIEN==================");
        System.out.println("ID"+" "+"Ten"+"   "+"Tuoi"+"  "+"id"+"   "+"Huyen"+"    "+"Tinh");
        timkiem(a,n);
        thaydoi(a,n);
        System.out.println("=================DANH SACH SINH VIEN==================");
        System.out.println("ID"+" "+"Ten"+"   "+"Tuoi"+"  "+"id"+"   "+"Huyen"+"    "+"Tinh");
        for(int i=0;i<n;i++)
        {
            a[i].xuat();
        }
        xoa(a,n);
        System.out.println("=================DANH SACH SINH VIEN==================");
        System.out.println("ID"+" "+"Ten"+"   "+"Tuoi"+"  "+"id"+"   "+"Huyen"+"    "+"Tinh");
        for(int i=0;i<n;i++)
        {
            a[i].xuat();
        }
    }
}
