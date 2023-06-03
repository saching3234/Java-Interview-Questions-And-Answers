package interviewquestionsandanswers;

import java.util.List;
import java.util.Vector;

public class CustomLinkedList {
 //create the member who can hold the list
  Node head=null;

   //CREATING THE STATIC CLASS NOR LIST NODE STRUCTURE
    static class Node{
    	String data;
    	Node next; 	
    }
	
	
	//method for creating the list
	void insertInList(String data) {
		//create the node
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		//if list is empty
		if(head==null) {
			head=node;
		}
		else {
			Node temp=head;
			while (temp.next!=null) 
				temp=temp.next;
			
			temp.next=node;
		}
	}
	
	//method for displaying the data
    void display() {
    	Node tempNode=head;
    	while (tempNode!=null) {
			System.out.print(tempNode.data+"-> ");
			tempNode=tempNode.next;
		}
    }
	
	
	 
	 public static void main(String[] args) {
		CustomLinkedList list=new CustomLinkedList();
		List<Integer> list2=new Vector<>();
		
		list.insertInList("sachin");
		list.insertInList("nana");
		list.insertInList("ketan");		
		list.display();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		System.out.println(list2);		
	}	

}
