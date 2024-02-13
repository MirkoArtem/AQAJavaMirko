package Lesson_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {

    public void writeDataToCSV(AppData appData) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("test.csv"))) {
            StringBuilder headerSb = new StringBuilder();
            for (int i = 0; i < appData.getHeader().length; i++) {
                headerSb.append(appData.getHeader()[i]);
                headerSb.append(";");
            }
            bw.write(headerSb.toString());
            bw.newLine();
            for (int i = 0; i < appData.getData().length; i++) {
                StringBuilder dataSb = new StringBuilder();
                for (int j = 0; j < appData.getData()[i].length; j++) {
                    dataSb.append(appData.getData()[i][j]);
                    dataSb.append(";");
                }
                bw.write(dataSb.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("ERROR!!!");
        }
    }

    public AppData readFromCSV(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            int counter = 0;
            List<int[]> list = new ArrayList<>();
            String[] headers = null;
            while (br.ready()) {
                if (counter == 0) {
                    String headerFromCsv = br.readLine();
                    headers = headerFromCsv.split(";");
                    counter++;
                } else {
                    String temp = br.readLine();
                    String[] split = temp.split(";");
                    int[] intDataArray = new int[split.length];
                    for (int i = 0; i < split.length; i++) {
                        intDataArray[i] = Integer.parseInt(split[i]);
                    }
                    list.add(intDataArray);
                }
            }
            int[][] data = new int[list.size()][];
            for (int i = 0; i < list.size(); i++) {
                data[i] = list.get(i);
            }

            return new AppData(headers, data);

        } catch (IOException e) {
            System.out.println("ERROR!!!");
        }
        return null;
    }
}
