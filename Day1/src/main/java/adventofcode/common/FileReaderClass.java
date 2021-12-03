package main.java.adventofcode.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;


public class FileReaderClass {

    String pathToFile;

    public FileReaderClass(String path) {
        pathToFile = path;
    }

    public List<Integer> readIntegers() {

        List<Integer> measureCollection = new LinkedList<>();

        try {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream inputStream = classloader.getResourceAsStream(pathToFile);
            assert inputStream != null;
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line = reader.readLine();

            while (line != null) {

                measureCollection.add(Integer.parseInt(line));
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return measureCollection;
    }

    public List<String> readStrings() {

        List<String> measureCollection = new LinkedList<>();

        try {
            BufferedReader reader = getReader();

            String line = reader.readLine();

            while (line != null) {

                measureCollection.add(line);
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return measureCollection;
    }

    private BufferedReader getReader() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(pathToFile);
        assert inputStream != null;
        return new BufferedReader(new InputStreamReader(inputStream));
    }
}
