
public class BinarySearchTree<K extends Comparable<K>,T>
{
	private Node<K,T> ROOT;
	private int count=0;
	private String path="";
	private Node<K,T> index=null;
	
	BinarySearchTree()
	{
		ROOT=null;
	}
	
	void count()
	{
		int temp=count;
		count=0;
		path="";
		index=null;
	}
	int add(K key,T s)/////////////////////////////////////////
	{
		count();
		ROOT=add(ROOT,key,s);
		return count;
	}
	Node<K,T> add(Node<K,T> root,K key,T s)
	{
		if(root==null)//to the appropriate position
		{
			root=new Node<K,T>(key,s);
			count++;
			return root;
		}
			
			int x=root.first().compareTo(key);
			if(x>0)//move to left subtree
			{
				count++;
					root.left=add(root.left,key,s);
			}
			else if(x<0)//move to right subtree
			{
				count++;
					root.right=add(root.right,key,s);
			}
			else//already exists
			{
				count=-1;
				return root;
			}
		return root;
	}
	int delete(K key)////////////////////////////////////////////////
	{
		count();
		ROOT=delete(ROOT,key);
		return count;
	}
	
	Node<K,T> delete(Node<K,T> root, K key)
	{
		if(root==null)//element does not exist
		{
			count=-1;
			return null;
		}
		
		int x=root.first().compareTo(key);
			if(x>0)//move to left subtree
			{
				count++;
				root.left = delete(root.left,key);
			}
			else if(x<0)//move to right subtree
			{
				count++;
				root.right = delete(root.right,key);
			}
			else//found that element
			{
				
				count++;
				if(root.left==null && root.right==null)//no children
				{
					return null;
				}

				else if(root.right==null)//left child exists
				{
					count++;
					return root.left;
				}
				
				else if(root.left==null)//right child exists
				{
					count++;
					return root.right;
				}
				
				else//both children exist
				{
					
					Node<K,T> temp=minright(root.right);
					root.setA(temp.first());
					root.setB(temp.last());
									
					//root=temp;
					//temp=delete(temp,temp.first());
					root.right=delete(root.right,temp.first());
				}
			}
		return root;
	}
	Node<K,T> minright(Node<K,T> root)
	{
		while(root.left!=null)
		{
			//count++;
			root=root.left;
		}
		return root;
	}
	String find(K key)/////////////////////////////////////////////
	{
		count();
		String h="E";
		index=search(ROOT,key);
		if(index!=null)
			h=path;
		return h;
	}
	boolean search(K key)////////////////////////////////////////
	{
		count();
		index=search(ROOT,key);
		if(index==null)
			return false;
		return true;
		
	}
	int update(K key,T data)/////////////////////////////////////
	{
		count();
		index=search(ROOT,key);
		if(index==null)
			return -1;
		else
		{
			index.setB(data);
			return count;
		}
	}
	T object(K key)//////////////////////////////////////////////
	{
		count();
		index=search(ROOT, key);
		
		if(index==null)
			return null;
		else
			return index.last();
	}
	Node<K,T> search(Node<K,T> root, K key)
	{
		if(root==null)//element does not exist
		{
			count=-1;
			return null;
		}
		
		int x=root.first().compareTo(key);
			if(x>0)//move to left subtree
			{
				path=path+"L";
				count++;
				return search(root.left,key);
			}
			else if(x<0)//move to right subtree
			{
				path=path+"R";
				count++;
				return search(root.right,key);
			}
			else//found the element
			{
				count++;
				return root;
			}
	}
	
}


