
public class DisjointSet {
	DSNode[] node;
	int size;
	DisjointSet(int n){
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
