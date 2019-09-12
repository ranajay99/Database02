
public class Pair<A,B> //implements Comparable<Pair<A,B>>
{
	private A ff;
	private B ll;
	Pair(A ff,B ll)
	{
		this.ff=ff;
		this.ll=ll;
	}
	A first()
	{
		return ff;
	}
	B last()
	{
		return ll;
	}
	void setA(A data)
	{
		ff=data;
	}
	void setB(B data)
	{
		ll=data;
	}
	public String toString()
	{
		return ff.toString()+ll.toString();
	}
}