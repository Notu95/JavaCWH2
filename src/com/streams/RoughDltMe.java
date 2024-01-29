package com.streams;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RoughDltMe {
    public static void main(String[] args)  {

        File f=new File("abc.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            System.out.println("File not get created");
            e.printStackTrace();
        }
        try {
            FileWriter fw = new FileWriter("abc.txt");
            fw.write("Hey! file is getting written");
            fw.close();
        } catch (IOException e) {
            System.out.println("FileWriter not get created");
            e.printStackTrace();
        }

        try {
            String filePath="C:\\Users\\SOURAV\\OneDrive\\Desktop\\JAVA_Projects\\IntelliJ_IDEA_workspace\\CWH2\\abc.txt";
            FileReader fr=new FileReader(filePath);
            String fileContent=fr.toString();
            System.out.println("Hey , this is file content!  : "+fileContent);

            List<String> lines= null;
            try {
                lines = Files.readAllLines(Paths.get(filePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            for(String line:lines){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


//        String str1="Sourrav";
//        String str2=str1.substring(3,5);
//        char str3= str1.charAt(4);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str1.indexOf("r",2));
//        System.out.println("Hi"+str1.lastIndexOf("r"));
//
//        String data = "Alice, Bob, Carol and David";
//        String[] names = data.split("[,\\s]+"); // Split by commas or whitespace
//        for (String name : names) {
//            System.out.println(name);}
//
//
//            System.out.println(str1.getBytes(StandardCharsets.UTF_8));
//         char[] arr=str1.toCharArray();
//        System.out.println(arr[2]);
//
//        String str4="sourav|mosh|khosh";
//        String str5="ghosh";
//        String str6= str4.concat(str5);
//        System.out.println(str6);
//
//        String[] fruits = {"Apple", "Orange", "Banana"};
//        String result = String.join("| ", fruits);
//        System.out.println(result);
//
//        List<String> stringList = new ArrayList<>();
//        stringList.add("Gopal");
//        stringList.add("Shre Madhusudan");
//        stringList.add("Banki Bihari");
//
//        // Convert List to Array
//        String[] stringArray = stringList.toArray(new String[0]);
//
//        // Print the elements of the array
//        for (String fruit : stringArray) {
//            System.out.println(fruit);
//        }


    }


}
