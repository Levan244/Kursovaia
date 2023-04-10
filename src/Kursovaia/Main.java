package Kursovaia;

import java.util.WeakHashMap;

public class Main {
    private static Employee[] workers = {
        new Employee("Daniel Davis", 10_000, 1),
        new Employee("Don Salazar", 20_000, 2),
        new Employee("Benjamin Reeves", 40_000, 3),
        new Employee("Thomas Love", 30_000, 4),
        new Employee("David Blake", 50_000, 5),

    };
    public static void main(String[] args) {
        printWorkers();

        System.out.println();

        printWorkersOfDepartment(5);

        System.out.println();

        totalMoneyOfDepartment(5);

        System.out.println();

        printWorkersWithMinSalary(50_000);

    }


    public static void printWorkers() {
        for (Employee worker: workers ) {
            System.out.println(worker);
            
        }
    }

    public static int totalMoney() {
        int sum = 0;
        for (Employee worker : workers) {
            sum += worker.getMoney();
        }
        return sum;
    }

    public static Employee minSalary() {
        Employee workerWithMinSalary = workers[0];
        int minSalari1 = workerWithMinSalary.getMoney();

        for (Employee worker : workers) {
            if (worker.getMoney() < workerWithMinSalary.getMoney()) {
                workerWithMinSalary = worker;
            }


        }
        return workerWithMinSalary;


    }
    public static Employee maxSalary() {
        Employee result = workers[0];
        int maxSalari1 = result.getMoney();

        for (Employee worker : workers) {
            if (worker.getMoney() > result.getMoney()) {
                result = worker;
            }


        }
        return result;


    }

    public static float averageSalary() {
        return totalMoney() / (float) workers.length;
    }

    public static void promotionSalary(int percent) {
        for (Employee worker : workers) {
            int salaryToday = worker.getMoney();
            worker.setMoney((int) (salaryToday * (percent / 100f + 1)));

            }
        }


    public static Employee minSalaryByDepartment(int department2) {
        int maxSalary2 = Integer.MAX_VALUE;
        Employee workerWithMinSalary = workers[0];

        for (Employee worker : workers) {
            if (worker.getDepartment() != department2){
                continue;

            }

            if (worker.getMoney() < workerWithMinSalary.getMoney()) {
                maxSalary2 = worker.getMoney();
                workerWithMinSalary = worker;
            }


        }
        return workerWithMinSalary;


    }
    public static Employee maxSalaryByDepartment(int department2) {
        int maxSalary2 = Integer.MIN_VALUE;
        Employee workerWithMaxSalary = null;

        for (Employee worker : workers) {
            if (worker.getDepartment() != department2){
                continue;

            }

            if (worker.getMoney() > maxSalary2) {
                maxSalary2 = worker.getMoney();
                workerWithMaxSalary = worker;
            }


        }
        return workerWithMaxSalary;


    }
    public static int totalMoneyOfDepartment(int department2) {
        int sum = 0;
        for (Employee worker : workers) {
            if (worker.getDepartment() == department2){
                sum += worker.getMoney();

            }

        }
        return sum;
    }

    public static float averageMoneyOfDepartment(int department2) {

        int sum = 0;
        int numberIfEmployees = 0;

        for (Employee worker : workers) {
            if (worker.getDepartment() == department2) {
                sum += worker.getMoney();
                numberIfEmployees++;

            }

        }
        return sum/(float) numberIfEmployees;
    }
    public static void promotionSalaryOfDepartment(int department2 ,int percent) {
        for (Employee worker : workers) {
            if (worker.getDepartment() == department2) {
                int salaryToday = worker.getMoney();
                worker.setMoney((int) (salaryToday * (percent / 100f + 1)));
            }
        }
    }
    public static void printWorkersOfDepartment(int department2) {
        for (Employee worker: workers ) {
            if (worker.getDepartment() == department2) {
                System.out.println(worker);
            }
        }
    }
    public static void printWorkersWithMinSalary(int salary) {
        for (Employee worker: workers ) {
            if (worker.getDepartment() < salary) {
                System.out.println(worker);
            }
        }
    }

    public static void printWorkersWithMaxSalary(int salary) {
        for (Employee worker: workers ) {
            if (worker.getDepartment() > salary) {
                System.out.println(worker);
            }
        }
    }






}



