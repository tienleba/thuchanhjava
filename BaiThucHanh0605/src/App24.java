import java.util.ArrayList;
import java.util.Scanner;

public class App24 {
    public static void main(String[]args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number ;  
        System.out.println("Nhap so phan tu cua ArrayList :");
        int n = scanner.nextInt();
        //
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + i + " : ");
            number = scanner.nextInt();
            arrListInteger.add(number);
        }
        // tim phan tu lon nhat trong mang su dung phuong thuc compareTo()
        // gia su phan tu lon nhat la phan tu dau tien trong ArrayList
        int max = arrListInteger.get(0);
        
        for (int i = 1; i < arrListInteger.size(); i++) {
        //thi gan max = phan tu tai vi tri i
        // va do chinh la phan tu lon nhat
        if (arrListInteger.get(i).compareTo(max) > 0 ) {
            max = arrListInteger.get(i);
        }
}
  System.out.println("Phan tu lon nhat trong arrListInteger = " + max);
}
}
