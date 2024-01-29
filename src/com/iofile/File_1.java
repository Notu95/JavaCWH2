package com.iofile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_1 {
    public static void main(String[] args) {

        //Code to create new file
        /*
        File MyFile =new File("abcdef.txt");
        try {
            MyFile.createNewFile();
        } catch (IOException e) {
            System.out.println("File Creation is not successful");
            e.printStackTrace();
        }
        */

        //Code to write to a file
        /*
        try {
            FileWriter fw=new FileWriter("abcdef.txt");
            fw.write("Look ! file is getting written\n ok now bye");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        //Reading a file
        /*
        File MyFile=new File("abcdef.txt");
        try {
            Scanner sc = new Scanner(MyFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } */

        //Deleting a file
        /*
        File fw=new File("abcdef.txt");
        if(fw.delete()){
            System.out.println("The file have been delete. File Name:  "+ fw.getName());
        }else{
            System.out.println("some error occured when deleting the file");
        }*/

    }
}
