import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
        //Khai bao bien
        double a1, b1, c1, a2, b2, c2;
        double D, Dx, Dy;
        //Khai bao doi tuong Scanner de doc du lieu nguoi dung nhap vao
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao he so a1: ");
        a1 = sc.nextDouble();
        System.out.println("Nhap vao he so b1: ");
        b1 = sc.nextDouble();
        System.out.println("Nhap vao he so c1: ");
        c1 = sc.nextDouble();
        System.out.println("Nhap vao he so a2: ");
        a2 = sc.nextDouble();
        System.out.println("Nhap vao he so b2: ");
        b2 = sc.nextDouble();
        System.out.println("Nhap vao he so c2: ");
        c2 = sc.nextDouble();
        //Thuc hien bai toan
        D = a1 * b2 - a2 * b1;
        Dx = c1 * b2 - c2 * b1;
        Dy = a1 * c2 - a2 * c1;
        if (D == 0) {
            if (Dx + Dy ==0) {
                System.out.println("He phuong trinh co vo so nghiem.");
            } else {
                System.out.println("He phuong trinh vo nghiem.");
            }
        } else {
            System.out.println("He phuong trinh co nghiem la: x= "+ (Dx / D) + " va y = " + (Dy / D));
        }
    }
} 