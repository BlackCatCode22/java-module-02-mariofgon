import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileIO {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("You Found Me");
            writer.write("\n ");
            writer.write("\nGood Job");
            writer.write("\n ");
            writer.write("\nIf You Didn't");
            writer.write("\n ");
            writer.write("\nBetter Luck Next Time");
            writer.close();
        } catch (Exception e) {
        e.printStackTrace();
        }








    }
}
