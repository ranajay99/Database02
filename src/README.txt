Description of the assignment

Hashtable (array) of size n

//Double Hashing
...linear probing...
considering n to be prime
In linear probing the max no. of times searching for filled,
deleted, empty cell is of the order O(n) (worst case).
All cells are traversed once as n is prime.
Let max no. of elements present at any time be k(<n). Assuming one collision,
it has (k/n) probability, two collisions (k/n)*(k-1/n-1). Similarly for i collisions
(k/n)*(k-1/n-1)*...*(k-i+1/n-i+1). 
Since the no. of item to be inserted is lesser than the
table size (about 1.5 times max), the load factor becomes alpha=(k/n)=0.67
(constant upper limit) the average time complexity for search, insert and delete 
will be O(1).

//Separate chaining
...using binary search trees...
since same index can be used, element is found in Hashtable in 
O(1) time. In every binary search tree the average time taken for 
inserting, deleting and searching is O(H) where H=height of the tree
Inserting:
root==null insert element
root.key<key insert in left subtree
root.key>key insert in right subtree
Searching:
root==null element does not exist
root.key<key search in left subtree
root.key>key search in right subtree
root.key==key element found
Deleting:
root==null element does not exist
root.key<key search in left subtree
root.key>key search in right subtree
root.key==key element found:
	if left and right child do not exist, root=null
	if left child does not exist(and left one does), root=root.left
	if right child does not exist(and right one does), root=root.right 
	if both child exist, find the least node in the right subtree,
	replace the data and key, delete that node using the same algorithm
Let there be k elements to be inserted. We can assume that insertion is random hence
k/n elements to be inserted in each cell on average and tree operations takes O(H) time.
Average height can be assumed to be log(k/n).
In worst case, all elements get inserted at the same index and height formed H=k-1. 
Hence worst case time complexity of operations will be O(k).
