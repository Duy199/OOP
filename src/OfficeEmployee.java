public class OfficeEmployee extends Employee{
    private int soNgayLamViec;
    private double troCap;

    public OfficeEmployee(String name, int startDays, int soNgayLamViec, double troCap) {
        super(name, startDays);
        this.soNgayLamViec = soNgayLamViec;
        this.troCap = troCap;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public double getTroCap() {
        return troCap;
    }

    public void setTroCap(double troCap) {
        this.troCap = troCap;
    }

    @Override
    public double TinhLuong() {
        return super.LCB + soNgayLamViec*10000 + troCap;
    }
}
