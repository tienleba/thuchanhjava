//
//
import java.util.ArrayList;
public class App16 {
 public static void main(String[] args ) {
   //
   ArrayList<String> arrListString = new ArrayList<>(10);
   //THEM CAC PHAN TU SU DUNG PHUONG PHAP ADD
   arrListString.add("JAVA");
   arrListString.add("PHP");
   arrListString.add("C#");
   arrListString.add("C++");

   //duyet theo kich thuoc cua arrListString
   //Su dung vong lap for thong thuong
   //phuong thuc arrlistString.size() se tra ve so phan tu cua arrListString
   //va sau do lay phan tu tai vi tri thu 1 thong qua ham get()
   //sau do hien thi gia tri phan tu do ra
   System.out.println("Cac phan tu co trong arrListString la: ");
   for(int i = 0; i < arrListString.size(); i++) {
     System.out.println(arrListString.get(i) +"\t");
    }      
  }
}

