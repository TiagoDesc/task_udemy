package POO.Employee;

public class employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double liquidSalary (){
        return grossSalary - tax;
    }

    public void increaseSalary(double percent){
        grossSalary += grossSalary * percent / 100;

    }
    
}
