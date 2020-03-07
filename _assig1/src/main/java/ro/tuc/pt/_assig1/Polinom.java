package ro.tuc.pt._assig1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Polinom {

	ArrayList <Monom> polinom=new ArrayList<Monom>();
	
	public Polinom() 
	{
	}
	
	public Polinom(ArrayList<Monom> p)
	{
		for(Monom m:p)
		{
			polinom.add(m);
		}
		this.sortMonom();
	}
	
	public void addMonom(Monom m)
	{
		this.polinom.add(m);
	}
	
	public void sortMonom()
	{
		Collections.sort(polinom,new Comparator<Monom>()
				{
			public int compare(Monom o1, Monom o2)
			{
				if (o1.getDegree()>o2.getDegree())
					return 1;
				if (o1.getDegree()== o2.getDegree())
					return 0;
				return -1;
			}
				});
	}
	
	public void listMonom()
	{
		for(Monom i:this.getPolinom())
		{
			System.out.print(i.getCoeff()+"x^"+i.getDegree()+"+");
		}
		System.out.println(" ");
	}
	
	public Polinom regex(String sir)
	{
			Polinom p=new Polinom();
			int semn=0;
			char c=sir.charAt(0);
			if (c=='-')
				semn=1;
			sir=sir.replace("-", "+-");
			String[] m=sir.split("\\+");
			
			String sp="";
			String sc="";
			for(int i=semn;i<m.length;i++)
			{
				char[] s=m[i].toCharArray();
				int cnt=0;
				int neg=0;
				int pos=0;
				for (int j=0;j<s.length;j++)
				{
					if (s[j]=='x')
					{
						cnt=1;
						pos=j;
					}
				}
				if (s[0]=='-')
					neg=1;
				if (cnt==1)
				{
					if (neg==0)
						sc=new String(s,0,pos-1);
					else
						sc=new String(s,1,pos-2);
					if (pos+1==s.length)
						sp=new String ("1");
					else 
						sp=new String (s, pos+2,s.length-pos-2);
				}
				else
				{
					if (neg==0)
						sc=new String(s,0,m[i].length());
					else 
						sc=new String (s,1,m[i].length()-1);
					sp="0";
				}
				float k=Float.parseFloat(sc);
				int j=Integer.parseInt(sp);
				
				if(neg==1)
					p.getPolinom().add(new Monom(-k,j));
				else 
					p.getPolinom().add(new Monom(k,j));
			}
			p.sortMonom();
			return p;
	}
	
	public String toString()
	{
		String aux="";
		String aux2="";
		for (Monom i:polinom)
		{
			String c=Float.toString(i.getCoeff());
			String p=Integer.toString(i.getDegree());
			if(Float.compare(i.getCoeff(), 0)==0)
				aux="0";
			if(Float.compare(i.getCoeff(), 0)!= 0)
			{
				if (Integer.compare(i.getDegree(),0)==0)
					aux=" +"+c;
				else
					aux=" +"+c+"*x^"+p;
			}
			aux2+=aux;
			aux2=aux2.replace("+-","-");
			aux2=aux2.replace("-+", "-");
			
		}
		return aux2;
	}
		
	public void setPolinom(ArrayList<Monom> polinom)
	{
		this.polinom=polinom;
	}
	public ArrayList<Monom> getPolinom()
	{
		return polinom;
	}	
	public int getMaxDegree()
	{
		int max=0;
		for (Monom i:polinom)
		{
			if (max<=i.getDegree())
				max=i.getDegree();
		}
		return max;
	}
	public float getCoef(int degree)
	{
		for (Monom i:polinom)
		{
			if (i.getDegree()==degree)
				return i.getCoeff();
		}
		return 0;
	}
}
