package com.educandoweb.curso.entities.enums;

public enum OrdersStatus {

	AGUARDAND_PAGAMENTO(1),
	PAGO(2),
	ENVIADO(3),
	ENTREGUE(4),
	CANCELADO(5);
	
	
	private int code;
	
	private OrdersStatus(int code) {
		this.code = code;
	}
		
	public int getCode() {
		return code;
	}
		
	public static OrdersStatus valueOf(int code) {
		for(OrdersStatus value : OrdersStatus.values()) {
			if(value.code == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("codigo invalido do OrdersStatus");
	}

}
