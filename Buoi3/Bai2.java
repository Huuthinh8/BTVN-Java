import java.util.Locale;
import java.util.Scanner;

public class Bai2Buoi3 {
    public static void chuanhoa(String str){
        String s = str;
        s= s.toLowerCase(); //b1: chuyen chuoi ve chu thuong.
        String []ss; // tao mang chuoi.
        ss = s.split(" "); // luu chuoi s vao mang ss, sau do tach chuoi boi dau " ".
        String s2= "";
        for(int i=0;i<ss.length;i++)
        {
            String s1 = "";//tao chuoi rong
            if(ss[i].length() != 0){
                s1+= Character.toUpperCase(ss[i].charAt(0)); //s1 chua chu cai hoa dau
                if(ss[i].length() > 1) s1+=ss[i].substring(1);// s1 + cac chu thuong con lai
                s2+=s1; // luu chuoi rong s1 thanh s2
                if(i<ss.length) s2+=" "; // sau do moi tu cach boi dau " ".
            }
        }
        if(s2.charAt(s2.length()-1) == ' ') s2+= "\b";
        int n = s2.length();
        for (int i = 0; i < n; i++) {
            if ((int)s2.charAt(i) >= 48 && (int)s2.charAt(i) <= 57) {
                s2=xoakt(s2, i);//xóa kí tự số
                i--;
                n--;
            }
        }
        System.out.println("Chuoi sau khi chuan hoa:"+s2);
    }
    public static String xoakt(String s, int k) {
        return s.substring(0, k) + s.substring(k + 1);
    }
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi:");
        str = scanner.nextLine();
        System.out.println("Chuoi truoc khi chuan hoa:"+ str);
        chuanhoa(str);
    }
}
