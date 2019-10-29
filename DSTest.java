
public class DSTest {

	public static void main(String[] args) {
		DisjointSet ds = new DisjointSet(5);
		for(int i=0;i<5;i++)
			ds.makeset(i);
		ds.print();
		ds.union(0, 2);
		ds.print();
		ds.union(4, 2);		
		ds.print();
		ds.union(2, 1);
		ds.print();
		ds.union(0, 3);
		ds.print();
		ds.union(4, 3);
		ds.print();
	}

}
