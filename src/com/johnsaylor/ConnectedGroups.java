package com.johnsaylor;

import java.util.List;

public class ConnectedGroups {
    public static void test(){

    }

    static int connectedGroups(List<String> rows){
        int[][] matrix = new int[rows.size()][rows.get(0).length()];
        for (int i = 0; i < rows.size(); i++){
            char[] temp = rows.get(i).toCharArray();
            for (int j = 0; j < temp.length; j++) {
                matrix[i][j] = temp[j];
            }
        }


        return 0;
    }
}
