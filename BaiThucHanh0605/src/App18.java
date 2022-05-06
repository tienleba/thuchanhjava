import java.util.ArrayList;
public class App18 {
// vong for cai tien
public static void main(String[] args ) {
    ArrayList<Integer> arrListInteger = new ArrayList<>();
    // them cac phan tu su dung phuong thuc add
    arrListInteger.add(0);
    arrListInteger.add(7);
    arrListInteger.add(1);
    arrListInteger.add(9);

    //duyet theo kich thuoc cua arrListInteger
    //su dung vong lap for duyet theo doi tuong
    //trong do kieu du lieu cua bien number
    //phai trung voi kieu du lieu cua arrListInteger
    System.out.println("Cac phan tu co trong arrListInteger la: ");
     for(int number:arrListInteger) {
         System.out.print(number + "\t");
     }
    }
}