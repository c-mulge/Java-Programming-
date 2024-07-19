import java.util.*;

class game
{
  int n,g;
  int count=0;
  public game(){
      Random rand= new Random();
      int g=rand.nextInt(10);
  }
  public void takeuserinput(int i){
      n=i;
  }
    public boolean iscorrectnum()
    {
            if (n > g) {
                System.out.println("Number is greater");
                count++;
                return false;
            } else if (n < g)
            {
                System.out.println("Number is Less");
                count++;
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
        g.iscorrectnum(50);
        g.takeuserinput(12);
    }
}
