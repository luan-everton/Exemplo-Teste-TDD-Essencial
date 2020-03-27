package com.gft.desconto;

public class CalculadoraDescontoTerceoraFaixa extends CalculadoraFaixaDesconto {
	

	public CalculadoraDescontoTerceoraFaixa(CalculadoraFaixaDesconto proximo) {
		super(proximo);
	}

	@Override
	protected double calcular(double valorTotal) {
		 if (valorTotal > 1000) {
		return 	 valorTotal * 0.08;
			}
			
		return -1;
	}

}
