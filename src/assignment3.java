import java.io.*;

public class assignment3 
{
	static int n;
	static String ss;
	static File f;
	
	static MyHashTable11<Name,Student> HTable1;
	static MyHashTable22<Name,Student> HTable2;
	
	public static void main(String asdf[]) throws IOException
	{
		n=Integer.parseInt(asdf[0]);
		ss=asdf[1];
		f=new File(asdf[2]);
		
		
		if(ss.equals("DH"))
		{
			HTable1=new MyHashTable11<Name,Student>(n);
			queries1();
		}
		if(ss.equals("SCBST"))
		{
			HTable2=new MyHashTable22<Name,Student>(n);
			queries2();
		}
		
	}
	static void queries1() throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader(f)); 
		String ss;
		while((ss=br.readLine())!=null)
		{
			ss=ss+" ";
			int t=ss.indexOf(' ');
			String st=ss.substring(0,t);
			ss=ss.substring(t+1);
			
			String h[]=new String[5];
			
			Name key;
			Student s;
			int q;
			boolean b;
			String sq;
			
			switch(st)
			{
				case "insert":
					for(int i=0;i<5;i++)
					{
						ss=ss.trim();
						ss=ss+" ";
						int x=ss.indexOf(' ');
						String s1=ss.substring(0,x);
						s1=s1.trim();
						h[i]=s1;
						ss=ss.substring(x+1);
					}
					s=new Student(h[0],h[1],h[2],h[3],h[4]);
					key=new Name(s);
					q=HTable1.insert(key,s);
					if(q!=-1)
						System.out.println(q);
					else
						System.out.println("E");
					break;
				case "update":
					for(int i=0;i<5;i++)
					{
						ss=ss.trim();
						ss=ss+" ";
						int x=ss.indexOf(' ');
						String s1=ss.substring(0,x);
						s1=s1.trim();
						h[i]=s1;
						ss=ss.substring(x+1);
					}
					s=new Student(h[0],h[1],h[2],h[3],h[4]);
					key=new Name(s);
					q=HTable1.update(key,s);
					if(q!=-1)
						System.out.println(q);
					else
						System.out.println("E");
					break;
				case "delete":
					for(int i=0;i<2;i++)
					{
						ss=ss.trim();
						ss=ss+" ";
						int x=ss.indexOf(' ');
						String s1=ss.substring(0,x);
						s1=s1.trim();
						h[i]=s1;
						ss=ss.substring(x+1);
					}
					key=new Name(h[0],h[1]);
					q=HTable1.delete(key);
					if(q!=-1)
						System.out.println(q);
					else
						System.out.println("E");
					break;
				case "contains":
					for(int i=0;i<2;i++)
					{
						ss=ss.trim();
						ss=ss+" ";
						int x=ss.indexOf(' ');
						String s1=ss.substring(0,x);
						s1=s1.trim();
						h[i]=s1;
						ss=ss.substring(x+1);
					}
					key=new Name(h[0],h[1]);
					b=HTable1.contains(key);
					if(b)
						System.out.println("T");
					else
						System.out.println("F");
					break;
				case "get":
					for(int i=0;i<2;i++)
					{
						ss=ss.trim();
						ss=ss+" ";
						int x=ss.indexOf(' ');
						String s1=ss.substring(0,x);
						s1=s1.trim();
						h[i]=s1;
						ss=ss.substring(x+1);
					}
					key=new Name(h[0],h[1]);
					try
					{
						s=HTable1.get(key);
						System.out.println(s.fname()+" "+s.lname()+" "+s.hostel()+" "+s.department()+" "+s.cgpa());
					}
					catch(NotFoundException e)
					{
						System.out.println("E");
					}
					break;
				case "address":
					for(int i=0;i<2;i++)
					{
						ss=ss.trim();
						ss=ss+" ";
						int x=ss.indexOf(' ');
						String s1=ss.substring(0,x);
						s1=s1.trim();
						h[i]=s1;
						ss=ss.substring(x+1);
					}
					key=new Name(h[0],h[1]);
					try
					{
						sq=HTable1.address(key);
						System.out.println(sq);
					}
					catch(NotFoundException e)
					{
						System.out.println("E");
					}
					break;
			}
		}
		br.close();
	}
	static void queries2() throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader(f)); 
		String ss;
		while((ss=br.readLine())!=null)
		{
				ss=ss+" ";
				int t=ss.indexOf(' ');
				String st=ss.substring(0,t);
				ss=ss.substring(t+1);
				
				String h[]=new String[5];
				
				Name key;
				Student s;
				int q;
				boolean b;
				String sq;
				
				switch(st)
				{
					case "insert":
						for(int i=0;i<5;i++)
						{
							ss=ss.trim();
							ss=ss+" ";
							int x=ss.indexOf(' ');
							String s1=ss.substring(0,x);
							s1=s1.trim();
							h[i]=s1;
							ss=ss.substring(x+1);
						}
						s=new Student(h[0],h[1],h[2],h[3],h[4]);
						key=new Name(s);
						q=HTable2.insert(key,s);
						if(q!=-1)
							System.out.println(q);
						else
							System.out.println("E");
						break;
					case "update":
						for(int i=0;i<5;i++)
						{
							ss=ss.trim();
							ss=ss+" ";
							int x=ss.indexOf(' ');
							String s1=ss.substring(0,x);
							s1=s1.trim();
							h[i]=s1;
							ss=ss.substring(x+1);
						}
						s=new Student(h[0],h[1],h[2],h[3],h[4]);
						key=new Name(s);
						q=HTable2.update(key,s);
						if(q!=-1)
							System.out.println(q);
						else
							System.out.println("E");
						break;
					case "delete":
						for(int i=0;i<2;i++)
						{
							ss=ss.trim();
							ss=ss+" ";
							int x=ss.indexOf(' ');
							String s1=ss.substring(0,x);
							s1=s1.trim();
							h[i]=s1;
							ss=ss.substring(x+1);
						}
						key=new Name(h[0],h[1]);
						q=HTable2.delete(key);
						if(q!=-1)
							System.out.println(q);
						else
							System.out.println("E");
						break;
					case "contains":
						for(int i=0;i<2;i++)
						{
							ss=ss.trim();
							ss=ss+" ";
							int x=ss.indexOf(' ');
							String s1=ss.substring(0,x);
							s1=s1.trim();
							h[i]=s1;
							ss=ss.substring(x+1);
						}
						key=new Name(h[0],h[1]);
						b=HTable2.contains(key);
						if(b)
							System.out.println("T");
						else
							System.out.println("F");
						break;
					case "get":
						for(int i=0;i<2;i++)
						{
							ss=ss.trim();
							ss=ss+" ";
							int x=ss.indexOf(' ');
							String s1=ss.substring(0,x);
							s1=s1.trim();
							h[i]=s1;
							ss=ss.substring(x+1);
						}
						key=new Name(h[0],h[1]);
						try
						{
							s=HTable2.get(key);
							System.out.println(s.fname()+" "+s.lname()+" "+s.hostel()+" "+s.department()+" "+s.cgpa());
						}
						catch(NotFoundException e)
						{
							System.out.println("E");
						}
						break;
					case "address":
						for(int i=0;i<2;i++)
						{
							ss=ss.trim();
							ss=ss+" ";
							int x=ss.indexOf(' ');
							String s1=ss.substring(0,x);
							s1=s1.trim();
							h[i]=s1;
							ss=ss.substring(x+1);
						}
						key=new Name(h[0],h[1]);
						try
						{
							sq=HTable2.address(key);
							System.out.println(sq);
						}
						catch(NotFoundException e)
						{
							System.out.println("E");
						}
						break;
				}
			}
		br.close();
	}

}
