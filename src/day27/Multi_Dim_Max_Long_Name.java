package day27;

public class Multi_Dim_Max_Long_Name {
    public static void main(String[] args) {
        String[] developpersTeam = {"Asim","Halis","Can"};
        String []testersTeam={"Zeynep","Ozde","Selmin"};
        String []bussinessAnalysitTeam={"F","Selimcan","Asaf","Eren"};

        String [][]scrumTeam={developpersTeam,testersTeam,bussinessAnalysitTeam};
         int maxLength=scrumTeam[0][0].length();
         String longestString="";
        for(String[] each1DArray    : scrumTeam  ){
            for(String eachElement:each1DArray   ){
                if(maxLength<eachElement.length()){
                    maxLength=eachElement.length();
                    longestString=eachElement;
                }
            }
        }

        System.out.println(maxLength);//8
        System.out.println(longestString);//SelimCan




    }
}
