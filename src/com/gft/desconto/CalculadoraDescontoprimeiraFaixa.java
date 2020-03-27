package com.gft.desconto;

public class CalculadoraDescontoprimeiraFaixa extends CalculadoraFaixaDesconto {

	public CalculadoraDescontoprimeiraFaixa(CalculadoraFaixaDesconto proximo) {
		super(proximo);
	}

	@Override
	protected double calcular(double valorTotal) {
		if (valorTotal > 300.0 && valorTotal <= 800) 
			return valorTotal * 0.04;
		
			return -1;
	}
		

 }
