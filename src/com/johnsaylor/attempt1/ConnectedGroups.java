package com.johnsaylor.attempt1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectedGroups {
    public static void test(){
        ArrayList<String> rows = new ArrayList<String>();
        rows.add("1100");
        rows.add("1110");
        rows.add("0110");
        rows.add("0001");

        connectedGroups(rows);
    }

    static int connectedGroups(List<String> rows){
       int[] groups = initializeGroups(rows.size());
       int[] sizes = initializeSize(rows.size());

        for (int i = 0; i < rows.size(); i++) {
            String row = rows.get(i);
            for (int j = 0; j < row.length(); j++) {
                int friend = Integer.parseInt(String.valueOf(row.charAt(j)));
                System.out.print(friend + " ");
                if (friend != i && friend == 1) {
                    union(i, j, groups, sizes);
                }
                System.out.println();
            }
        }
        System.out.println(Arrays.toString(groups));
        System.out.println(Arrays.toString(sizes));
        return 0;
    }

    static int[] initializeGroups(int n){
        int[] groups = new int[n];
        for (int i = 0; i < n; i++) {
            groups[i] = i;
        }
        return groups;
    }

    static int[] initializeSize(int n){
        int[] size = new int[n];
        Arrays.fill(size, 1);
        return size;
    }

    static int getRoot(int friend, int[] groups){
        while (groups[friend] != friend) {
            friend = groups[friend];
        }
        return friend;
    }

    static void union(int A, int B, int[] groups, int[] sizes){
        int rootA = getRoot(A, groups);
        int rootB = getRoot(B, groups);

        if (sizes[rootA] > sizes[rootB]) {
            groups[rootB] = rootA;
            sizes[rootB] += sizes[rootA];
//            sizes[rootB] = 0;
        } else {
            groups[rootA] = rootB;
            sizes[rootA] += sizes[rootB];
//            sizes[rootA] = 0;
        }
    }
}
