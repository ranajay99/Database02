Hashtable of size n

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

Personal findings:
the following test cases was run for different program configurations:
(250 lines)
insert Sarthak Tiwari xyz xyz xyz
insert Mohan Tiwari xyz xyz xyz
insert Abhishek Gupta xyz xyz xyz
insert Rahul Kumar xyz xyz xyz
insert Ram Gupta xyz xyz xyz
insert Aman Singh xyz xyz xyz
insert Mohan Gupta xyz xyz xyz
insert Aman Bansal xyz xyz xyz
insert Aman Sharma xyz xyz xyz
insert Aman Tiwari xyz xyz xyz
insert Sarthak Gupta xyz xyz xyz
insert Abhishek Sharma xyz xyz xyz
insert Mohan Bansal xyz xyz xyz
insert Shyam Bansal xyz xyz xyz
insert Shyam Tiwari xyz xyz xyz
insert Rahul Gupta xyz xyz xyz
insert Aman Gupta xyz xyz xyz
insert Mohan Sharma xyz xyz xyz
insert Abhishek Singh xyz xyz xyz
insert Rahul Singh xyz xyz xyz
insert Abhishek Kumar xyz xyz xyz
insert Ram Sharma xyz xyz xyz
insert Shyam Singh xyz xyz xyz
insert Ram Bansal xyz xyz xyz
insert Ram Singh xyz xyz xyz
insert Rahul Tiwari xyz xyz xyz
insert Ram Tiwari xyz xyz xyz
insert Shyam Agrawal xyz xyz xyz
insert Rahul Bansal xyz xyz xyz
insert Abhishek Bansal xyz xyz xyz
insert Mohan Agrawal xyz xyz xyz
insert Rahul Agrawal xyz xyz xyz
insert Abhishek Agrawal xyz xyz xyz
insert Sarthak Bansal xyz xyz xyz
insert Sarthak Sharma xyz xyz xyz
insert Shyam Gupta xyz xyz xyz
insert Shyam Sharma xyz xyz xyz
insert Mohan Singh xyz xyz xyz
insert Sarthak Kumar xyz xyz xyz
insert Mohan Kumar xyz xyz xyz
insert Shyam Kumar xyz xyz xyz
insert Sarthak Singh xyz xyz xyz
insert Rahul Sharma xyz xyz xyz
insert Aman Kumar xyz xyz xyz
insert Ram Kumar xyz xyz xyz
insert Ram Agrawal xyz xyz xyz
insert Abhishek Tiwari xyz xyz xyz
insert Aman Agrawal xyz xyz xyz
get Mohan Kumar
delete Rahul Singh
delete Rahul Bansal
address Mohan Agrawal
contains Abhishek Bansal
get Abhishek Sharma
delete Rahul Bansal
contains Sarthak Bansal
contains Ram Tiwari
contains Sarthak Singh
delete Sarthak Singh
contains Rahul Bansal
contains Shyam Kumar
get Mohan Sharma
update Sarthak Sharma xyz xyz xyz
update Aman Gupta xyz xyz xyz
address Rahul Kumar
address Ram Agrawal
get Shyam Kumar
get Shyam Kumar
address Ram Kumar
get Shyam Bansal
contains Sarthak Bansal
delete Aman Gupta
delete Shyam Tiwari
update Rahul Agrawal xyz xyz xyz
contains Ram Tiwari
contains Shyam Gupta
contains Aman Gupta
contains Mohan Sharma
get Shyam Sharma
contains Rahul Agrawal
update Aman Tiwari xyz xyz xyz
address Shyam Agrawal
update Abhishek Bansal xyz xyz xyz
address Aman Kumar
get Mohan Gupta
address Sarthak Sharma
update Aman Bansal xyz xyz xyz
contains Aman Gupta
contains Rahul Agrawal
get Ram Agrawal
address Ram Bansal
address Sarthak Bansal
address Aman Sharma
update Sarthak Sharma xyz xyz xyz
delete Rahul Gupta
update Mohan Gupta xyz xyz xyz
address Abhishek Tiwari
contains Rahul Kumar
address Mohan Gupta
contains Abhishek Sharma
delete Sarthak Kumar
address Aman Gupta
get Aman Tiwari
update Sarthak Singh xyz xyz xyz
get Aman Agrawal
address Abhishek Kumar
delete Abhishek Agrawal
address Shyam Agrawal
delete Rahul Kumar
address Sarthak Sharma
address Sarthak Kumar
contains Mohan Bansal
contains Abhishek Singh
delete Aman Sharma
delete Abhishek Singh
update Mohan Kumar xyz xyz xyz
update Aman Agrawal xyz xyz xyz
contains Shyam Singh
get Shyam Agrawal
contains Abhishek Singh
get Mohan Agrawal
delete Rahul Agrawal
delete Sarthak Kumar
delete Abhishek Tiwari
get Aman Gupta
get Ram Agrawal
get Mohan Agrawal
update Mohan Kumar xyz xyz xyz
get Rahul Bansal
update Abhishek Sharma xyz xyz xyz
get Shyam Singh
update Aman Singh xyz xyz xyz
contains Sarthak Kumar
update Mohan Sharma xyz xyz xyz
delete Mohan Sharma
address Ram Kumar
address Mohan Singh
address Abhishek Kumar
contains Abhishek Sharma
contains Mohan Sharma
contains Sarthak Tiwari
contains Ram Singh
delete Aman Bansal
delete Sarthak Tiwari
contains Shyam Tiwari
update Shyam Gupta xyz xyz xyz
update Sarthak Kumar xyz xyz xyz
address Sarthak Sharma
delete Aman Gupta
address Rahul Tiwari
address Ram Agrawal
contains Mohan Tiwari
address Shyam Tiwari
delete Abhishek Singh
contains Rahul Gupta
contains Sarthak Singh
update Abhishek Sharma xyz xyz xyz
contains Mohan Kumar
contains Rahul Gupta
get Mohan Singh
update Aman Kumar xyz xyz xyz
get Abhishek Singh
contains Shyam Singh
get Ram Gupta
contains Abhishek Singh
address Aman Bansal
delete Aman Kumar
update Aman Gupta xyz xyz xyz
address Aman Agrawal
update Shyam Singh xyz xyz xyz
contains Sarthak Kumar
address Ram Tiwari
address Abhishek Agrawal
address Aman Singh
address Aman Gupta
get Abhishek Tiwari
get Mohan Sharma
delete Ram Agrawal
get Shyam Sharma
contains Shyam Sharma
delete Sarthak Gupta
delete Mohan Tiwari
update Rahul Kumar xyz xyz xyz
delete Aman Gupta
update Abhishek Agrawal xyz xyz xyz
address Shyam Agrawal
contains Rahul Tiwari
get Shyam Sharma
get Ram Agrawal
update Sarthak Bansal xyz xyz xyz
delete Rahul Gupta
update Shyam Sharma xyz xyz xyz
delete Sarthak Bansal
address Aman Sharma
get Mohan Sharma
get Shyam Agrawal
address Sarthak Sharma
delete Mohan Agrawal
update Shyam Gupta xyz xyz xyz
delete Sarthak Gupta
contains Rahul Kumar
delete Abhishek Bansal
get Abhishek Sharma
address Aman Agrawal
update Ram Bansal xyz xyz xyz
address Abhishek Kumar
contains Aman Singh
get Mohan Tiwari
contains Sarthak Kumar
address Ram Gupta
address Sarthak Tiwari
address Abhishek Bansal
delete Sarthak Gupta
address Shyam Agrawal
delete Abhishek Agrawal
delete Ram Sharma
address Ram Agrawal
update Shyam Sharma xyz xyz xyz
get Aman Kumar
get Ram Tiwari
update Rahul Tiwari xyz xyz xyz
contains Mohan Bansal
get Abhishek Kumar
delete Sarthak Sharma
update Mohan Kumar xyz xyz xyz
address Abhishek Singh
delete Shyam Gupta
contains Sarthak Gupta
address Ram Singh
contains Abhishek Bansal
contains Sarthak Tiwari
get Ram Tiwari
get Sarthak Sharma
get Shyam Bansal
contains Ram Singh
address Rahul Kumar
update Ram Sharma xyz xyz xyz
update Sarthak Kumar xyz xyz xyz
get Mohan Kumar
address Rahul Sharma
delete Shyam Agrawal
contains Aman Kumar
address Rahul Tiwari
delete Shyam Bansal
address Aman Kumar
contains Abhishek Gupta
contains Rahul Singh
get Rahul Bansal
1) 70 DH :
2) 140 DH :
max insert 50
time of execution of 1) comes roughly the same as 2)
3) 32 SCBST :
4) 1 SCBST :
For 3) the time taken is lesser than for 4)
