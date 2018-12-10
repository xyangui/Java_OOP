package com.company.algorithms;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class TranslateDocument {

    public static void main() {

        String fileName = "doc.txt";
        String language = "French";
        HashMap<String, HashMap<String, String>> dict = new HashMap<>();

        try {
            TranslateDocument(fileName, language, dict);
        } catch (FileNotFoundException fileNotFoundException){

        }
    }

    public static void TranslateDocument(String filename, String language,
                                         HashMap<String, HashMap<String, String>> translations)
            throws FileNotFoundException {
//        throws LanguageNotFoundException {
//        if (!translations.containsKey(language) {
//            throw new LanguageNotFoundException();
//            return;
//        }

        ArrayList<String> input = retriveContents(filename);
        ArrayList<String> output = new ArrayList<>();
        HashMap<String, String> dict = translations.get(language);

        for (String inputLine : input) {
            String[] words = inputLine.toLowerCase().split(" ");
            String outputLine = "";
            for (String word : words) {
                if (dict.containsKey(word)) {
                    outputLine += dict.get(word) + " ";
                } else {
                    outputLine += word + " ";
                }
            }
            output.add(outputLine.trim() + "\n");
        }

        String outFilename = String.format("%s-%s.%s", filename.split("\\.")[0], language,
                filename.split("\\.")[1]);
        writeTranslation(outFilename, output);
    }

    public static ArrayList<String> retriveContents(String filename) {
        ArrayList<String> strArrayList = new ArrayList<>();
        return strArrayList;
    }
    public static void writeTranslation(String filename, ArrayList<String> contents){

    }
}
