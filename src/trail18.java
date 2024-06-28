import java.util.*;

public class trail18 {
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
//        System.out.println(sum);
    }

    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=n;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    static int fib2(int n){
        if(n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }else{
            return fib2(n-1)+fib2(n-2);
        }
    }

    static int sum(int ...arr){
        int n= arr.length;
        int sum=0;
        for (int j : arr) {
            sum += j;
        }
        return sum/n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int n=sc.nextInt();
        System.out.println(fact(n));
//        fact(n);*/
//        pattern1(4);
//        pattern2(4);
//        System.out.println(fib(6));
//        System.out.println(fib2(6));

        System.out.println("The average is: "+sum(1,2,3,4,5));
    }
}
