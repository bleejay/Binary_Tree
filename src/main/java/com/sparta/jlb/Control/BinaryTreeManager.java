package com.sparta.jlb.Control;

import com.sparta.jlb.BinaryTree.BinaryTreeImpl;

public class BinaryTreeManager {

    public void run(){

        int[] input = {15,7,8,11,21,3,1};

        BinaryTreeImpl binaryTree = new BinaryTreeImpl(12);
        binaryTree.addElements(input);
        try {
            binaryTree.getRightChild(7);
        } catch (ChildNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            binaryTree.getLeftChild(15);
        } catch (ChildNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
