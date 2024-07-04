//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//import exercise1_30.MonDoAn;
//import exercise1_30.MonHoc;
//import exercise1_30.MonLyThuyet;
//import exercise1_30.MonThucHanh;
import javax.swing.JFrame;
import exercise1_32.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //exercise 1.29
//       exercise1_29.Employee employee1 = new exercise1_29.OfficeEmployee("Duy", 5, 20, 300000);
//       System.out.println(employee1.TinhLuong());
//       exercise1_29.Employee employee2 = new exercise1_29.ManufactureEmployee("Phat", 2, 21);
//       System.out.println(employee2.TinhLuong());
//       exercise1_29.Employee employee3 = new exercise1_29.ManagerEmployee("Quynh", 5, 5000000, 2);
//       System.out.println(employee3.TinhLuong());
        //exercise 1.30
//        Scanner input = new Scanner(System.in);
//        MonHoc hocSinh;
//        MonHoc hocSinh1;
//        MonHoc hocSinh2;
//        System.out.println("nhap ma mon hoc ");
//        String subjectID = input.next();
//        System.out.println("nhap ten mon hoc ");
//        String subjectName = input.next();
//        System.out.println("nhap so tin chi ");
//        String creditNumber = input.next();
//        //haha
//
//        System.out.println("Vui long chon mon theo list ben duoi de xem diem " + "\n" +
//                "1. Ly Thuyet" + "\n" +
//                "2. Thuc Hanh " + "\n" +
//                "3. Do An " + "\n" +
//                "4. Tat ca ");
//        System.out.println("vui long chon so ");
//        int nhapSo = input.nextInt();
//        while (nhapSo >= 5) {
//            System.out.println("vui long nhap lai ");
//            nhapSo = input.nextInt();
//        }
//
//        if (nhapSo == 1) {
//            hocSinh = new MonLyThuyet(subjectID, subjectName, creditNumber);
//            System.out.println(hocSinh);
//            System.out.println(hocSinh.TinhDiem());
//        }
//        else if (nhapSo ==2) {
//
//            hocSinh = new MonThucHanh(subjectID, subjectName, creditNumber);
//            System.out.println(hocSinh);
//            System.out.println(hocSinh.TinhDiem());
//        }
//        else if (nhapSo == 3) {
//
//            hocSinh = new MonDoAn(subjectID, subjectName, creditNumber);
//            System.out.println(hocSinh);
//            System.out.println(hocSinh.TinhDiem());
//        }
//
//        else {
//            // goi method
//            hocSinh = new MonLyThuyet(subjectID, subjectName, creditNumber);
//            hocSinh1 = new MonThucHanh(subjectID, subjectName, creditNumber);
//            hocSinh2 = new MonDoAn(subjectID, subjectName, creditNumber);
//            System.out.println(hocSinh);
//            System.out.println(hocSinh.TinhDiem());
//            hocSinh.newLine();
//            System.out.println(hocSinh1);
//            System.out.println(hocSinh1.TinhDiem());
//            hocSinh1.newLine();
//            System.out.println(hocSinh2);
//            System.out.println(hocSinh2.TinhDiem());
//            hocSinh2.newLine();
////            System.out.println(hocSinh2);
////            System.out.println(hocSinh2.TinhDiem());
////            System.out.println(hocSinh3);
////            System.out.println(hocSinh3.TinhDiem());

//            ArrayList<exercise1_32.NguoiLaoDong> list = new ArrayList<>();
//
//
//            list.add(new exercise1_32.GVCoHuu("DAS","Tran",1999,10,23));
//            exercise1_32.DSNguoiLaoDong dsNguoiLaoDong = new exercise1_32.DSNguoiLaoDong(list);
//            dsNguoiLaoDong.nhap();
//            dsNguoiLaoDong.xuat();
//            System.out.println(dsNguoiLaoDong.tinhTongLuong());
//        Scanner input = new Scanner(System.in);
//        System.out.println("ma so la ");
//        String maSo = input.next().trim();
//        System.out.println("hoTen la ");
//        String hoTen = input.next().trim();
//        System.out.println("namSinh la ");
//        int namSinh = input.nextInt();
//
//        System.out.println("\n" + "Chon bo phan lam viec cua nhan vien/giao vien " + "\n" +
//                "1. GV CoHuu" + "\n" +
//                "2. NV CoHuu" + "\n" +
//                "3. NV hopdong" + "\n" +
//                "4. GV Thinh Giang" + "\n");
//
//        System.out.println("moi nhap lua chon ");
//        int choice = input.nextInt();
//
//        ArrayList<NguoiLaoDong> list = new ArrayList<>();
//        if (choice == 1 || choice ==2) {
//            System.out.println("moi nhap HSL");
//            int HSL = input.nextInt();
//            System.out.println("moi nhap LCS");
//            int LCS = input.nextInt();
//
//            if (choice == 1) {
//                System.out.println("moi nhap hs tham nien");
//                double hsThamNien = input.nextDouble();
//                list.add(new GVCoHuu(maSo,hoTen,namSinh,HSL,LCS,hsThamNien));
//                LDBienChe worker = new GVCoHuu(maSo,hoTen,namSinh,HSL,LCS,hsThamNien);
//                DSNguoiLaoDong dsNguoiLaoDong = new DSNguoiLaoDong(list);
//                //xuat list
//                dsNguoiLaoDong.xuat();
//                //Tinh Luong
//                System.out.println("luong nhan dc la " + worker.tinhLuong() + " $");
//            }
//            else if (choice == 2) {
//                System.out.println("moi nhap gio lam them");
//                int gioLamThem = input.nextInt();
//                list.add(new NVCoHuu(maSo,hoTen,namSinh,HSL,LCS,gioLamThem));
//                NVCoHuu worker = new NVCoHuu(maSo,hoTen,namSinh,HSL,LCS,gioLamThem);
//                DSNguoiLaoDong dsNguoiLaoDong = new DSNguoiLaoDong(list);
//                //Xuat list
//                dsNguoiLaoDong.xuat();
//                //Tinh luong
//                System.out.println("luong nhan dc la " + worker.tinhLuong() + " $");
//                System.out.println("\n" + "luong sau thuong la " + worker.tinhKhenThuong() + " $");
//            }
//
//        }
//        else if (choice == 3 || choice ==4) {
//            System.out.println("moi nhap muc luong");
//            double mucLuong = input.nextDouble();
//            if (choice == 4) {
//                System.out.println("moi nhap soTietGD");
//                int soTietGD = input.nextInt();
//                System.out.println("moi nhap trinh do gv/nv");
//                String trinhDo = input.next().trim();
//                while (!Arrays.asList("ĐH", "ThS", "TS", "PGS", "GS").contains(trinhDo)) {
//                    System.out.println("moi nhap lai trinh do" + "\nTheo list" + Arrays.asList("ĐH", "ThS", "TS", "PGS", "GS"));
//                    trinhDo = input.next().trim();
//                }
//
//                list.add(new GVThinhGiang(maSo,hoTen,namSinh,mucLuong,soTietGD,trinhDo));
//                LDNgoaiBienChe worker = new GVThinhGiang(maSo,hoTen,namSinh,mucLuong,soTietGD,trinhDo);
//                // Xuat list
//                DSNguoiLaoDong dsNguoiLaoDong = new DSNguoiLaoDong(list);
//                dsNguoiLaoDong.xuat();
//                // Tinh Luong
//                System.out.println("luong nhan dc cua trinh do " + trinhDo + "la " + worker.tinhLuong() + " $");
//
//            }
//            else  {
//                System.out.println("moi nhap ngay cong");
//                int ngayCong = input.nextInt();
//
//                list.add(new NVHopDong(maSo,hoTen,namSinh,mucLuong,ngayCong));
//                NVHopDong worker = new NVHopDong(maSo,hoTen,namSinh,mucLuong,ngayCong);
//
//                // Xuat list
//                DSNguoiLaoDong dsNguoiLaoDong = new DSNguoiLaoDong(list);
//                dsNguoiLaoDong.xuat();
//                // Tinh luong
//                System.out.println("luong nhan dc la " + worker.tinhLuong() + " $");
//                System.out.println("\n" + "luong sau thuong la " + worker.tinhKhenThuong() + " $");
//            }
//        }
        JFrameDemoGui jFrameDemoGui = new JFrameDemoGui("HelloWorld",200,300);
        jFrameDemoGui.setVisible(true);

    }
}

