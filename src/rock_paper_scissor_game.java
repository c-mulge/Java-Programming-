import java.util.*;

public class rock_paper_scissor_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand=new Random();
        while(true){
            //Computer selection
            System.out.println("Let's Play Rock-Paper-Scissor!");
            String[]opt={"Rock","Paper","Scissor"};
            String comp=opt[rand.nextInt(opt.length)];   //random is inclusive-exclusive type
            System.out.println("Computer has chosen");

            //User selection
            String user;
            while(true){
                System.out.println("Choose one from these: 'Rock','Paper','Scissor'");
                System.out.print("What's yours: ");
                user=sc.nextLine();
                if(user.equals("Rock")||user.equals("Paper")||user.equals("Scissor")){
                    System.out.println();
                    break;
                }
                System.out.println("Invalid choice");
                System.out.println("Choose again!!");
            }
            System.out.println("Computer have chosen: "+comp);
            System.out.println();
            //now check
            if(user.equals(comp)){
                System.out.println("It's a tie");
            } else if (user.equals("Rock")) {
                if(comp.equals("Scissor")){
                    System.out.println("You won");
                    System.out.println("Very gooooood");
                } else if (comp.equals("Paper")) {
                    System.out.println("You Lose!");
                    System.out.println("Better luck next time!");
                    System.out.println();
                }
            } else if (user.equals("Paper")) {
                if (comp.equals("Rock")){
                    System.out.println("You won");
                    System.out.println("Very gooooood");
                } else if (comp.equals("Scissor")) {
                    System.out.println("You Lose!");
                    System.out.println("Better luck next time!");
                    System.out.println();
                }
            }
            else {
                if (comp.equals("Rock")) {
                    System.out.println("You Lose!");
                    System.out.println("Better luck next time!");
                    System.out.println();
                } else if (comp.equals("Paper")) {
                    System.out.println("You won");
                    System.out.println("Very gooooood");
                }
            }

                System.out.println();
                String nxt;
                System.out.println("Do u want to play again?");
                while(true){
                    System.out.println("Type: Yes or No");
                    nxt=sc.nextLine();
                    if(nxt.equals("Yes")||nxt.equals("yes")||nxt.equals("No")||nxt.equals("no")){
                        System.out.println();
                        System.out.println("*****************************************");
                        System.out.println();
                        break;
                    }
                    System.out.println("Invalid input");
                    System.out.println();
                }
                if (nxt.equals("No")||nxt.equals("no")){
                    break;
                }




        }

    }
}
