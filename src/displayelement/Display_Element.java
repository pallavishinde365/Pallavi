package displayelement;

public class Display_Element {
    public static void main(String[] arg) {
        int i;
        for (i = 100; i <= 200; i++) {
            if (i % 10 != 7) {
                System.out.println(i);
            }
        }
    }
}
