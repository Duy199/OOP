public class MonDoAn extends MonHoc {
    private double diemGVHD;
    private double diemGVPB;

    public MonDoAn(String maMonHoc, String tenMonHoc, int soTinChi, double diemGVHD, double diemGVPB) {
        super(maMonHoc, tenMonHoc, soTinChi);
        this.diemGVHD = diemGVHD;
        this.diemGVPB = diemGVPB;
    }

    public double getDiemGVHD() {
        return diemGVHD;
    }

    public void setDiemGVHD(double diemGVHD) {
        this.diemGVHD = diemGVHD;
    }

    public double getDiemGVPB() {
        return diemGVPB;
    }

    public void setDiemGVPB(double diemGVPB) {
        this.diemGVPB = diemGVPB;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "diem GVHD la " + diemGVHD + "\n" +
                "diem GVPB la " + diemGVPB;
    }

    @Override
    public double TinhDiem() {
        System.out.println("Diem trung binh mon do an la ");
        return (diemGVHD + diemGVPB) / 2;
    }
}
