package numberpattern;

public class Number_Pattern {
    public static void main(String[] arg){
        int i,j,row=5;
        for(i=1;i<=row;i++){
            for(j=1;j<=i;j++){
                if(j%2==0) {
                    System.out.print(0);
                }else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
