package day23;

public class ForEachLoopMax {
    public static void main(String[] args) {
        long [] salaries={100000L,200000L,150000L,115000L,260000L};
long maxSalary=salaries[0];
for(long checkSalary:salaries){
    if(checkSalary>maxSalary){
        maxSalary=checkSalary;
            }
      }
        System.out.println("max salary = "+maxSalary);
    }
}
