package com.felipebrandao.bytebank.herdado.conta;
public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
