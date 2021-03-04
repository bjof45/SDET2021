package Array;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MainArray {
    public static void main(String[] args) {
        String filename;
        String data = "";
        Scanner get = new Scanner(System.in);
        int numbers[] = new int[4];
        ArrayList<String> names = new ArrayList<String>();

        System.out.println("Lets put some numbers into this array");

        for (int i = 0; i < numbers.length; i++) {
            int number = i+1;
            System.out.print("Please enter a number["+number+"]: ");
            numbers[i] = get.nextInt();
        }

        System.out.print("Enter the filename: ");
        filename = get.next();

        try {
            FileReader rf = new FileReader(filename);
            Scanner readfile = new Scanner(rf);

            while (readfile.hasNextLine()) {
                data = readfile.nextLine();
                names.add(data);
            }

        } catch(FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println("Check out the names we got: ");

        for(int i=0; i < names.size(); i++) {
            int number = i+1;
            System.out.println("Name #"+number+": "+names.get(i));
        }

    }
}
