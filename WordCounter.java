import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        String fpath=sc.nextLine();
        File fl=new File(fpath);   //Holds file path
        Scanner filescanner=new Scanner(fl);
        StringBuilder text=new StringBuilder();
        while(filescanner.hasNextLine()){
            text.append(filescanner.nextLine()).append("\n");
        }
        int characters=text.toString().length();
        int words=text.toString().split("\\s+").length;
        int sentences=text.toString().split("!.?").length;

        System.out.println("This file has:");
        System.out.println(characters+" characters");
        System.out.println(words+" words");
        System.out.println(sentences+" sentences");
    }
}