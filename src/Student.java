
public class Student implements Student_
{ 
	private String f;
	private String l;
	private String h;
	private String dept;
	private String cgpa;
	
	Student(String f,String l,String h,String dept,String cgpa)
	{
		this.f=f;
		this.l=l;
		this.dept=dept;
		this.h=h;
		this.cgpa=cgpa;
	}
   public String fname()
   {
	   return f;
   }
   public String lname()
   {
	   return l;
   }
   public String hostel()
   {
	   return h;
   }
   public String department()
   {
	   return dept;
   }
   public String cgpa()
   {
	   return cgpa;
   }
   
}

class Name extends Pair<String,String> implements Comparable<Name>
{
	Name(Student s)
	{
		super(s.fname(),s.lname());
	}
	Name(String s1,String s2)
	{
		super(s1,s2);
	}
	public int compareTo(Name n)
	{
		String sA1=n.first(),sA2=n.last();
		String sB1=this.first(),sB2=this.last();
		
		if(sA1.equals(sB1))
		{
			if(sA2.equals(sB2))
				return 0;
			else return -1;
		}
			return sB1.compareTo(sA1);
		//return this.toString().compareTo(n.toString());
	}
}