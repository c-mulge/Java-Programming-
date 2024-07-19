import java.util.*;

class game
{
  private int input;
  private int randomnumber;
  private int count=0;
  public game(){
      Random rand= new Random();
      randomnumber=rand.nextInt(10);
  }
  public void takeuserinput(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Guess the Number from 0 to 10 : ");
      input=sc.nextInt();
  }
  public boolean iscorrectnum()
    {
            if (input > randomnumber) {
                System.out.println("Number is greater");
                count++;
                System.out.println("Guess the Number Again");
                return false;
            } else if (input < randomnumber)
            {
                System.out.println("Number is Less");
                count++;
                System.out.println("Guess the Number Again");
                return false;
            }else{
                System.out.println("You've got it correct!");
                count++;
                System.out.println("Points: "+count);
                return true;
            }
    }
}

public class gameusingconstructor {
    public static void main(String[] args) {
        game g=new game();
        boolean b=false;
        while(!b){
            g.takeuserinput();
            b= g.iscorrectnum();
        }
    }
}
