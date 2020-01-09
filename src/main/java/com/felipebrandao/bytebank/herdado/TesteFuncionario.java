package com.felipebrandao.bytebank.herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		
		
		
		Gerente felipe = new Gerente();
		felipe.setNome("Felipe");
		felipe.setCpf("223355646-9");
		felipe.setSalario(2600.00);

		System.out.println(felipe.getNome());
		System.out.println(felipe.getBonificacao());
		
		//felipe.salario = 300.0;
		
	}

}
