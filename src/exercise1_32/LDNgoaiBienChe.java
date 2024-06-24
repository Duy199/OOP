package exercise1_32;

public class LDNgoaiBienChe extends NguoiLaoDong{
    public double mucLuong;

    public LDNgoaiBienChe(String maSo, String hoTen, int namSinh, double mucLuong) {
        super(maSo, hoTen, namSinh);
        this.mucLuong = mucLuong;
    }

    public double getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(double mucLuong) {
        this.mucLuong = mucLuong;
    }

    @Override
    public String toString() {
        return "exercise1_32.LDNgoaiBienChe{" +
                "mucLuong=" + mucLuong +
                ", maSo='" + maSo + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }

    @Override
    public void nhap() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap muc luong");
//        mucLuong = input.nextDouble();
    }



    @Override
    public void xuat() {
        System.out.println(toString());
    }

    @Override
    public double tinhLuong() {
        return 0;
    }

}
