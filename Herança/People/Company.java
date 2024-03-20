package Herança.People;

public class Company extends People {

    private Integer numberEmployee;

    public Company() {
    }

    public Company(String name, Double anualIncome, Integer numberEmployee) {
        super(name, anualIncome);
        this.numberEmployee = numberEmployee;
    }

    public Integer getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(Integer numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    @Override
    public Double tax() {
        if (getNumberEmployee() > 10) {
            return super.getAnualIncome() * 0.14;
        } else {
            return super.getAnualIncome() * 0.16;
        }
    }
}
