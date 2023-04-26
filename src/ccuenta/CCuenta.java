/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccuenta;

/**
 * Clase para el manejo de cuentas corrientes de una entidad bancaria
 * @author Javier Pérez
 * @version 10/03/2023
 */
public class CCuenta {
    // Propiedades de la Clase Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin argumentos
     */
    public CCuenta (){
    }
    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     * @param nom Indica el nombre del titular de la cuenta
     * @param cue Cadena de números que indica el número de cuenta
     * @param sal Saldo inicial con el que se crea la cuenta
     * @param tipo Dato de tipo double que indica el tipo de cuenta
     */
    public CCuenta (String nom, String cue, double sal, double tipo){
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }
     /**
      * Método para ingresar cantidades en la cuenta. Modifica el saldo.
      * Este método va a ser probado con Junit
      * @param cantidad Un valor double que indica la cantidad a ingresar
      * @throws Exception Cuando el valor de cantidad sea menor que cero
      */
    public void ingresar(double cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     * @param cantidad Contiene la cantidad a restar del saldo
     * @throws Exception 
     */
    public void retirar (double cantidad) throws Exception{
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getEstado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /**
     * Método para asignar el nombre del titular de la cuenta
     * @param nom Contiene la cadena de texto con el nombre del titular
     */
    public void setNombre(String nom){
        nombre=nom;
    }
    /**
     * Método que me devuelve el nombre del titular
     * @return Devuelve el nombre del titular de la cuenta
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Método que me devuelve el saldo disponible en cada momento
     * @return Devuelve el saldo actual de la cuenta corriente
     */
     public double getEstado (){
        return getSaldo();
    }
    /**
     * Método que me devuelve el número de cuenta
     * @return Devuelve la cadena de caracteres del número de cuenta
     */
    public String getCuenta (){
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
