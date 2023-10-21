package q5;

import java.io.*;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        try(
                Scanner input = new Scanner(new File("src/q5/inputFile.txt"));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/q5/outputFile.txt"));
                ){
            while(input.hasNextLine()){
                bufferedWriter.write(input.nextLine() + "\n");

            }

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
