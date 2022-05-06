import java.util.Scanner;
import java.util.LinkedList;

public class App41 {
     public static void main (String[]args) {
         Scanner scanner = new Scanner(System.in);

         //khai bao 1 danh sach lien ket
         // luu tru cac thang trong nam 
         LinkedList<String> LinkedList = new LinkedList<String>();
         LinkedList.add("Thang 1");
         LinkedList.add("Thang 2");
         LinkedList.add("Thang 3");
         LinkedList.add("Thang 4");
         LinkedList.add("Thang 5");
         LinkedList.add("Thang 6");
         LinkedList.add("Thang 7");
         LinkedList.add("Thang 8");
         LinkedList.add("Thang 9");
         LinkedList.add("Thang 10");
         LinkedList.add("Thang 11");
         LinkedList.add("Thang 12");

         System.out.println("Nhap vao dia chi so cua phan tu can lay :");
         int index = scanner.nextInt();
         // kiem tra neu chi so lon hon hoac bang 0
         // va nho hon kich thuoc cua linkedlist - 1 thi moi lay 
         // nguoc lai thong bao loi
         if ((index < 0 || (index > (LinkedList.size() - 1)))) {
             System.out.println("Chi so can lay phai lon hon 0 va nho hon "
             + (LinkedList.size()-1));
         } else {
             LinkedList.get(index);
             System.out.println("Phan tu co chi so = " + index +" trong linkedList la  + node ");
         }

         //truy cap phan tu dau tien trong danh sach
         // su dung phuong thuoc getFirst()
         String firstNode = LinkedList.getFirst();
         
         // truy cap phan tu dau tien trong danh sach
         // su dung phuong thuc getLast();
          String lastNode = LinkedList.getLast();

          System.out.println("\nPhan tu dau tien trong danh sach la" + firstNode +  " ; Phan tu cuoi cung trong danh sach la " + lastNode);
        }
    }

