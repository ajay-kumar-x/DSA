package graph;

import java.util.*;



public class Main {

	public static void main(String[] args) {
		Graph gr=new Graph();
		gr.addVertex("A");
		gr.addVertex("B");
		gr.addVertex("C");
		gr.addEdge("A", "B");
		gr.addEdge("B", "C");
		gr.addEdge("A", "C");
		gr.print();
		
		gr.removeEdge("A", "C");
		gr.print();
		
		gr.removeVertex("A");
		gr.print();
		
	}

}
