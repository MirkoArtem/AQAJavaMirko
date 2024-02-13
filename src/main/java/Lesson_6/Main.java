package Lesson_6;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] header = {"Value1", "Value2", "Value3"};
        int[][] data = {{100, 300, 123}, {200, 400, 321}, {123, 500, 100}};
        AppData appData = new AppData(header, data);
        CSVUtils aw = new CSVUtils();
        aw.writeDataToCSV(appData);
        AppData test = aw.readFromCSV("test.csv");

        System.out.println(Arrays.toString(test.getHeader()));
        for (int[] i : test.getData()) {
            System.out.println(Arrays.toString(i));
        }
    }
}
