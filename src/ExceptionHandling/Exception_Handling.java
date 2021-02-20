package ExceptionHandling;

public class Exception_Handling {
    public  static  void main(String[] arg){
        int i;
        try{
            i=50/0;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception"+e.getMessage());
        }finally {
            System.out.println("Rest of the code....");
        }
    }
}
