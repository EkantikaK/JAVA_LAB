package lab5.General;

public class employee {

    protected int empid;
    private String ename;

    public void setDetails(int id, String name) {
        this.empid = id;
        this.ename = name;
    }

    public double earnings(double basic) {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }
}
