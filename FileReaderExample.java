import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {

        try {
            System.out.println("Before Writing:");
            FileReader fr1 = new FileReader("charfile.txt");
            int i;
            while ((i = fr1.read()) != -1) {
                System.out.print((char) i);
            }
            fr1.close();

            FileWriter fw = new FileWriter("charfile.txt");
            fw.write("Hello Sagar");
            fw.close();

            System.out.println("\n\nAfter Writing:");
            FileReader fr2 = new FileReader("charfile.txt");
            while ((i = fr2.read()) != -1) {
                System.out.print((char) i);
            }
            fr2.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
