
public class Node<K,T> extends Pair<K,T>
{
	Node<K,T> left;
	Node<K,T> right;
	
	Node(K value1,T value2)
	{
		super(value1,value2);
		left=null;
		right=null;
	}

}
