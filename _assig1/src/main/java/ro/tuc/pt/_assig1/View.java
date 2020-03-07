package ro.tuc.pt._assig1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View extends JFrame {
	
	  private static final long serialVersionUID = 1L;
	  private JTextField polinom1=new JTextField(50);
	  private JTextField polinom2=new JTextField(50);
	  private JTextField rezultat=new JTextField(50);
	  private JButton adunareBtn=new JButton("Adunare");
	  private JButton scadereBtn=new JButton("Scadere");
	  private JButton inmultireBtn=new JButton("Inmultire");
	  private JButton impartireBtn=new JButton("Impartire");
	  private JButton derivareBtn=new JButton("Derivare");
	  private JButton integrareBtn=new JButton("Integrare");
	  private JButton stergereBtn=new JButton("Stergere");
	  
	public View()
	{
	   JPanel p1=new JPanel();
	   p1.setLayout(new FlowLayout());
	   p1.add(new JLabel("Polinom 1:"));
	   p1.add(polinom1);
	  
	    JPanel p2=new JPanel();
	    p2.setLayout(new FlowLayout());
	    p2.add(new JLabel("Polinom 2:"));
	    p2.add(polinom2);
	  
	    JPanel op = new JPanel();
        op.setLayout(new FlowLayout());
        op.add(adunareBtn);
        op.add(scadereBtn);
        op.add(inmultireBtn);
        op.add(impartireBtn);
        op.add(derivareBtn);
        op.add(integrareBtn);
        op.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        JPanel r1 = new JPanel();
        r1.setLayout(new FlowLayout());
        r1.add(new JLabel("Rezultat: "));
        r1.add(rezultat);
        r1.add(stergereBtn);
       
        final JPanel pf=new JPanel();
        pf.setLayout(new BoxLayout(pf,BoxLayout.Y_AXIS));
        pf.add(p1);
        pf.add(p2);
        pf.add(op);
        pf.add(r1);
        this.setContentPane(pf);
        this.pack();
        this.setTitle("Calculator Polinoame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,400);
        rezultat.setEditable(false);
	}
       
	public void clear() 
	{
		polinom1.setText("");
		polinom2.setText("");
		rezultat.setText("");
	}
	public void initialiseResult()
	{
		rezultat.setText("");
	}
	public void showResult(String rez)
	{
		rezultat.setText(rez);
	}
	public String getP1()
	{
		return polinom1.getText();
	}
	public String getP2()
	{
		return polinom2.getText();
	}
	
	public void addClearListener(ActionListener clear)
	{
		stergereBtn.addActionListener(clear);
	}
	public void addAdunareListener(ActionListener adunare)
	{
		adunareBtn.addActionListener(adunare);
	}
	public void addScadereListener(ActionListener scadere)
	{
		scadereBtn.addActionListener(scadere);
	}
	public void addInmultireListener(ActionListener inmultire)
	{
		inmultireBtn.addActionListener(inmultire);
	}
	public void addImpartireListener(ActionListener inmpartire)
	{
		impartireBtn.addActionListener(inmpartire);
	}
	public void addDerivareListener(ActionListener derivare)
	{
		derivareBtn.addActionListener(derivare);
	}
	public void addIntegrareListener(ActionListener integrare)
	{
		integrareBtn.addActionListener(integrare);
	}
}

