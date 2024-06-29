package exercise1_32;

public class GVCoHuu extends LDBienChe{
    private double hsThamNien;

    public GVCoHuu(String maSo, String hoTen, int namSinh, double HSL, double LCS, double hsThamNien) {
        super(maSo, hoTen, namSinh, HSL, LCS);
        this.hsThamNien = hsThamNien;
    }

    public double getHsThamNien() {
        return hsThamNien;
    }

    public void setHsThamNien(double hsThamNien) {
        this.hsThamNien = hsThamNien;
    }

    @Override
    public String toString() {
        return "exercise1_32.GVCoHuu{" +
                "hsThamNien=" + this.hsThamNien +
                ", HSL=" + HSL +
                ", LCS=" + LCS +
                ", maSo='" + maSo + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }

    @Override
    public void nhap() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap he so tham nien ");
//        this.hsThamNien = input.nextDouble();

    }

    @Override
    public void xuat() {
        System.out.println(toString());
    }

    @Override
    public double tinhLuong() {
        return super.getHSL() * super.getLCS() * (1+hsThamNien);
    }

}
