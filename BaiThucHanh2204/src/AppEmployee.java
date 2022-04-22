
import Employee.FullTimeEmployee;
import Employee.PartTimeEmployee;

public class AppEmployee {
    public static void main(String[] args) {
        PartTimeEmployee Pt = new PartTimeEmployee();
        FullTimeEmployee Ft = new FullTimeEmployee();
        
        Pt.nhaptt();
        Pt.tinhLuong();
        Ft.nhaptt();
        Ft.tinhLuong();

       
}
}