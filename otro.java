
package Correo;

import javax.swing.JOptionPane;

public class enviar extends corretuco{
	String as, ad,af;
	
	public enviar(){
		super(cor);
		cor = getResult();
	}
public void env(){
	
 	String des,asu,men;
	
	des = JOptionPane.showInputDialog("¿Cual es su destino?");
	if(des.isEmpty())
		des= JOptionPane.showInputDialog("Es obligatorio el destino");
	    des=as;
	asu = JOptionPane.showInputDialog("¿Cual es su asunto?");
	if(asu.isEmpty())
		asu= JOptionPane.showInputDialog("Es recomendable dar el asunto");
	asu = ad;
	men = JOptionPane.showInputDialog("Escriba el mensaje");
	men = af;
	setResult(as);
	setResult(ad);
	setResult(af);
	imprimirResultado();
}
}
