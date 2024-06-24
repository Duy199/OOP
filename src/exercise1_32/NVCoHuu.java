package exercise1_32;

public class NVCoHuu extends LDBienChe implements XetKhenThuong{
    private int soGioLamThem;

    public NVCoHuu(String maSo, String hoTen, int namSinh, double HSL, double LCS, int soGioLamThem) {
        super(maSo, hoTen, namSinh, HSL, LCS);
        this.soGioLamThem = soGioLamThem;
    }

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    @Override
    public String toString() {
        return "exercise1_32.NVCoHuu{" +
                "soGioLamThem=" + soGioLamThem +
                ", HSL=" + HSL +
                ", LCS=" + LCS +
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
        return (super.getHSL() * super.getLCS()) + (soGioLamThem * 50000);
    }

    @Override
    public double tinhKhenThuong() {
        if (soGioLamThem >= 40) {
            System.out.println("\n" + "co thuong");
            return tinhLuong() + 1000000;
        }
        else {
            System.out.println("\n" + "Ko co thuong");
            return tinhLuong();
        }
    }
}
