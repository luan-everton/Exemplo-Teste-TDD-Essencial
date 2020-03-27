package com.gft;

import com.gft.desconto.CalculadoraDescontoSegundaFaixa;
import com.gft.desconto.CalculadoraDescontoTerceoraFaixa;
import com.gft.desconto.CalculadoraDescontoprimeiraFaixa;
import com.gft.desconto.CalculadoraFaixaDesconto;
import com.gft.desconto.SemDesconto;

public class PedidoBuilder {

	private Pedido instancia;

	public PedidoBuilder() {

		CalculadoraFaixaDesconto calculadoraFaixaDesconto = 
				new CalculadoraDescontoTerceoraFaixa(
				    new CalculadoraDescontoSegundaFaixa(
						new CalculadoraDescontoprimeiraFaixa(
							new SemDesconto(null))));
		instancia = new Pedido(calculadoraFaixaDesconto);
	}

	public PedidoBuilder comItem(double valorUnitario, int quantidade) {
		instancia.adionarItem(new ItemPedido("Gerado", valorUnitario, quantidade));

		return this;
	}

	public Pedido construir() {
		return instancia;
	}
}
