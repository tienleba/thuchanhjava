import java.util.HashSet;
import java.util.Scanner;

public class App56 {
 public static void main (String[] args) {
     String name;
     HashSet<String> hashSetString = new HashSet<>();
     Scanner scanner = new Scanner(System.in);

     // them cac phan tu vao hashSetString
     hashSetString.add("alo");
     hashSetString.add("blo");
     hashSetString.add("clo");
     hashSetString.add("dlo");
     hashSetString.add("elo");
     hashSetString.add("flo");
     // hien thi cac phan tu trong hashSetString
     System.out.println("cac phan tu trong hashSetInteger: ");
     System.out.println(hashSetString);
     System.out.println("Nhap phan tu can xoa:");
     name = scanner.nextLine();
     // them mot phan tu moi vao hashSetString tu ban phim
     // neu pha ntu do da ton tai thi thong bao da ton tai nguoc lai thi them vao
     if (!hashSetString.contains(name)) {
        hashSetString.remove(name);
         System.out.println("xoa thanh cong"); 
         System.out.println("cac phan tu con lai trong hashSetString :");
         System.out.println(hashSetString);
     } else {
         System.out.println("xoa khong thanh cong");
     }
    }
}