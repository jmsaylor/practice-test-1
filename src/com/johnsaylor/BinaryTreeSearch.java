package com.johnsaylor;

public class BinaryTreeSearch {
    public static void test(){
        int[] nodes = new int[]{20,10,30,8,12,25,40,6,11,13,23};
        int[] queries = new int[]{8,4,6};
        binarySearch(nodes, queries);
    }

    static class Node {
        int value;
        Node left = null;
        Node right = null;
        public Node(int value) {
            this.value = value;
        }
    }

    public static void binarySearch(int[] nodes, int[] queries){
        Node head = new Node(nodes[0]);

        for(int i = 1; i < nodes.length; i++){
            addNode(nodes[i], head);
        }

        for (int query : queries){
            System.out.println((checkValue(query, head) ? "YES" : "NO" ));
        }
    }

    static boolean checkValue(int num, Node head){
        if (head == null) return false;
        System.out.println(head.value);
        if (head.value == num) return true;

        if (num > head.value) {
            return checkValue(num, head.right);
        }
        if (num < head.value){
            return checkValue(num, head.left);
        }

        return false;
    }

    static void addNode(int num, Node head){
        if (num < head.value) {
            if (head.left == null) {
                head.left = new Node(num);
            } else {
                addNode(num, head.left);
            }
        }
        if(num > head.value){
            if (head.right == null) {
                head.right = new Node(num);
            } else {

                addNode(num, head.right);
            }
        }

    }


}
