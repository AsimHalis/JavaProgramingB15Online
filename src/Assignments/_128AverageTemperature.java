package Assignments;
import java.util.*;
public class _128AverageTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        for (int x = 0; x <temps.length ; x++) {

            total=total+temps[x];
            avgTemp=total/temps.length;
        }
       // System.out.println(total);
        System.out.println(avgTemp);

    }
}
