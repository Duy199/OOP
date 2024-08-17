package exercise1_32;

public class NVHopDong extends LDNgoaiBienChe implements XetKhenThuong {
    private int ngayCong;

    public NVHopDong(String maSo, String hoTen, int namSinh, double mucLuong, int ngayCong) {
        super(maSo, hoTen, namSinh, mucLuong);
        this.ngayCong = ngayCong;
    }

    public int getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(int ngayCong) {
        this.ngayCong = ngayCong;
    }

    @Override
    public String toString() {
        return "exercise1_32.NVHopDong{" +
                "ngayCong=" + ngayCong +
                ", mucLuong=" + mucLuong +
                ", maSo='" + maSo + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }

    @Override
    public void nhap() {

    }

    @Override
    public void xuat() {
        System.out.println(toString());
    }

    @Override
    public double tinhLuong() {
        return getMucLuong() * ngayCong;
    }

    @Override
    public double tinhKhenThuong() {
        if (ngayCong >= 25) {
            System.out.println("\n" + "co thuong NVHopDong");
            return tinhLuong() + 1500000;
        }
        else {
            System.out.println("\n" + "Ko co thuong NVHopDong");
            return tinhLuong();
        }
    }
}
