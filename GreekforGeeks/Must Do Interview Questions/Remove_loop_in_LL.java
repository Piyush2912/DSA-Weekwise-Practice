package com.company.GreekforGreeks;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Remove_loop_in_LL {

    class Node
    {
        int data;
        Node next;
    }

    class GFG
    {
        public  Node newNode(int data){
            Node temp = new Node();
            temp.data = data;
            temp.next = null;
            return temp;
        }

        public  void makeLoop(Node head, int x){
            if (x == 0)
                return;
            Node curr = head;
            Node last = head;

            int currentPosition = 1;
            while (currentPosition < x)
            {
                curr = curr.next;
                currentPosition++;
            }

            while (last.next != null)
                last = last.next;
            last.next = curr;
        }

        public  boolean detectLoop(Node head){
            Node hare = head.next;
            Node tortoise = head;
            while( hare != tortoise )
            {
                if(hare==null || hare.next==null) return false;
                hare = hare.next.next;
                tortoise = tortoise.next;
            }
            return true;
        }

        public  int length(Node head){
            int ret=0;
            while(head!=null)
            {
                ret += 1;
                head = head.next;
            }
            return ret;
        }

        public void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t--> 0)
            {
                int n = sc.nextInt();

                int num = sc.nextInt();
                Node head = newNode(num);
                Node tail = head;

                for(int i=0; i<n-1; i++)
                {
                    num = sc.nextInt();
                    tail.next = newNode(num);
                    tail = tail.next;
                }

                int pos = sc.nextInt();
                makeLoop(head, pos);

                solver x = new solver();
                x.removeLoop(head);

                if( detectLoop(head) || length(head)!=n )
                    System.out.println("0");
                else
                    System.out.println("1");
            }
        }
    }
// } Driver Code Ends


    class solver
    {
        public  void removeLoop(Node head){
            // code here
            // remove the loop without losing any nodes
            // Detect loop in linked list(floyd algo / Tortoise and hare algo)
           //It'll detect & remove loop in linked list

            if (head == null){
               return;
           }
           Node slow,fast;
           slow = fast = head;
           while(fast.next != null && fast.next.next != null){
               slow = slow.next;
               fast = fast.next.next;
               if (slow.data == fast.data){
                   break;
               }
           }

           if (slow == fast){
               if (fast == head){
                   while (slow.next != fast){
                       slow = slow.next;
                   }
                   slow.next = null;
               }else {
                   slow = head;
                   while (slow.next != fast.next){
                       slow = slow.next;
                   }
                   fast.next = null;
               }
           }
        }
    }
}
