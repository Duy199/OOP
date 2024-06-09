public class MonLyThuyet extends MonHoc {
    private double tuLuan;
    private double diemGiuaKy;
    private double diemCuoiKy;

    public MonLyThuyet(String maMonHoc, String tenMonHoc, int soTinChi, double tuLuan, double diemGiuaKy, double diemCuoiKy) {
        super(maMonHoc, tenMonHoc, soTinChi);
        this.tuLuan = tuLuan;
        this.diemGiuaKy = diemGiuaKy;
        this.diemCuoiKy = diemCuoiKy;
    }

    public double getTuLuan() {
        return tuLuan;
    }

    public void setTuLuan(double tuLuan) {
        this.tuLuan = tuLuan;
    }

    public double getDiemGiuaKy() {
        return diemGiuaKy;
    }

    public void setDiemGiuaKy(double diemGiuaKy) {
        this.diemGiuaKy = diemGiuaKy;
    }

    public double getDiemCuoiKy() {
        return diemCuoiKy;
    }

    public void setDiemCuoiKy(double diemCuoiKy) {
        this.diemCuoiKy = diemCuoiKy;
    }

    @Override
    public double TinhDiem() {
        System.out.println("Diem trung binh mon ly thuyet la ");
        return tuLuan * 0.2 + diemGiuaKy * 0.3 + diemCuoiKy * 0.5;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "diem tu luan la " + tuLuan + "\n" +
                "diem giua ky la " + diemGiuaKy + "\n" +
                "diem cuoi ky la " + diemCuoiKy;
    }

    //    @Override
//    public String toString() {
//        return  "Ten MonHoc la " + super.getMaMonHoc() + "\n" +
//                "maMaHoc la " + super.getMaMonHoc() + "\n" +
//                "so Tin chi la " + super.getSoTinChi() + "\n" +
//                "Diem tuLuan la " + tuLuan + "\n" +
//                "Dien giua ky la " + diemGiuaKy + "\n" +
//                "Diem cuoi ky la " + diemCuoiKy;
//    }

}

