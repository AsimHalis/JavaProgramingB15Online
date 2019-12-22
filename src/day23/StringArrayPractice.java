package day23;

public class StringArrayPractice {
    public static void main(String[] args) {
        String[] show = {"Orville","Gifted","Arrow","Flash","Super Girl","Game of Throne"};
        for (int x = 0; x < show.length; x++) {
               String currentShow=show[x];
            System.out.println(currentShow+" : has character count = "+currentShow.length());
        }
    }
}