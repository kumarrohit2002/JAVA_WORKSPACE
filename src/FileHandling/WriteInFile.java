package FileHandling;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String[] args) {
        try {
            FileWriter f=new FileWriter("C:\\Users\\Rohit Ranjan\\IdeaProjects\\first\\src\\FileHandling\\create_file.txt");
            try{
                f.write("Java is the Best language.");

            }finally {
                f.close();
            }
            System.out.println("successfully Data wrote in File..!");
        }catch(IIOException e){
            System.out.println(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
