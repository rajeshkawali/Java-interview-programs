package com.programs.interviewprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWordInFile 
{   
    public static void main(String[] args) 
    {    
        //Creating wordCountMap which holds words as keys and their occurrences as values
         
        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
     
        BufferedReader reader = null;
         
        try
        {
            //Creating BufferedReader object
             
            reader = new BufferedReader(new FileReader("/root/Desktop/raj.txt"));
             
            //Reading the first line into currentLine
             
            String currentLine = reader.readLine();
             
            while (currentLine != null)
            {    
                //splitting the currentLine into words
                 
                String[] words = currentLine.toLowerCase().split(" ");
                 
                //Iterating each word
                 
                for (String word : words)
                {
                    //if word is already present in wordCountMap, updating its count
                     
                    if(wordCountMap.containsKey(word))
                    {    
                        wordCountMap.put(word, wordCountMap.get(word)+1);
                    }
                     
                    //otherwise inserting the word as key and 1 as its value
                    else
                    {
                        wordCountMap.put(word, 1);
                    }
                }
                 
                //Reading next line into currentLine
                 
                currentLine = reader.readLine();
            }
             
            //Getting the most repeated word and its occurrence
             
            String mostRepeatedWord = null;
             
            int count = 0;
             
            Set<Entry<String, Integer>> entrySet = wordCountMap.entrySet();
             
            for (Entry<String, Integer> entry : entrySet)
            {
                if(entry.getValue() > count)
                {
                    mostRepeatedWord = entry.getKey();
                     
                    count = entry.getValue();
                }
            }
             
            System.out.println("The most repeated word in input file is : "+mostRepeatedWord);
             
            System.out.println("Number Of Occurrences : "+count);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }    
}