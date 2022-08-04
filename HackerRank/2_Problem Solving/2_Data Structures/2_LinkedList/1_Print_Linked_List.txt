import java.io.*;
import java.util.*;

public class Solution {
    static class LinkedList{
        static Node root;
        static class Node{
            int value;
            Node next;
            Node(int data){
                value = data;
                next = null;
            }
        }
        static void insert(int data){
            /*
            1. Allocate new node with data
            2. check if head is null
            3. make last node and traverse to end 
            4. make last.next = new element node
            */
            Node newElement = new Node(data);
            if(root == null){
                root = new Node(data);
                return;
            }else{
            Node last = root;
            while(last.next != null){
                last = last.next;
            }
            last.next = newElement;
            return;
            }
        }
        
        static void display(){
            if(root == null){
                return;
            }
            Node temp = root;
            while(temp != null){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            ll.insert(sc.nextInt());
        }
        ll.display();
    }
}