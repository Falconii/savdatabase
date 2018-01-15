package br.com.brotolegal.savdatabase.regrasdenegocio;

public class ExceptionDeletePedido extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = -7944826251499128429L;

	private final static String mensa = "Falha Na Gravação Do Pedido !!!";

	public ExceptionDeletePedido(){

		super(mensa);

	}


	public ExceptionDeletePedido(String mensage){
		
		super(mensa + " " + mensage);
		
	}

}
