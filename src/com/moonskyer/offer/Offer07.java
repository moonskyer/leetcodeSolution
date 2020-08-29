package com.moonskyer.offer;

import com.moonskyer.common.TreeNode;

public class Offer07 {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public static TreeNode build(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
        if (ps > pe) {
            return null;
        }
        int rootVal = preorder[ps];
        int rootIndex = is;
        while (inorder[rootIndex] != rootVal) {
            rootIndex++;
        }
        //找到了中序的root节点
        int leftCount = rootIndex - is;
        TreeNode root = new TreeNode(rootVal);
        root.left = build(preorder, ps + 1, ps + leftCount, inorder, is, rootIndex - 1);
        root.right = build(preorder, ps + leftCount + 1, pe, inorder, rootIndex + 1, ie);
        return root;
    }
}
