package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) throws FileNotFoundException {
        readLinesInReverse(0);
        /*
        Scanner input = new Scanner(new File("src/q1/sample.txt"));
        while(input.hasNextLine()){
            System.out.println(input.nextLine());
        }
        input.close();
         */
    }
    public static void readLinesInReverse(int numOfCalls) throws FileNotFoundException {
        Scanner input = new Scanner(new File("src/q1/sample.txt"));
        int x = 0;
        while(numOfCalls > x){
            input.nextLine();
            x++;
        }
        while(input.hasNextLine()){
            readLinesInReverse(numOfCalls + 1);
            System.out.println(input.nextLine());
            break;
        }
        input.close();
    }
}
