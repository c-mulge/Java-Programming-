public class trail16 {
    static int sum(int ...arr){
        int result=0;
        for (int ele:arr){
            result+=ele;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum is: "+sum(4,5));
        System.out.println("The sum is: "+sum(4,5,2));
        System.out.println("The sum is: "+sum());
    }
}
