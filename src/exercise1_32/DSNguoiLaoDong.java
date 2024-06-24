package exercise1_32;

import java.util.ArrayList;

public class DSNguoiLaoDong {
    private ArrayList<NguoiLaoDong>dsNLD;
//    private exercise1_32.NVCoHuu nvCoHuu;


//    public exercise1_32.DSNguoiLaoDong(String maSo, String hoTen, int namSinh, int xacDinh) {
//
//        if (xacDinh == 1 || xacDinh ==2) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("moi nhap HSL");
//            int HSL = input.nextInt();
//            System.out.println("moi nhap LCS");
//            int LCS = input.nextInt();
//
//            // GV co Huu
//            if (xacDinh == 1) {
//                System.out.println("moi nhap hs tham nien");
//                double hsThamNien = input.nextDouble();
//                this.dsNLD = new ArrayList<>();
//                dsNLD.add(new exercise1_32.GVCoHuu(maSo,hoTen,namSinh,HSL,LCS,hsThamNien));
//                this.nguoiLaoDong = new exercise1_32.GVCoHuu(maSo,hoTen,namSinh,HSL,LCS,hsThamNien);
//            }
//            // NV co Huu
//            else {
//                System.out.println("moi nhap gio lam them");
//                int gioLamThem = input.nextInt();
//                this.dsNLD = new ArrayList<>();
//                dsNLD.add(new exercise1_32.NVCoHuu(maSo,hoTen,namSinh,HSL,LCS,gioLamThem));
//                this.nguoiLaoDong = new exercise1_32.GVCoHuu(maSo,hoTen,namSinh,HSL,LCS,gioLamThem);
//            }
//        }
//
//    }


    public DSNguoiLaoDong(ArrayList<NguoiLaoDong> dsNLD) {
        this.dsNLD = dsNLD;
    }

    public ArrayList<NguoiLaoDong> getDsNLD() {
        return dsNLD;
    }

    public void setDsNLD(ArrayList<NguoiLaoDong> dsNLD) {
        this.dsNLD = dsNLD;
    }

    @Override
    public String toString() {
        return  "\n" +
                "exercise1_32.DSNguoiLaoDong{" +
                "dsNLD=" + dsNLD +
                '}' + "\n";
    }

    public void nhap() {}

    public void xuat () {
        System.out.println(toString());
    }

    public double tinhTongLuong() {
        return 0;
    }


}
