package exercise1_30;

import java.util.Scanner;

public class MonThucHanh extends MonHoc{
    private double diem1;
    private double diem2;
    private double diem3;
    private double diem4;

    public MonThucHanh(String subjectID, String subjectName, String creditNumber) {
        super(subjectID, subjectName, creditNumber);
        Scanner input = new Scanner(System.in);
        System.out.println("moi nhap diem 1");
        this.diem1 = input.nextDouble();
        System.out.println("moi nhap diem 2");
        this.diem2 = input.nextDouble();
        System.out.println("moi nhap diem 3");
        this.diem3 = input.nextDouble();
        System.out.println("moi nhap diem 4");
        this.diem4 = input.nextDouble();
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

    public double getDiem4() {
        return diem4;
    }

    public void setDiem4(double diem4) {
        this.diem4 = diem4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Diem 1 la " + diem1 + "\n" +
                "Diem 2 la " + diem2 + "\n" +
                "Diem 3 la " + diem3 + "\n" +
                "Diem 4 la " + diem4;
    }

    @Override
    public double TinhDiem() {
        System.out.println("Diem trung binh mon thuc hanh la ");
        return (diem1 + diem2 + diem3 + diem4) / 4;
    }

    @Override
    public void newLine() {
        System.out.println("\n");
    }
}
