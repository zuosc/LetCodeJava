package com.z.learn._449serializeAndDeserializeBst;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SerializeAndDeserializeBst {
    private static final String splinter = ",";
    private static final String NN = "#";

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(4);

        String str = serialize(treeNode);
        System.out.println(str);


       TreeNode treeNode1= deserialize(str);

    }

    private static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    private static void buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(NN).append(splinter);
        } else {
            sb.append(node.val).append(splinter);
            buildString(node.left, sb);
            buildString(node.right, sb);
        }
    }


    private static TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>(Arrays.asList(data.split(splinter)));
        return buildTree(nodes);
    }

    private static TreeNode buildTree(Deque<String> nodes) {
        String val = nodes.remove();
        if (val.equals(NN)) return null;
        else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }
}

class TreeNode {
    int val;
    //左孩子
    TreeNode left;
    //右孩子
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
