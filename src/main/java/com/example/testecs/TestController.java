package com.example.testecs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping(value = "/wordGame")
    public String Test() throws IOException {
        String substring = "test";

        List<String> words = new ArrayList<>();

        File file = new File("/Users/kimsunghoon/Downloads/test-ecs/" + substring);
        FileReader filereader = new FileReader(file);
        BufferedReader bufReader = new BufferedReader(filereader);
        String line = "";
        while((line = bufReader.readLine()) != null){
            if (!line.isEmpty() && line.length() == 4){
                words.add(line);
            }
        }
        bufReader.close();

        double random=Math.random();
        int num = (int)Math.round(random * (words.size()-1));
        return words.get(num);

    }

//    public static void main(String[] args) throws IOException {
//        String substring = "test";
//
//        List<String> a = new ArrayList<>();
//
//        try{
//            File file = new File("/Users/kimsunghoon/Downloads/test-ecs/" + substring);
//            FileReader filereader = new FileReader(file);
//            BufferedReader bufReader = new BufferedReader(filereader);
//            String line = "";
//            while((line = bufReader.readLine()) != null){
//                a.add(line);
//            }
//            bufReader.close();
//        }catch (FileNotFoundException e) {
//        }catch(IOException e){
//            System.out.println(e);
//        }
//
//        double random=Math.random();
//        int num = (int)Math.round(random * (a.size()-1));
//
//        System.out.println(a.get(num));
//
//    }



}
