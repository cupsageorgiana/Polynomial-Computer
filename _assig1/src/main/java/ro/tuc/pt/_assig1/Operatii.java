package ro.tuc.pt._assig1;

import java.util.ArrayList;

public class Operatii {

	ArrayList <Monom> polinom=new ArrayList<Monom>();
	
	public Polinom adunare(Polinom p1, Polinom p2)
	{
		Polinom rezultat=new Polinom();
		
		for (int i=0;i<p1.getPolinom().size();i++)
		{
			boolean x=true;
			for (int j=0;j<p2.getPolinom().size();j++)
			{
				if (p1.getPolinom().get(i).getDegree()==p2.getPolinom().get(j).getDegree())
				{
					rezultat.getPolinom().add(new Monom(p1.getPolinom().get(i).getCoeff()+p2.getPolinom().get(j).getCoeff(),p1.getPolinom().get(i).getDegree()));
					p2.getPolinom().remove(j);
					x=false;
					break;
				}
				if (p1.getPolinom().get(i).getDegree()==p2.getPolinom().get(j).getDegree())
				{
						if(p1.getPolinom().get(i).getCoeff()<0 && p1.getPolinom().get(i).getCoeff()>=0  )
						{
							rezultat.getPolinom().add(new Monom((p2.getPolinom().get(i).getCoeff()-p1.getPolinom().get(j).getCoeff()),p1.getPolinom().get(i).getDegree()));
							p2.getPolinom().remove(j);
						}
						else
							if(p1.getPolinom().get(i).getCoeff()>=0 && p1.getPolinom().get(i).getCoeff()<0 )
						{
								rezultat.getPolinom().add(new Monom((p1.getPolinom().get(i).getCoeff()-p2.getPolinom().get(j).getCoeff()),p1.getPolinom().get(i).getDegree()));
								p2.getPolinom().remove(j);
						}
							else 
								if(p1.getPolinom().get(i).getCoeff()<0 && p1.getPolinom().get(i).getCoeff()<0 )
								{
						     	rezultat.getPolinom().add(new Monom((p1.getPolinom().get(i).getCoeff()+p2.getPolinom().get(j).getCoeff()),p1.getPolinom().get(i).getDegree()));
								p2.getPolinom().remove(j);
								}
				}
			}
			if (x==true)
			{
				rezultat.polinom.add(p1.getPolinom().get(i));
			}
		}
		for (int i=0;i<p2.getPolinom().size();i++)
		{
			rezultat.getPolinom().add(p2.polinom.get(i));
		}
		rezultat.sortMonom();
		return rezultat;
	}
	
	public Polinom scadere(Polinom p1, Polinom p2)
	{
		Polinom rezultat=new Polinom();
		
		for (int i=0;i<p1.getPolinom().size();i++)
		{
			boolean x=true;
			for (int j=0;j<p2.getPolinom().size();j++)
			{
				if (p1.getPolinom().get(i).getDegree()==p2.getPolinom().get(j).getDegree())
				{
					rezultat.getPolinom().add(new Monom(p1.getPolinom().get(i).getCoeff()-p2.getPolinom().get(j).getCoeff(),p1.getPolinom().get(i).getDegree()));
					p2.getPolinom().remove(j);
					x=false;
					break;
				}
			}
			if (x==true)
			{
				rezultat.polinom.add(p1.getPolinom().get(i));
			}
		}
		for (int i=0;i<p2.getPolinom().size();i++)
		{
			float coef_neg=(-1)*p2.polinom.get(i).getCoeff();
			int degree=p2.polinom.get(i).getDegree();
			rezultat.polinom.add(p2.polinom.get(i).getMonom(coef_neg,degree));		
		}
		rezultat.sortMonom();
		return rezultat;
	}
		
	public Polinom inmultire(Polinom p1, Polinom p2)
	{
		Polinom rezultat=new Polinom();
		for (Monom i:p1.getPolinom())
		{
			for(Monom j:p2.getPolinom())
			{
				rezultat.polinom.add(new Monom(i.getCoeff()*j.getCoeff(),i.getDegree()+j.getDegree()));
				rezultat.sortMonom();
			}
		}
		return rezultat;
	}
	
	public Polinom impartire(Polinom p1, Polinom p2)
	{
		Polinom cat=new Polinom();
		Polinom rest=new Polinom();
		Polinom aux=new Polinom();
		int i=0;
		
		if (p1.getMaxDegree() <p2.getMaxDegree())
		{
			if (cat.getPolinom().isEmpty())
			{
				cat.addMonom(new Monom(0,0));
			}
		}
		else 
		{
			while (p1.getMaxDegree() >p2.getMaxDegree() && i<1)
			{
				for (Monom m:p1.getPolinom())
				{
					aux.addMonom(new Monom(m.getCoeff(),m.getDegree()));
				}
				int cat_degree=aux.getMaxDegree()-p2.getMaxDegree();
				float cat_coeff=aux.getCoef(aux.getMaxDegree())/p2.getCoef(p2.getMaxDegree());
				cat.addMonom(new Monom(cat_coeff, cat_degree));
				for (Monom m:p2.getPolinom())
				{
					int degree=m.getDegree()+cat_degree;
					float coef=m.getCoeff()*cat_coeff;
					if (aux.getCoef(degree)==coef)
					{
						aux.getPolinom().remove(0);
					}
					else
					{
						aux.addMonom(new Monom(-coef, degree));
					}
				}
				p1.getPolinom().clear();
				for (Monom m:aux.getPolinom())
				{
					p1.addMonom(new Monom(m.getCoeff(),m.getDegree()));
					rest.addMonom(new Monom(m.getCoeff(),m.getDegree()));
				}
				i++;
			}
		}
		return cat;	
	}
	
	public Polinom derivare(Polinom p1)
	{
		Polinom rezultat=new Polinom();
		for (Monom i:p1.getPolinom())
		{
			rezultat.polinom.add(new Monom(i.getCoeff()*i.getDegree(),i.getDegree()-1));
			rezultat.sortMonom();
		}
		return rezultat;
	}
	
	public Polinom integrare(Polinom p1)
	{
		Polinom rezultat=new Polinom();
		for (Monom i:p1.getPolinom())
		{
			rezultat.polinom.add(new Monom(i.getCoeff()/(i.getDegree()+1),i.getDegree()+1));
			rezultat.sortMonom();
		}
		return rezultat;
	}
}
