//Array

import java.util.Scanner;

public class trail13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 numbers: ");
        int []marks=new int[5];
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }

        //Traversing in reverse order
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
        System.out.println("Size of array is: "+marks.length);

        //Traversal using for-each loop
        for(int i:marks){
            System.out.println(i);
        }
    }
}
