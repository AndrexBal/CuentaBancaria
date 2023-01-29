
package CuentaBancaria;


public class CuentaBancaria {
    
    public static void main(String[] args) {
        
        CuentaBancaria cuenta = new CuentaBancaria("Johan", 2000);
        
        //Mostrar la información de la cuenta 
        System.out.println("Titular: "+cuenta.getTitular());
        System.out.println("saldo: "+cuenta.getSaldo());
        
        //hacemos deposito
        cuenta.depositar(500);
        System.out.println("Su slado es: "+cuenta.getSaldo());
        
        
        //retiros
        if(cuenta.retirar(2000)){
            System.out.println("Retiro exitoso, su saldo actual es: "+cuenta.getSaldo());
            
        }else{
            System.out.println("Fondos insuficiente");
        }
        
    }
    
    
    
    
    ////////////////////////////////////////////////////
    
    
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    
    //Metodo depositar dinero
    public void depositar(double monto){
        saldo += monto;
    }
    
    public boolean retirar(double monto){
        if(saldo >= monto){
            saldo -= monto;
            return true;
            
        }else{
            return false;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    
}
