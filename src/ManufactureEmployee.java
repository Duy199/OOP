public class ManufactureEmployee extends Employee {
    private int SoSanPham;

    public ManufactureEmployee(String name, int startDays, int soSanPham) {
        super(name, startDays);
        SoSanPham = soSanPham;
    }

    public int getSoSanPham() {
        return SoSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        SoSanPham = soSanPham;
    }

    @Override
    public double TinhLuong() {
        return super.LCB + SoSanPham * 2000;
    }

}
