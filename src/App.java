import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Hur många kilometer från jobbet bor du?");
        int distans = tb.nextInt();
        Scanner text = new Scanner(System.in);
        System.out.println("Har du sambo?");
        String sambo = text.nextLine();
        System.out.println("Hur många år varar arbetet?");
        int längd = tb.nextInt();
        if(sambo.equalsIgnoreCase("ja")){
            if(distans>50 && längd>3){
                System.out.println("Du får skattefuska lagligt");
            }
            else{
                System.out.println("Hoppsan hejsan, din familj är död");
            }
        }
        if(sambo.equalsIgnoreCase("nej")){
            if(distans>50 && längd>1){
                System.out.println("Du får skattefuska lagligt");
            }
            else{
                System.out.println("Hoppsan hejsan, din familj är död");
            }
        }
    }

}
