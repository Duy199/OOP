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
        MonHoc hocSinh;
        System.out.println("nhap ma mon hoc ");
        String subjectID = input.next();
        System.out.println("nhap ten mon hoc ");
        String subjectName = input.next();
        System.out.println("nhap so tin chi ");
        String creditNumber = input.next();
        //haha

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

        if (nhapSo == 1) {
            hocSinh = new MonLyThuyet(subjectID, subjectName, creditNumber);
            System.out.println(hocSinh);
            System.out.println(hocSinh.TinhDiem());
        }
        else if (nhapSo ==2) {

            hocSinh = new MonThucHanh(subjectID, subjectName, creditNumber);
            System.out.println(hocSinh);
            System.out.println(hocSinh.TinhDiem());
        }
        else if (nhapSo == 3) {

            hocSinh = new MonDoAn(subjectID, subjectName, creditNumber);
            System.out.println(hocSinh);
            System.out.println(hocSinh.TinhDiem());
        }

        else {
            // goi method
            hocSinh = new MonLyThuyet(subjectID, subjectName, creditNumber);
            hocSinh = new MonThucHanh(subjectID, subjectName, creditNumber);
            hocSinh = new MonDoAn(subjectID, subjectName, creditNumber);
            System.out.println(hocSinh);
            System.out.println(hocSinh.TinhDiem());

//            System.out.println(hocSinh2);
//            System.out.println(hocSinh2.TinhDiem());
//            System.out.println(hocSinh3);
//            System.out.println(hocSinh3.TinhDiem());
            
        }



        
    }
}