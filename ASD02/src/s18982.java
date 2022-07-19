import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class s18982 {
    public static void main(String[] args) {
        String[] strings;
        String wyjscie;

        File file = new File(args[0]);
        int len = 0;

        // ustalenie dlugosci tablicy
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                len++;
                scanner.nextLine();
            }
            System.out.println(len);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        strings = new String[len];

        // wypelnienie tablicy stringow

        try {
            Scanner scanner = new Scanner(file);
            for(int i = 0; i<strings.length; i++){
                strings[i] = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
