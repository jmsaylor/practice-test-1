package com.johnsaylor.attempt2;

import java.util.Arrays;

public class FriendGroups {

    static void DFS(int[][] friends, int friendSize, int[] visited, int currentFriend) {
        for (int i = 0; i < friendSize; i++) {
           if (friends[currentFriend][i] == 1 && visited[i] != 1 && currentFriend != i) {
               visited[i] = 1;
               DFS(friends, friendSize, visited, i);
           }
        }
    }

    static int friendCircles(int[][] friends) {
        int friendSize = friends.length;
        int[] visited = new int[friendSize];
        Arrays.fill(visited, 0);

        int groups = 0;

        for (int i = 0; i < friendSize; i++) {
            if (visited[i] != 1) {
                visited[i] = 1;
                DFS(friends, friendSize, visited, i);
                groups++;

            }
        }

        return groups;
    }

    public static void run() {
        int[][] friends = { {1,1,0,0}, {1,1,1,0}, {0,1,1,0}, {0,0,0,1} };
        System.out.println("Number of friends circles: " + friendCircles(friends));
    }
}
