package br.com.javatagua.sa1.app1;

import javax.swing.JOptionPane;

import br.com.javatagua.sa1.bo.CalculoBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1, valor2;
		JOptionPane.showMessageDialog(null, "Empresa Voe - Grupo Empresarial");
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro avião: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo avião: "));
		
		
		CalculoBO cbo = new CalculoBO();
		
		JOptionPane.showMessageDialog(null, cbo.somar(valor1, valor2));

	}

}
