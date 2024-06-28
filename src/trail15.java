import java.util.Scanner;

public class trail15 {
    int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter value for a: ");
        a=sc.nextInt();
        System.out.print("Enter value for b: ");
        b=sc.nextInt();
        System.out.println();
        trail15 obj=new trail15();
        System.out.println(obj.logic(a,b));

//        System.out.println(logic(a,b));

    }
}
