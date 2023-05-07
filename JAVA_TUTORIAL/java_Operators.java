public class java_Operators {
    public static void main(String[]args){
        /*Operadores de java:
        Los operadores se utilizan para realizar operaciones en variables y valores.
        Se puede utilizar para sumar 2 valores, una variable y un valor, o 2 variables*/
            int suma1=120+50;
            int suma2=suma1+60;
            int suma3=suma1+suma2;
            System.out.println(suma1+"; "+suma2+"; "+suma3);
        /*Java divide a los operadores en los siguientes grupos:
            Aritmeticos:    +,-,*,/, %(Devuelve el resto de una division), ++i(incrementa la variable en 1), --i(decrece la variable en 1);
            Asignamiento:   =, +=(agraga un valor a la variable), -=, *=, /=, %=, ^=(potencia);
            Comparacion:    ==(igual), !=(diferente), >(mayor que), <(menor que), >=(mayor o igual), <=(menor o igual);
            L¢gicos:        && (y), ||(o), !(contrario)
        
        Operadores aritmetico:*/
            int suma=1+5, resto=6%2, x=4;
            x++;
            System.out.println(suma+"; "+resto+"; "+x);
        //Operadores de asignamiento:
            int y=7;
            y +=9;
            System.out.println(y);
        //Operadores de comparacion:
            int a=8, b=14;
            System.out.println(a==b);//imprimira Falso ya que no son iguales
            System.out.println(a>b);//imprimira falso ya que a no es mayhor que b
            System.out.println(a<b);//imprimira verdadero ya que a es menor que b
            System.out.println(a!=b);// imprimira verdadero ya que a es diferente de b
        //Operadores logicos:
            int z=4;
            System.out.println(z==4 && z>1);//Imprimira verdadero ya que z es igual a 4 y mayor que 1
            System.out.println(z==9 || z<0);//Imprimira falso ya que z no es igual a 9 o no es menor que 0

    }
}
