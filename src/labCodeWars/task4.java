//package labCodeWars;
//
//public class Solution {
//    static TreeNode arrayToTree(int[] array) {
//        if (array.length == 0) {
//            return null;
//        }
//        TreeNode[] nodes = new TreeNode[array.length];
//        for (int i = 0; i < array.length; i++) {
//            nodes[i] = new TreeNode(array[i]);
//        }
//        for (int i = 0; i < array.length / 2; i++) {
//            nodes[i].left = nodes[2 * i + 1];
//            if (2 * i + 2 < array.length) {
//                nodes[i].right = nodes[2 * i + 2];
//            }
//        }
//        return nodes[0];
//    }
//}
