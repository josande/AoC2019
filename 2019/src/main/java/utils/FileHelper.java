package utils;

import sun.misc.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileHelper {
    public List<String> readFile(String fileName) {
        List<String> out = new ArrayList<>();
        try (InputStream in =
                     getClass().getClassLoader().getResourceAsStream(fileName)) {
            BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            for (String line = br.readLine();
                 line != null;
                 line = br.readLine()) {
                out.add(line);
            }
        } catch (IOException e) {
            System.out.println("FILE READ FAILED");
        }
        return out;
    }

    public List<Integer> readFileAsInts(String fileName) {
        return readFile(fileName).stream().map(Integer::valueOf).collect(Collectors.toList());
    }
}
