package day27;

public class Multi_Dim_Short_Name {
    public static void main(String[] args) {
        String[] developpersTeam = {"Asim","Halis","Can"};
        String []testersTeam={"Zeynep","Ozde","Selmin"};
        String []bussinessAnalysitTeam={"F","Selimcan","Asaf","Eren"};

        String [][]scrumTeam={developpersTeam,testersTeam,bussinessAnalysitTeam};
        int minLength=scrumTeam[0][0].length();
        String shortString=scrumTeam[0][0];
        for (int i = 0; i <scrumTeam.length ; i++) {
            for (int j = 0; j <scrumTeam[i].length ; j++) {
                if( minLength >scrumTeam[i][j].length()){
                    minLength=scrumTeam[i][j].length();
                    shortString=scrumTeam[i][j];
                }

            }

        }
        System.out.println(minLength);
        System.out.println(shortString);





    }
}
