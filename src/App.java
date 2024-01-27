import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt();
        sc.close();

        if(a <= 0){
            System.out.println("E");
        }else if(a >0 && a <=35){
            System.out.println("D");
        }else if(a > 35 && a <= 60){
            System.out.println("C");
        }else if(a > 60 && a<=85){
            System.out.println("B");
        }else{
            System.out.println("A");
        }

    }
}
