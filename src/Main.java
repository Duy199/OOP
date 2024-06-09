//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //exercise 1.29
//       Employee employee1 = new OfficeEmployee("Duy", 5, 20, 300000);
//       System.out.println(employee1.TinhLuong());
//       Employee employee2 = new ManufactureEmployee("Phat", 2, 21);
//       System.out.println(employee2.TinhLuong());
//       Employee employee3 = new ManagerEmployee("Quynh", 5, 5000000, 2);
//       System.out.println(employee3.TinhLuong());
       //exercise 1.30
        MonHoc hocSinh1 = new MonLyThuyet("12DSA","data structure",24, 5.5, 10,9);
        MonHoc hocSinh2 = new MonThucHanh("12DSA", "data structure", 24, 10, 9,8, 7.5);
        MonHoc hocSinh3 = new MonDoAn("CS50", "Computer science", 12, 10, 9);
        System.out.println(hocSinh1.toString());
        System.out.println(hocSinh1.TinhDiem());
        System.out.println(hocSinh2.toString());
        System.out.println(hocSinh2.TinhDiem());
        System.out.println(hocSinh3.toString());
        System.out.println(hocSinh3.TinhDiem());

    }
}