package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        long [] salaries={100000L,200000L,150000L,115000L,60000L};

        for(long eachSalary:salaries){
            System.out.println("Each Salary "+" = "+eachSalary);
        }
        for(long mySalary:salaries){
            if(mySalary>100000L){
                System.out.println("New salary = "+mySalary);
            }
            if(mySalary<=100000L){
                continue;
            }
            System.out.println("new2 salaryy = "+mySalary);
        }


    }
}
