import java.util.Scanner;

public class table {
    public static void main(String[] arg){
        int num,i;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number:");
        num=scanner.nextInt();
        System.out.println("table of:"+num);
        for(i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}
