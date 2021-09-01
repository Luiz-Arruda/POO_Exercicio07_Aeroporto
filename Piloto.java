package controller;

import javax.swing.JOptionPane;

public class Piloto extends Pessoa {
	
	int registroPiloto;
	String ciaAerea;
	String escalaVoo;	
	String codigoNome;
	String codigoVoo;
	String dataVoo;

	public Piloto(String cPF, String nome, String endereco, String codigoNome, String codigoVoo, String dataVoo) {
		super(cPF, nome, endereco);
		this.codigoNome = codigoNome;
		this.codigoVoo = codigoVoo;
		this.dataVoo = dataVoo;
		
	}
	Aeroporto aero = new Aeroporto(codigoNome, codigoVoo, dataVoo);
	
	public void EscalaVoo() {
		registroPiloto = Integer.parseInt(JOptionPane.showInputDialog("Piloto: "+ nome+ " ,informe o numero do seu registro de piloto:  "));
		ciaAerea = JOptionPane.showInputDialog("Piloto: "+ nome+ " ,informe a sua CIA Aerea: ");
		escalaVoo = JOptionPane.showInputDialog("Piloto: " + nome+ ", confirmar a sua escala (Sim ou Nao): , Registro: " + registroPiloto +" Voo: " + this.codigoVoo + " Data: " + this.dataVoo);
		if (escalaVoo.equalsIgnoreCase("sim")){
		System.out.printf("%n Voo: %s Nome: %s Registro: %s Cia Aerea: %s Data Voo: %s %n Escala: CONFIRMADA ",
				this.codigoVoo, nome, registroPiloto, ciaAerea, this.dataVoo);
		} else {
			System.out.printf("%n Voo: %s Nome: %s Registro: %s Cia Aerea: %s Data Voo: %s %n Escala: NAO CONFIRMADA ",
					this.codigoVoo, nome, registroPiloto, ciaAerea, this.dataVoo);
		}
	}


}
