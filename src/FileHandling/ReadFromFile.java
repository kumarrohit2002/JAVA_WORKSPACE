package FileHandling;

import java.io.File;

public class ReadFromFile {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Rohit Ranjan\\IdeaProjects\\first\\src\\FileHandling\\create_file.txt");
        if(f.exists()){
            System.out.println("File Name : "+f.getName());
//            System.out.println("File Path : "+f.getPath());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File Readable : "+f.canRead());
            System.out.println("File Writeable : "+f.canWrite());
            System.out.println("File size : "+f.length());

//            System.out.println("File is deleted : "+f.delete());
        }else{
            System.out.println("File does not Exits..!");
        }
    }
}
