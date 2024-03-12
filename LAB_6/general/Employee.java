package general;

public class Employee
{
    public double empid;
    public String ename;
    private double basic;

    public Employee(double empid, String ename, double basic) {
        this.empid = empid;
        this.ename = ename;
        this.basic = basic;
    }

    double DA(double basic)
    {
        return 0.8*basic;
    }

    double HRA(double basic)
    {
        return 0.15*basic;
    }

    public double earnings()
    {
        return (basic + DA(basic) + HRA(basic) );
    }

}
