public class ManagerEmployee extends Employee{
    private double Thuong;
    private double HeSoChucVu;

    public ManagerEmployee(String name, int startDays, double thuong, double heSoChucVu) {
        super(name, startDays);
        Thuong = thuong;
        HeSoChucVu = heSoChucVu;
    }

    public Double getThuong() {
        return Thuong;
    }

    public void setThuong(double thuong) {
        Thuong = thuong;
    }

    public Double getHeSoChucVu() {
        return HeSoChucVu;
    }

    public void setHeSoChucVu(Double heSoChucVu) {
        HeSoChucVu = heSoChucVu;
    }

    @Override
    public double TinhLuong() {
        return super.LCB*HeSoChucVu + Thuong;
    }

}
