package exercise1_32;

public class GVThinhGiang extends LDNgoaiBienChe{
    private int soTietGD;
    private String trinhDo;

    public GVThinhGiang(String maSo, String hoTen, int namSinh, double mucLuong, int soTietGD, String trinhDo) {
        super(maSo, hoTen, namSinh, mucLuong);

        this.soTietGD = soTietGD;
        this.trinhDo = trinhDo;
    }

    public int getSoTietGD() {
        return soTietGD;
    }

    public void setSoTietGD(int soTietGD) {
        this.soTietGD = soTietGD;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString() {
        return "exercise1_32.GVThinhGiang{" +
                "soTietGD=" + soTietGD +
                ", trinhDo='" + trinhDo + '\'' +
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
        if (trinhDo == "ĐH") {
            return getMucLuong() * soTietGD * 1.0;
        }
        else if (trinhDo == "ThS") {
            return getMucLuong() * soTietGD * 1.2;
        }
        else if (trinhDo == "TS") {
            return getMucLuong() * soTietGD * 1.5;
        }
        else if (trinhDo == "TS") {
            return getMucLuong() * soTietGD * 1.8;
        }
        else {
            return getMucLuong() * soTietGD * 2.0;
        }

    }

}
