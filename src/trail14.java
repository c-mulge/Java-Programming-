import java.util.Scanner;

public class trail14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //create an array of 5 floats and calculate their sum
        /*float sum=0;
        System.out.println("Enter 5 numbers: ");
        float[] arr=new float[5];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextFloat();
        }
        for (float v : arr) {
            sum += v;
        }
        System.out.println(sum);
        */

//        for(float ele:arr){
//            System.out.println(ele);
//        }

        //Q.2. find out whether a given int is present in an array or not
        /*
        System.out.println("Enter an array of size 5: ");
        int[] arr=new int[5];
        boolean isinarr=false;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println();
        int a;
        System.out.print("Enter a number to find in the array: ");
        a=sc.nextInt();
        for (int j : arr) {
            if (j == a) {
                isinarr=true;
                break;
            }
        }
        if(isinarr){
                System.out.printf("%d is present in the array", a);
        }else{
                System.out.printf("%d is not present in the array", a);
        }*/

        //calculate the average marks from an array containing marks of all student in physics using for-each loop
        /*
        int []arr=new int[5];
        int sum=0;
        float avg;
        System.out.print("enter an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int j : arr) {
            sum += j;
        }
        System.out.println();
        avg=(float)sum/ arr.length;
        System.out.println(avg);*/

        //add two matrices
        /*
        int[][] mat1={{1,2,3},{4,5,6}};
        int[][] mat2={{4,5,6},{1,2,3}};
        int[][] result={{0,0,0},{0,0,0}};

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j]+" ");
//                result[i][j]=mat1[i][j]+mat2[i][j];
            }
            System.out.println();
        }*/

        //reversing an array
        int []arr={1,2,3,4,5,6,7,8,9,10,11};
        int start=0;
        int temp;
        int end= arr.length-1;
        while(start < end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int j:arr){
            System.out.print(j+" ");
        }
    }
}
