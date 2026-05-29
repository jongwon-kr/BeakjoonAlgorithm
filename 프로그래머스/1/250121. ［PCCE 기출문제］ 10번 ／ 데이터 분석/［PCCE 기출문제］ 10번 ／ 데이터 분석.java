import java.util.*;
import java.io.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        List<String> columns = Arrays.asList("code", "date", "maximum", "remain");

        int extIdx = columns.indexOf(ext);
        int sortIdx = columns.indexOf(sort_by);

        return Arrays.stream(data)
                .filter(row -> row[extIdx] < val_ext)
                .sorted(Comparator.comparingInt(row -> row[sortIdx]))
                .toArray(int[][]::new);
    }
}