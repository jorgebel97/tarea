package cuentas;

/**
 * Clase que representa a una cuenta
 * @author Jorge
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor por defecto de la clase CCuenta.
     */

    public CCuenta()
    {
    }
    
    /**
     * Constructor con parámetros para la clase CCuenta.
     * 
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés asociado a la cuenta.
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Devuelve el estado de la cuenta
     * @return saldo de la cuenta
     */

    public double estado()
    {
        return saldo;
    }
    
    /**
     * Ingresa una cantidad en la cuenta
     * @param cantidad cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Retira una cantidad en la cuenta
     * @param cantidad cantidad a retirar
     * @throws Exception si la cantidad es igual a 0 o negativa
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular de la cuenta.
     */

	public String getNombre() {
		return nombre;
	}
	
	 /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre El nuevo nombre del titular de la cuenta.
     */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
     * Obtiene el número de cuenta.
     * 
     * @return El número de cuenta.
     */

	public String getCuenta() {
		return cuenta;
	}
	
	/**
     * Establece el número de cuenta.
     * 
     * @param cuenta El nuevo número de cuenta.
     */

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo actual de la cuenta.
     */

	public double getSaldo() {
		return saldo;
	}
	
	/**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo El nuevo saldo de la cuenta.
     */

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
     * Obtiene el tipo de interés asociado a la cuenta.
     * 
     * @return El tipo de interés asociado a la cuenta.
     */

	public double getTipoInterés() {
		return tipoInterés;
	}
	
	 /**
     * Establece el tipo de interés asociado a la cuenta.
     * 
     * @param tipoInterés El nuevo tipo de interés asociado a la cuenta.
     */

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}


