package Kursovaia;

public class Employee {
    private final Integer id;
    private String fullName;
    private Integer money;
    private Integer department;

    private static Integer idConstructor = 1;

    public Employee(String fullName, Integer money, Integer department ) {
        this.id = idConstructor++;
        this.fullName = fullName;
        this.money = money;
        this.department = department;

    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public static Integer getIdConstructor() {
        return idConstructor;
    }

    public static void setIdConstructor(Integer idConstructor) {
        Employee.idConstructor = idConstructor;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", money=" + money +
                ", department=" + department +
                '}';
    }
}
