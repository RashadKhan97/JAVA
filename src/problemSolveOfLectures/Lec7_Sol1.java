//Qsn - Make a function to check if a number is prime or not.

package problemSolveOfLectures;

import java.util.Scanner;

public class Lec7_Sol1 {
    public static int checkPrimeNumber(int n){
        int count =0;
        for (int i=2; i<n; i++){
            if(n%i == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n=sc.nextInt();

        int catchCount = checkPrimeNumber(n);

        if (catchCount == 0){
            System.out.println(n+ " is a prime number.");
        }else{
            System.out.println(n+ " is not a prime number.");
        }
    }
}
