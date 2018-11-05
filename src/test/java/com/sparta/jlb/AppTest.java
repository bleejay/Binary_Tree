package com.sparta.jlb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.sparta.jlb.BinaryTree.BinaryTree;
import com.sparta.jlb.BinaryTree.BinaryTreeImpl;
import com.sparta.jlb.Control.BinaryTreeManager;
import com.sparta.jlb.Control.ChildNotFoundException;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    private BinaryTree binaryTree;
    int[] elementsToAdd;

    @Before
    public void setup(){
        binaryTree = new BinaryTreeImpl(12);;
        elementsToAdd = new int[]{15, 7, 8, 11, 21, 3, 1};

    }

    @Test
    public void addElement(){
        try{
        binaryTree.addElement(15);
        assertTrue(binaryTree.getRightChild(12) == 15);
        binaryTree.addElement(7);
        assertTrue(binaryTree.getLeftChild(12) == 7);
        binaryTree.addElement(3);
        assertTrue(binaryTree.getLeftChild(7) == 3);
        binaryTree.addElement(21);
        assertTrue(binaryTree.getRightChild(15) == 21);
        }
        catch (ChildNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void addElements(){
        try {
            binaryTree.addElements(elementsToAdd);
            assertTrue(binaryTree.getLeftChild(15) == 7);
            assertTrue(binaryTree.getLeftChild(7) == 3);
            assertTrue(binaryTree.getLeftChild(3) == 1);
            assertTrue(binaryTree.getRightChild(3) == 4);
            assertTrue(binaryTree.getRightChild(7) == 8);
            assertTrue(binaryTree.getRightChild(8) == 11);
            assertTrue(binaryTree.getRightChild(12) == 15);
            assertTrue(binaryTree.getRightChild(15) == 21);
        }
        catch (ChildNotFoundException e) {
            }
    }

    @Test
    public void getRootElements(){
        assertEquals(12,  binaryTree.getRootElement());
    }

    @Test
    public void getNumberOfElements(){
        binaryTree.addElements(elementsToAdd);
        assertEquals(elementsToAdd.length+1, binaryTree.getNumberOfElements());
    }

    @Test
    public void findElement(){

    }
}
