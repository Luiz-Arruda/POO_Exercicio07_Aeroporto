package controller;

import javax.swing.JOptionPane;

public class Aeronave extends Pessoa {
	
	String prefixo;
	String fabricante;
	String modelo;
	String codigoNome;
	String codigoVoo;
	String dataVoo;

	Aeroporto aero = new Aeroporto(codigoNome, codigoVoo, dataVoo);

	
	public Aeronave(String cPF, String nome, String endereco, String codigoNome, String codigoVoo, String dataVoo) {
		super(cPF, nome, endereco);
		this.codigoNome = codigoNome;
		this.codigoVoo = codigoVoo;
		this.dataVoo = dataVoo;
	}

	public void decolar() {
		prefixo = JOptionPane.showInputDialog("Aeronave do voo: "+codigoVoo+" ,informe o Prefixo da Aeronave:  ");
		fabricante = JOptionPane.showInputDialog("Aeronave de Prefixo: "+prefixo+" ,informe o fabricante :  " );
		modelo = JOptionPane.showInputDialog("Aeronave de Prefixo: "+prefixo+ " e Fabricante " +fabricante + " ;informe o modelo : ");
		System.out.printf("%n Voo: %s Data Voo: %s Piloto %s CPF: %s Prefixo: %s Fabricante: %n Modelo: %s Voo: CONFIRMADO ",
					this.codigoVoo, this.dataVoo, nome, CPF, prefixo, fabricante, modelo);
	}
}
