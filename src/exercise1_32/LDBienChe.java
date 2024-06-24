package exercise1_32;

public class LDBienChe extends NguoiLaoDong{
    public double HSL;
    public double LCS;

    public LDBienChe(String maSo, String hoTen, int namSinh, double HSL, double LCS) {
        super(maSo, hoTen, namSinh);
        this.HSL = HSL;
        this.LCS = LCS;
    }

    public double getHSL() {
        return HSL;
    }

    public void setHSL(double HSL) {
        this.HSL = HSL;
    }

    public double getLCS() {
        return LCS;
    }

    public void setLCS(double LCS) {
        this.LCS = LCS;
    }

    @Override
    public String toString() {
        return "exercise1_32.LDBienChe{" +
                "HSL=" + HSL +
                ", LCS=" + LCS +
                ", maSo='" + maSo + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }

    @Override
    public void nhap() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap HSL");
//        HSL = input.nextDouble();
//        System.out.println("nhap LCS");
//        LCS = input.nextDouble();
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
