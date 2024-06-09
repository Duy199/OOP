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
    public String toString() {
        String string = super.toString();
        return  "MonLyThuyet{" +
                "maMaHoc=" + this.getMaMonHoc() +
                ", tuLuan=" + tuLuan +
                ", diemGiuaKy=" + diemGiuaKy +
                ", diemCuoiKy=" + diemCuoiKy +
                '}';
    }

    @Override
    public double TinhDiem() {

        return tuLuan * 0.2 + diemGiuaKy * 0.3 + diemCuoiKy * 0.5;
    }
}

