import java.util.Scanner;
//if-else condition and switiching
public class trail8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a=sc.nextInt();
        /*
        if(a>56){
            System.out.println("You're experienced");
        }
        else if(a>48){
            System.out.println("You're semi- experienced");
        }
        else if(a>36){
            System.out.println("You're semi-semi-experienced");
        }
        else if(a>18){
            System.out.println("You're not so experienced");
        }
        else {
            System.out.println("You're underage");
        }*/

        switch (a){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hello World");
                break;
            case 3:
                System.out.println("Hello C");
                break;
            default:
                System.out.println("Invalid!");
        }
    }
}
