package exercise1_29;

public abstract class Employee {
    private String name;
    private int startDays;
    private double Salary = 0;
    public final double LCB = 1490000;

    public Employee(String name, int startDays){
        this.name = name;
        this.startDays = startDays;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDays(int startDays) {
        this.startDays = startDays;
    }

    public String getName() {
        return name;
    }

    public int getStartDays() {
        return startDays;
    }

    public abstract double TinhLuong();

}



