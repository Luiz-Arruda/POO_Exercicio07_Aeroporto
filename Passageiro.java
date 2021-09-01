package controller;

import javax.swing.JOptionPane;

public class Passageiro extends Pessoa{
	
	int numPassagem;
	String numAssento;
	int qtdeBagagem;
	String codigoNome;
	String codigoVoo;
	String dataVoo;

	Aeroporto aero = new Aeroporto(codigoNome, codigoVoo, dataVoo);

	public Passageiro(String cPF, String nome, String endereco, String codigoNome, String codigoVoo, String dataVoo) {
		super(cPF, nome, endereco);
		this.codigoNome = codigoNome;
		this.codigoVoo = codigoVoo;
		this.dataVoo = dataVoo;
	}

	public void ReservaVoo() {
		numPassagem = Integer.parseInt(JOptionPane.showInputDialog("Passageiro:"+ nome + " ,informe o numero da passagem:  "));
		numAssento = JOptionPane.showInputDialog("Passageiro: "+ nome +" ,informe o numero do assento(numero + letra) no voo :  " + this.codigoVoo );
		qtdeBagagem = Integer.parseInt(JOptionPane.showInputDialog("Passageiro: "+ nome+ " ,informe a quantidade de bagagem:  "));
		System.out.printf("%n Voo: %s Nome: %s Data Voo: %s Numero Passagem %s Assento: %s Qdte Bagagem: %s %n Reserva: CONFIRMADA ",
				this.codigoVoo, nome, this.dataVoo, numPassagem, numAssento, qtdeBagagem);
	}
}
