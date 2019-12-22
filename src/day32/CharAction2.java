package day32;

public class CharAction2 {
    public static void main(String[] args) {

        printAlphabetInRange('a','f');
        printAlphabetInRange('z', 'u');
        printAlphabetInRange('d','d');
    }
        public static void printAlphabetInRange(char beginning, char ending){

            // this mean beginning character comes before ending character
            // in ascii table
            if (beginning < ending) {
                System.out.println("WE NEED TO INCREMENT FROM " + beginning + " till " + ending);

                for (char iChar = beginning; iChar <= ending; iChar++) {
                    System.out.print(iChar + " ");
                }
                System.out.println();

                // this mean beginning character comes after ending character
                // in ascii table
            } else if (beginning > ending) {
                System.out.println("WE NEED TO DECREMENT FROM " + beginning + " till " + ending);

                for (char iChar = beginning; iChar >=ending; iChar--) {
                    System.out.print(iChar + " ");
                }
                System.out.println();


                }
            else{
                System.out.println("Charakters are Same");
            }
            }
        }


