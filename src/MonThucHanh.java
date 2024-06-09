public class MonThucHanh extends MonHoc{
    private double diem1;
    private double diem2;
    private double diem3;
    private double diem4;

    public MonThucHanh(String maMonHoc, String tenMonHoc, int soTinChi, double diem1, double diem2, double diem3, double diem4) {
        super(maMonHoc, tenMonHoc, soTinChi);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.diem4 = diem4;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

    public double getDiem4() {
        return diem4;
    }

    public void setDiem4(double diem4) {
        this.diem4 = diem4;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Diem 1 la " + diem1 + "\n" +
                "Diem 2 la " + diem2 + "\n" +
                "Diem 3 la " + diem3 + "\n" +
                "Diem 4 la " + diem4 + "\n";
    }

    @Override
    public double TinhDiem() {
        System.out.println("Diem trung binh mon thuc hanh la ");
        return (diem1 + diem2 + diem3 + diem4) / 4;
    }
}
