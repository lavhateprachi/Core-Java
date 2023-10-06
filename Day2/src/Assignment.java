public class Assignment
{
	public static void main (String[] args)
	{
		Tank t1=new Tank (10);
		Tank t2= new Tank (20);
		System.out.println("1: t1.level:" + t1.getLevel() +", t2.level:" + t2.getLevel());
		
		t1 = t2;
		System.out.println ("2: t1.level: "+ t1.getLevel() + " , t2.level: " + t2.getLevel());
		
		t1.setLevel(27);
		System.out.println("3: t1.level: " + t1.getLevel() + ", t2.level: " + t2.getLevel());
		
		t2.setLevel(t1.getLevel()+10);
		System.out.println ("4: t1.level: " + t1.getLevel() + ", t2.level: " + t2.getLevel());
	}
}


/*

OUTPUT--->

E:\Day2\bin>java Assignment
1: t1.level:10, t2.level:20

2: t1.level: 20 , t2.level: 20

3: t1.level: 27, t2.level: 27

4: t1.level: 37, t2.level: 37

*/
