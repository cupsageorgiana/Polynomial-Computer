package ro.tuc.pt._assig1;

public class Monom {


	float coeff;
	int degree;
	
	public Monom()
	{
	}
	public Monom(float coeff, int degree)
	{
		this.coeff=coeff;
		this.degree=degree;
	}
	public void setCoeff(float coeff)
	{
		this.coeff=coeff;
	}
	public Float getCoeff()
	{
		return coeff;
	}
	public void setDegree(int degree)
	{
		this.degree=degree;
	}
	public int getDegree()
	{
		return degree;
	}
	public Monom getMonom(float coeff, int degree)
	{
		Monom m=new Monom();
		m.coeff=coeff;
		m.degree=degree;
		return m;
	}
}
