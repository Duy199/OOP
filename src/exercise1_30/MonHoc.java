package exercise1_30;

public abstract class MonHoc {
    String maMonHoc;
    String tenMonHoc;
    String soTinChi;

    public MonHoc(String subjectID, String subjectName, String creditNumber) {

        maMonHoc = subjectID;
        tenMonHoc = subjectName;
        soTinChi = creditNumber;
    }


    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public String getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(String soTinChi) {
        this.soTinChi = soTinChi;
    }

    @Override
    public String toString() {
        return "Ten mon hoc la " + tenMonHoc + "\n" +
                "maMaHoc la " + maMonHoc + "\n" +
                "so Tin chi la " + soTinChi + "\n";
    }

    public abstract double TinhDiem();
    public abstract void newLine();
}
