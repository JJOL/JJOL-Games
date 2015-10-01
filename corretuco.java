package Correo;

import javax.swing.JOptionPane;

public class corretuco {

	static String cor;
	int op;
	
	public corretuco(String x){
		cor = x;
		op = '\0';
}
	public void opc(){
		op= JOptionPane.showInputDialog("Menu \n1. Enviar \n2.Enviados").charAt(0);
	}
	
	public void enviar(){
		JOptionPane.showMessageDialog(null,  cor);
	}
	public void imprimirResultado(){
		JOptionPane.showMessageDialog(null,  cor);
	}
	
	public void operaciones(){

		do {
			opc();
			switch(op){
			
			case '1':
	enviar e = new enviar();
	e.env();
	break;
			case '2':
				
			}
			}while (op!=3);
	
		
	}
	public String getResult(){
		return cor;
	}
	public void setResult(String cor){
		this.cor= cor;
	}
}
