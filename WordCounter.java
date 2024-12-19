import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the path of the file:");
        String fpath=sc.nextLine();
        File fl=new File(fpath);   //Holds file path
        Scanner filescanner=new Scanner(fl); //Reads file
        StringBuilder text=new StringBuilder();
        while(filescanner.hasNextLine()){
            text.append(filescanner.nextLine()).append("\n"); //"\n" means moving to another line
        }
        int characters=text.toString().length();
        int words=text.toString().split("\\s+").length; //"\\s+" means white spaces
        int sentences=text.toString().split("!.?").length; //"!.?" means anywhere where there is a mark that signifies a new sentence
       
        System.out.println("This file has:");
        if(characters>1){
            System.out.println(characters+" characters");
        }
        else{
            System.out.println(characters+" character");
        }

        if(words>1){
            System.out.println(words+" words");
        }
        else{
            System.out.println(words+" word");
        }

        if(sentences>1){
            System.out.println(sentences+" sentences");
        }
        else{
            System.out.println(sentences+" sentence");
        }
    }
}