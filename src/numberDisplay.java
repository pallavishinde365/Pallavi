public class numberDisplay {
    public static void main(String[] arg){
        int i,j,count=1;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }
    }
}
