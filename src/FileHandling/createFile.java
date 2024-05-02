package FileHandling;

import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args)throws IOException {
        File f=new File("C:\\Users\\Rohit Ranjan\\IdeaProjects\\first\\src\\FileHandling\\a.txt");

            if (f.createNewFile()) {
                System.out.println("File is Successfully created...!");
            } else {
                System.out.println("File is already created...!");
            }
    }
}

//Another way.........................

//public class createFile {
//    public static void main(String[] args) {
//        File f=new File("C:\\Users\\Rohit Ranjan\\IdeaProjects\\first\\src\\FileHandling\\create_file.txt");
//        try {
//        if (f.createNewFile()) {
//            System.out.println("File is Successfully created...!");
//        } else {
//            System.out.println("File is already created...!");
//        }
//        }catch(IOException e){
//            System.out.println("Error is Handeld...!");
//        }
//
//    }
//}