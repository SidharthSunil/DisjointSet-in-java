# DisjointSet-in-java

Codes for implementing disjoint set in java

The java files for the codes given below are uploaded in this repository

# DSNode.java

public class DSNode {
	int label;
	DSNode parent;
	DSNode(int l){
		label = l;
	}
	public DSNode getroot() {
		if(this.parent==null)
			return this;
		else
			return this.parent.getroot();
	}
}

# DisjointSet.java

public class DisjointSet {
  
  DSNode[] node;
	int size;
	
  DisjointSet(int n) {
		size = n;
		node = new DSNode[n];
	}
	
	public void makeset(int a) {
		node[a] = new DSNode(a);
	}
	
	public DSNode find(int f)
	{
		return node[f].getroot();
	}
	
	public void print() {
		for(int i=0;i<size;i++)
			System.out.printf("( %d , %d)",i,find(i).label);
		System.out.println();
	}
	
	public void union(int a, int b) {
		DSNode ra = find(a);
		DSNode rb = find(b);
		if(ra!=rb)
			rb.parent = ra;
	}
	
}

# DSTest.java (Driver class)

public class DSTest {

	public static void main(String[] args) {
		DisjointSet ds = new DisjointSet(5);
		for(int i=0;i<5;i++)
			ds.makeset(i);
		ds.print();                           //prints: ( 0 , 0)( 1 , 1)( 2 , 2)( 3 , 3)( 4 , 4)
		ds.union(0, 2);
		ds.print();                           //prints: ( 0 , 0)( 1 , 1)( 2 , 0)( 3 , 3)( 4 , 4)
		ds.union(4, 2);		
		ds.print();                           //prints: ( 0 , 4)( 1 , 1)( 2 , 4)( 3 , 3)( 4 , 4)
		ds.union(2, 1);
		ds.print();                           //prints: ( 0 , 4)( 1 , 4)( 2 , 4)( 3 , 3)( 4 , 4)
		ds.union(0, 3);
		ds.print();                           //prints: ( 0 , 4)( 1 , 4)( 2 , 4)( 3 , 4)( 4 , 4)
		ds.union(4, 3);
		ds.print();                           //prints: ( 0 , 4)( 1 , 4)( 2 , 4)( 3 , 4)( 4 , 4)
	}

}
