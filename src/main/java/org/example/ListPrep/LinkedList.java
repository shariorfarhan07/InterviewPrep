package org.example.ListPrep;


public class LinkedList{
    public Node head;


    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */
    public LinkedList(Object [] a){
           for(int i=a.length-1; i>=0; i--){
               head=new Node(a[i],head);
           }
        }


    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public LinkedList(Node h){
        head=h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode(){
     Node n=head;
     int count=0;
     while(n!=null){
         n=n.next;
         count++;
     }
     return count;
    }

    /* prints the elements in the list */
    public void printList(){
    Node tail=head;
    while(tail!=null){
        System.out.print(tail.val);
        tail=tail.next;
        if(tail!=null){
            System.out.print(",");
        }else {
            System.out.println('.');
        }
    }
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        int i =0;
        Node n=head;
        while(i<idx){
            i++;
            n=n.next;
            if(n==null){
                return null;
            }
        }
        return n;
    }


    // returns the element of the Node at the given index. For invalid idx return null.
    public Object get(int idx){
        Node ref=nodeAt(idx);
        if(ref==null){ return null;}
        return ref.val;
    }



    /* updates the element of the Node at the given index.
     * Returns the old element that was replaced. For invalid index return null.
     * parameter: index, new element
     */
    public Object set(int idx, Object elem){
        Node ref=nodeAt(idx);
        if(ref==null){return null;}
        Object old=ref.val;
        ref.val=elem;
        return old;
    }


    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
       Node n=head;
       int index=0;
       while(n!=null){
           if(n.val==elem){
               return index;
           }
           n=n.next;
           index++;
       }
        return -1;
    }

    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(Object elem){
      return indexOf(elem)!=-1;
    }

    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    public Node copyList(){

        return head;
    }

    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList(){
        return head;
    }

    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
       return;
    }


    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
      return null;
    }

    // Rotates the list to the left by 1 position.
    public void rotateLeft(){
       return;

    }

    // Rotates the list to the right by 1 position.
    public void rotateRight(){
       return;
    }

}