package uk.ac.uea.framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mradl on 14/12/2016.
 */

public class CSVreader {
    InputStream inputStream;

    public CSVreader(InputStream is) {
        this.inputStream = is;
    }


    public List<String[]> read() {
        List<String[]> resultList = new ArrayList<String[]>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        int readLine = 0;
        try {
            String csvLine;
            while ((csvLine = reader.readLine()) != null) {
                readLine++;
                if(readLine <= 180){
                String[] row = csvLine.split(",");

                resultList.add(row);

                }
            }

        } catch (IOException ex) {
            throw new RuntimeException("Error in reading CSV file:" + ex);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException("Error while closing input stream: " + e);
            }


        }

        return resultList;
    }
}


