package Assignments;
import java.util.Scanner;
public class _94ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalProce = 0;

        System.out.println("Enter Item" + count + " and its price:");
        item = scan.next();
        price = scan.nextDouble();
        System.out.println("Add one more item?");
        countinue = scan.next();
        shoppingListReport= "Item" + count+ ": "+item +" Price: "+price;
        totalProce = totalProce + price;
        while (countinue.equals("yes")) {
            System.out.println("Enter Item" + (count+1) + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            ++count;

            shoppingListReport+= ", Item" + count+ ": "+item +" Price: "+price+" ";

            System.out.println("Add one more item?");
            countinue = scan.next();
            totalProce = totalProce + price;
        }
         System.out.println(shoppingListReport);
        System.out.println("Total price: " + totalProce);
        }

}
