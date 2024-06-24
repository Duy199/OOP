package exercise1_30;

import java.util.Scanner;

public class MonLyThuyet extends MonHoc {
    private double tuLuan;
    private double diemGiuaKy;
    private double diemCuoiKy;


    public MonLyThuyet(String subjectID, String subjectName, String creditNumber) {
        super(subjectID, subjectName, creditNumber);
        System.out.println("moi nhap diem mon ly thuyet ");
        Scanner input = new Scanner(System.in);
        System.out.println("moi nhap diem tu luan");
        this.tuLuan = input.nextDouble();
        System.out.println("moi nhap diem giua ky ");
        this.diemGiuaKy = input.nextDouble();
        System.out.println("moi nhap diem cuoi ky ");
        this.diemCuoiKy = input.nextDouble();
    }

    public double getTuLuan() {
        return tuLuan;
    }

    public void setTuLuan(double tuLuan) {
        System.out.println("moi nhap diem tu luan ");
        this.tuLuan = tuLuan;
    }

    public double getDiemGiuaKy() {
        return diemGiuaKy;
    }

    public void setDiemGiuaKy(double diemGiuaKy) {
        System.out.println("moi nhap diem giua ky ");
        this.diemGiuaKy = diemGiuaKy;
    }

    public double getDiemCuoiKy() {
        return diemCuoiKy;
    }

    public void setDiemCuoiKy(double diemCuoiKy) {
        System.out.println("moi nhap diem cuoi ky ");
        this.diemCuoiKy = diemCuoiKy;
    }

    @Override
    public double TinhDiem() {
        System.out.println("Diem trung binh mon ly thuyet la ");
        return tuLuan * 0.2 + diemGiuaKy * 0.3 + diemCuoiKy * 0.5;
    }

    @Override
    public String toString() {
//        return  "Ma mon hoc la " + maMonHoc + "\n" +
//                "Ten mon hoc la " + tenMonHoc + "\n" +
//                "so tin chi la " + soTinChi + "\n" +
          return  super.toString() +
                  "diem tu luan la " + tuLuan + "\n" +
                  "diem giua ky la " + diemGiuaKy + "\n" +
                  "diem cuoi ky la " + diemCuoiKy;
    }

    @Override
    public void newLine() {
        System.out.println("\n");
    }

    //    @Override
//    public String toString() {
//        return  "Ten exercise1_30.MonHoc la " + super.getMaMonHoc() + "\n" +
//                "maMaHoc la " + super.getMaMonHoc() + "\n" +
//                "so Tin chi la " + super.getSoTinChi() + "\n" +
//                "Diem tuLuan la " + tuLuan + "\n" +
//                "Dien giua ky la " + diemGiuaKy + "\n" +
//                "Diem cuoi ky la " + diemCuoiKy;
//    }


}

