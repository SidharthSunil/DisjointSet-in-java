
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
