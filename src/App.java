import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String currentDir = System.getProperty("user.dir");
        String fileName = currentDir + "\\array.txt";
        Scanner scan= new Scanner(new FileInputStream(fileName));
        while (scan.hasNext()){
            arr.add(scan.nextInt());
        }
        scan.close();
        // Random rand = new Random();
        // for (int i = 0; i < 1000; i++){
        //    arr.add(rand.nextInt(100));
        // }

        System.out.println(SimpleClass._max(arr));
        System.out.println(SimpleClass._min(arr));
        System.out.println(SimpleClass._sum(arr));
        System.out.println(SimpleClass._mult(arr));
    }
}