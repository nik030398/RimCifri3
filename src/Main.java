import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int[] bumber;
        bumber = array(number);
        System.out.println(Arrays.toString(bumber));

    }
    public static int[] array(int number) {
        ArrayList<String> arrayList = new ArrayList<String>();
        number = Math.abs(number);
        int[] ama;
        int length = String.valueOf(number).length();
        int[] result = new int[length];
        while (number != 0) {
            result[--length] = number % 10;
            number /= 10;
            arrayList.add(Arrays.toString(result));
        }
        return result;

    }

}