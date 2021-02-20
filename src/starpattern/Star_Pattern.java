package starpattern;

public class Star_Pattern {
    public static void main(String[] arg){
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=6;j++){
                if(i>=2 && j>=2 && i<=3 && j<=5){
                    System.out.print(" ");
                }else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
