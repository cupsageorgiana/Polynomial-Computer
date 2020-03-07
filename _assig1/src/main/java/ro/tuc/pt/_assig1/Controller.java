package ro.tuc.pt._assig1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	private Polinom p1=new Polinom();
	private Polinom p2=new Polinom();
	private Polinom rezultat=new Polinom();
	private Operatii op=new Operatii();
	private View interfata;
	
	
	public Controller(View interfata)
	{
		this.interfata=interfata;
		interfata.addAdunareListener(new AdunareListener());
		interfata.addScadereListener(new ScadereListener());
		interfata.addInmultireListener(new InmultireListener());
		interfata.addImpartireListener(new ImpartireListener());
		interfata.addDerivareListener(new DerivareListener());
	    interfata.addIntegrareListener(new IntegrareListener());
		interfata.addClearListener(new ClearListener());
	}
	
	class AdunareListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			String sp1=interfata.getP1();
			String sp2=interfata.getP2();
			interfata.initialiseResult();
			 p1=p1.regex(sp1);
			 p2=p2.regex(sp2);
			 rezultat=op.adunare(p1, p2);
			interfata.showResult(rezultat.toString());
		}
	}
	
	class ScadereListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			String sp1=interfata.getP1();
			String sp2=interfata.getP2();
			interfata.initialiseResult();
			 p1=p1.regex(sp1);
			 p2=p2.regex(sp2);
			 rezultat=op.scadere(p1, p2);
			interfata.showResult(rezultat.toString());
		}
	}
	
	class InmultireListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			String sp1=interfata.getP1();
			String sp2=interfata.getP2();
			interfata.initialiseResult();
			 p1=p1.regex(sp1);
			 p2=p2.regex(sp2);
			 rezultat=op.inmultire(p1, p2);
			interfata.showResult(rezultat.toString());
		}
	}
	
	class ImpartireListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			String sp1=interfata.getP1();
			String sp2=interfata.getP2();
			interfata.initialiseResult();
			 p1=p1.regex(sp1);
			 p2=p2.regex(sp2);
			 rezultat=op.impartire(p1, p2);
			interfata.showResult(rezultat.toString());
		}
	}
	
	class DerivareListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			String sp1=interfata.getP1();
			interfata.initialiseResult();
			 p1=p1.regex(sp1);
			 rezultat=op.derivare(p1);
			interfata.showResult(rezultat.toString());
		}
	}
	
	class IntegrareListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			String sp1=interfata.getP1();
			interfata.initialiseResult();
			 p1=p1.regex(sp1);
			 rezultat=op.integrare(p1);
			interfata.showResult(rezultat.toString());
		}
	}
	
	  class ClearListener implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            interfata.clear();
	        }
	    }	
}

