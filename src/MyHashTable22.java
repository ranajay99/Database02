//Separate Chaining
public class MyHashTable22<K extends Comparable<K>,T> implements MyHashTable_<K,T>
{
	private BinarySearchTree<K,T> arr[];
	private int n;
	private NotFoundException e=new NotFoundException();
	
	MyHashTable22(int n)
	{
		this.n=n;
		arr=new BinarySearchTree[n];
		for(int i=0;i<n;i++)
			arr[i]=new BinarySearchTree<K,T>();
	} 
	
	   // Insert new object with given key
	   public int insert(K key,T obj)
	   {
		   int index=(int)Hash.djb2(key.toString(),n);
		   return arr[index].add(key,obj);
	   }
	 
	   // Update object for given key 
	   public int update(K key,T obj)
	   {
		   int index=(int)Hash.djb2(key.toString(),n);
		   return arr[index].update(key,obj);
	   }
	 
	   // Delete object for given key 
	   public int delete(K key)
	   {
		   int index=(int)Hash.djb2(key.toString(),n);
		   return arr[index].delete(key);
	   }
	 
	   // Does an object with this key exist? 
	   public boolean contains(K key)
	   {
		   int index=(int)Hash.djb2(key.toString(),n);
		   return arr[index].search(key);
	   }
	 
	   // Return the object with given key 
	   public T get(K key)  throws NotFoundException
	   {
		   int index=(int)Hash.djb2(key.toString(),n);
		   T s=arr[index].object(key);
		   if(s==null)
			   throw e;
		   return s;
	   }
	 
	   // "Address" of object with given key (explained below) 
	   public String address(K key)  throws NotFoundException
	   {
		   int index=(int)Hash.djb2(key.toString(),n);
		   String st=arr[index].find(key);
		   if(st.equals("E"))
			   throw e;
		   return index+"-"+st;
	   }
}
