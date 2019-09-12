//Double Hashing
public class MyHashTable11<K extends Comparable<K>,T> implements MyHashTable_<K,T>
{
	private int n;
	private Pair<K,T> arr[];
	private int track[];
	private NotFoundException e=new NotFoundException();
	
	MyHashTable11(int n)
	{
		this.n=n;
		arr=new Pair[n];
		track=new int[n];
	}
	
	   // Insert new object with given key
	   public int insert(K key,T obj)
	   {
	   		if(contains(key))
	   			return -1;
		   int i;
		   String s=key.toString();
		   for(i=0;;i++)
		   {
			   long yy=Hash.djb2(s,n) + i*Hash.sdbm(s,n);
			   yy=yy%n;
			   int y=(int)yy;
			  
			   if(track[y]!=1)
			   {
				   track[y]=1;
				   arr[y]=new Pair<K,T>(key,obj);
				   break;
			   }
		   }
		   return i+1;
	   }
	 
	   // Update object for given key 
	   public int update(K key,T obj)
	   {
	   	   if(contains(key)==false)
	   	   		return -1;
		   int i;
		   String s=key.toString();
		   for(i=0;;i++)
		   {
			   long yy=Hash.djb2(s,n) + i*Hash.sdbm(s,n);
			   yy=yy%n;
			   int y=(int)yy;
			   
			   if(track[y]==0)
				   break;
			   
			   if(track[y]==1)
			   {
				   if(arr[y].first().compareTo(key)==0)
				   {
					   arr[y].setB(obj);
					   break;
				   }
			   }
		   }
		   return i+1;
	   }
	 
	   // Delete object for given key 
	   public int delete(K key)
	   {
		   if(contains(key)==false)
			   return -1;
		   int i;
		   String s=key.toString();
		   for(i=0;;i++)
		   {
			   long yy=Hash.djb2(s,n) + i*Hash.sdbm(s,n);
			   yy=yy%n;
			   int y=(int)yy;
			   
			   if(track[y]==0)
				   break;
			   
			   if(track[y]==1)
			   {
				   if(arr[y].first().compareTo(key)==0)
				   {
					   track[y]=-1;
					   arr[y]=null;
					   break;
				   }
			   }
		   }
		   return i+1;
	   }
	 
	   // Does an object with this key exist? 
	   public boolean contains(K key)
	   {
		   int i;
		   String s=key.toString();
		   for(i=0;i<n;i++)
		   {
			   long yy=Hash.djb2(s,n) + i*Hash.sdbm(s,n);
			   yy=yy%n;
			   int y=(int)yy;
			   
			   if(track[y]==0)
				   break;
			   
			   if(track[y]==1)
			   {
				   if(arr[y].first().compareTo(key)==0)
				   {
					   return true;
				   }
			   }
		   }
		   return false;
	   }
	 
	   // Return the object with given key 
	   public T get(K key) throws NotFoundException
	   {
		   int i;
		   String s=key.toString();
		   for(i=0;i<n;i++)
		   {
			   long yy=Hash.djb2(s,n) + i*Hash.sdbm(s,n);
			   yy=yy%n;
			   int y=(int)yy;
			   
			   if(track[y]==0)
				   break;
			   if(track[y]==1)
			   {
				   if(arr[y].first().compareTo(key)==0)
					   return arr[y].last();
			   }
		   }
		   throw e;
	   }
	 
	   // ”Address” of object with given key (explained below) 
	   public String address(K key) throws NotFoundException
	   {
		   int i;
		   String s=key.toString();
		   for(i=0;i<n;i++)
		   {
			   long yy=Hash.djb2(s,n) + i*Hash.sdbm(s,n);
			   yy=yy%n;
			   int y=(int)yy;
			   
			   if(track[y]==0)
				   break;
			   
			   if(track[y]==1)
			   {
				   if(arr[y].first().compareTo(key)==0)
					   return y+"";
			   }
		   }
		   throw e;
	   }

}
