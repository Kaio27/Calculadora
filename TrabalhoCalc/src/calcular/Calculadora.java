
package calcular;

/**
 *
 * @author GARCIA
 */
public class Calculadora {
    double x;
    double y;
    
    public Calculadora(){
      x = 0;
      y = 0;
    
    }
    public double somar(double x, double y){
        
        return x + y;
    }
    
    public  double subtrair(double x, double y){
        return x - y;
    }
    
    public  double multiplicar(double x, double y){
        return x * y;
    }
    
    public  double  dividir(double x, double  y){
        if(y == 0){
            return -1D;
        }else{
            return x / y;
        }
        
    }
    
}
