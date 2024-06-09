//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
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
        Scanner input = new Scanner(System.in);
        System.out.println("Moi hoc sinh nhap thong tin mon hoc ");
        System.out.println("ten mon hoc la ");
        String tenMonHoc =input.next();
        System.out.println("ma mon hoc la ");
        String maMonHoc = input.next();
        System.out.println("so tin chi la ");
        String soTinChi = input.next();
        System.out.println("Vui long chon mon theo list ben duoi de xem diem " + "\n" +
                "1. Ly Thuyet" + "\n" +
                "2. Thuc Hanh " + "\n" +
                "3. Do An " + "\n" +
                "4. Tat ca ");
        System.out.println("vui long chon so ");
        int nhapSo = input.nextInt();
        while (nhapSo >= 5) {
            System.out.println("vui long nhap lai ");
            nhapSo = input.nextInt();
        }

        MonHoc hocSinh1 = new MonLyThuyet("12DSA","data structure",24, 5.5, 10,9);
        MonHoc hocSinh2 = new MonThucHanh("12DSA", "data structure", 24, 10, 9,8, 7.5);
        MonHoc hocSinh3 = new MonDoAn("CS50", "Computer science", 12, 10, 9);
        System.out.println(hocSinh1);
        System.out.println(hocSinh1.TinhDiem());
        System.out.println(hocSinh2);
        System.out.println(hocSinh2.TinhDiem());
        System.out.println(hocSinh3);
        System.out.println(hocSinh3.TinhDiem());
    }
}