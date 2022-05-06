import java.util.LinkedList;
public class App38 {
    public static void main(String[] args) {
        //khai bao 1 LinkedList co ten la list
        // co kieu la String
        LinkedList<String> list = new LinkedList<String>();
        // add object to list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("Vi du su dung phuong thuc addAll ()");
        System.out.println("------------------------------------");
        //them cac phan tu cua list vao listA
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA");
        showList(listA);
        System.out.println("\nvi du su dung phuong thuc retainAll()");
        System.out.println("------------------------------------------");
        //khoi tao listB
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        //xoa nhung phan tu khong thuoc listB khoi list A
        listA.retainAll(listB);
        System.out.print("ListA");
        showList(listA);

        System.out.println("\nvi du su dung phuogn thuc removeAll()");
        System.out.println("------------------------------------------");
        //xoa nhung phan tu thuoc listB khoi list
        list.removeAll(listB);
        System.out.print("list:");
        showList(list);
    }
    public static void showList(LinkedList<String>list) {
        // Show list through for-each
        for (String obj : list ) {
            System.out.print("\t" + obj + ",");
        }
        System.out.println();
    }

    
}
