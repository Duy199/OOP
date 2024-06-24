package exercise1_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ma so la ");
        String maSo = input.next().trim();
        System.out.println("hoTen la ");
        String hoTen = input.next().trim();
        System.out.println("namSinh la ");
        int namSinh = input.nextInt();

        System.out.println("\n" + "Chon bo phan lam viec cua nhan vien/giao vien " + "\n" +
                "1. GV CoHuu" + "\n" +
                "2. NV CoHuu" + "\n" +
                "3. NV hopdong" + "\n" +
                "4. GV Thinh Giang" + "\n");

        System.out.println("moi nhap lua chon ");
        int choice = input.nextInt();

        ArrayList<NguoiLaoDong> list = new ArrayList<>();
        if (choice == 1 || choice ==2) {
            System.out.println("moi nhap HSL");
            int HSL = input.nextInt();
            System.out.println("moi nhap LCS");
            int LCS = input.nextInt();

            if (choice == 1) {
                System.out.println("moi nhap hs tham nien");
                double hsThamNien = input.nextDouble();
                list.add(new GVCoHuu(maSo,hoTen,namSinh,HSL,LCS,hsThamNien));
                LDBienChe worker = new GVCoHuu(maSo,hoTen,namSinh,HSL,LCS,hsThamNien);
                DSNguoiLaoDong dsNguoiLaoDong = new DSNguoiLaoDong(list);
                //xuat list
                dsNguoiLaoDong.xuat();
                //Tinh Luong
                System.out.println("luong nhan dc la " + worker.tinhLuong() + " $");
            }
            else if (choice == 2) {
                System.out.println("moi nhap gio lam them");
                int gioLamThem = input.nextInt();
                list.add(new NVCoHuu(maSo,hoTen,namSinh,HSL,LCS,gioLamThem));
                NVCoHuu worker = new NVCoHuu(maSo,hoTen,namSinh,HSL,LCS,gioLamThem);
                DSNguoiLaoDong dsNguoiLaoDong = new DSNguoiLaoDong(list);
                //Xuat list
                dsNguoiLaoDong.xuat();
                //Tinh luong
                System.out.println("luong nhan dc la " + worker.tinhLuong() + " $");
                System.out.println("\n" + "luong sau thuong la " + worker.tinhKhenThuong() + " $");
            }

        }
        else if (choice == 3 || choice ==4) {
            System.out.println("moi nhap muc luong");
            double mucLuong = input.nextDouble();
            if (choice == 4) {
                System.out.println("moi nhap soTietGD");
                int soTietGD = input.nextInt();
                System.out.println("moi nhap trinh do gv/nv");
                String trinhDo = input.next().trim();
                while (!Arrays.asList("ĐH", "ThS", "TS", "PGS", "GS").contains(trinhDo)) {
                    System.out.println("moi nhap lai trinh do" + "\nTheo list" + Arrays.asList("ĐH", "ThS", "TS", "PGS", "GS"));
                    trinhDo = input.next().trim();
                }

                list.add(new GVThinhGiang(maSo,hoTen,namSinh,mucLuong,soTietGD,trinhDo));
                LDNgoaiBienChe worker = new GVThinhGiang(maSo,hoTen,namSinh,mucLuong,soTietGD,trinhDo);
                // Xuat list
                DSNguoiLaoDong dsNguoiLaoDong = new DSNguoiLaoDong(list);
                dsNguoiLaoDong.xuat();
                // Tinh Luong
                System.out.println("luong nhan dc cua trinh do " + trinhDo + " la " + worker.tinhLuong() + " $");

            }
            else  {
                System.out.println("moi nhap ngay cong");
                int ngayCong = input.nextInt();

                list.add(new NVHopDong(maSo,hoTen,namSinh,mucLuong,ngayCong));
                NVHopDong worker = new NVHopDong(maSo,hoTen,namSinh,mucLuong,ngayCong);

                // Xuat list
                DSNguoiLaoDong dsNguoiLaoDong = new DSNguoiLaoDong(list);
                dsNguoiLaoDong.xuat();
                // Tinh luong
                System.out.println("luong nhan dc la " + worker.tinhLuong() + " $");
                System.out.println("\n" + "luong sau thuong la " + worker.tinhKhenThuong() + " $");
            }
        }
    }
}
