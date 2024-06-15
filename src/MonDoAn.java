import java.util.Scanner;

public class MonDoAn extends MonHoc {
    private double diemGVHD;
    private double diemGVPB;

    public MonDoAn(String subjectID, String subjectName, String creditNumber) {
        super(subjectID, subjectName, creditNumber);
        System.out.println("Moi nhap diem mon do An");
        Scanner input = new Scanner(System.in);
        System.out.println("moi nhap diem giao vien huong dan ");
        this.diemGVHD = input.nextDouble();
        System.out.println("moi nhap diem giao vien phan bien ");
        this.diemGVPB = input.nextDouble();
    }

    public double getDiemGVHD() {
        return diemGVHD;
    }

    public void setDiemGVHD(double diemGVHD) {
        this.diemGVHD = diemGVHD;
    }

    public double getDiemGVPB() {
        return diemGVPB;
    }

    public void setDiemGVPB(double diemGVPB) {
        this.diemGVPB = diemGVPB;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "diem GVHD la " + diemGVHD + "\n" +
                "diem GVPB la " + diemGVPB;
    }

    @Override
    public double TinhDiem() {
        System.out.println("Diem trung binh mon do an la ");
        return (diemGVHD + diemGVPB) / 2;
    }
}
