/*Codigo creado por Elfego Adair Juárez Arias*/
public class mainFibo {

    public static void main(String[] args) {
        mainFibo objfibo = new mainFibo();
        System.out.println("La sucesion Fibonacci de 12 recursiva es:" + objfibo.fibonacciRecursivo(12));
        System.out.println("La sucesion Fibonacci de 12 mediante ciclo es: " + objfibo.fibonacciCiclo(12));
    }
    
    //Creando el metodo recursivo para fibonacci
    public int fibonacciRecursivo(int n){
        if (n==1 || n==2) {
            //caso base
            return 1;
        }else{
            //dominio (problema -1)
            return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
        }
    }
    
    //Metodo con ciclo para Fibonacci
    public int fibonacciCiclo(int n){
        int fibo = 0, primero = 1, segundo = 0;
        while(n>0){
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            n--;
        }
        //n=4-1=3-1=2-1=1-1=0       fibo=0=1=1=2=3     primero=1=0=1=1=2      segundo=0=1=1=2=3
        return fibo;
    }
}
//Elfego Adair Juárez Arias UAEMEX

