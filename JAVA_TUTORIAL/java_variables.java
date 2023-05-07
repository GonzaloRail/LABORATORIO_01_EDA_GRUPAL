public class java_variables {
    public static void main(String [] args){
        /*Java Variables
        Las variables son contenedores para almacenar valores de datos
        En Java, existen diferentes tipos de variables, por ejemplo:
        
        String  Almacena texto, como "Hola", estos valores est n entre comillas dobles ""
        int     Almacena enteros (n£meros enteros), sin decimales, como 123 o -123
        float   Almacena n£meros de coma flotante, con decimales, como 19,99 o -19,99
        char    Almacena car cteres individuales, como 'a' o 'B', estos valores est n entre comillas simples ''
        boolean Almacena valores con 2 estados: verdadero o falso.
        
        Declarar y Crear variables
        Para crear una variable debes especificar el tipo y asignarle un valor.
            tipo nombreVariable = valor;
        El s¡mbolo igual es usado para asignar valores a la variable.

        Para crear una variable que deba almacenar texto, observe el siguiente ejemplo:*/
            String name="Jhon";
            System.out.println(name);
        // Para crear una variable que deba almacenar un n£mero, observe el siguiente ejemplo
            int miNumero=15;
            System.out.println(miNumero);
        // Tambi‚n puedes declarar la variable sin asignarle un valor, y asignarle un valor despu‚s:
            int numero;
            numero=12;
            System.out.println(numero);
        //Note que si le asigna un nuevo valor a una variable ya existente, se sobreescribira el valor previo:
            int num=20;
            num=14;//mi n£mero es ahora 14
            System.out.println(num);
        //Si desea que otras personas sobreescriban los valores existentes, use el comando 'final' esto declara la variable como constante.

        /*Imprimir Variables
        El m‚todo 'println()' es com£nmente usado para mostrar variables.
        Para combinar ambos texto y una variable, usa el car cter '+': */
            System.out.println("Hola "+name);
        // Tambi‚n puede usar el car cter '+' para a¤adir una variable a otra variable
            String apellido="Doe";
            String NombreCompleto= name+apellido;
            System.out.println(NombreCompleto);
        // Para valores num‚ricos, el car cter '+' funciona como un operador matem tico:
            int x=5;
            int y=6;
            System.out.println(x+y);
        
        /*Declarar Multiples Variables
        Para declarar m s de una variable del mismo tipo puedes usar una lista separada:
            int x;
            int y;
            int z;
        Pero en lugar de eso puedes realizar la siguiente declaracion: */
            int a=1, b=2, c=3;
            System.out.println(a+b+c);
        
        // Tambien puedes asignar el mismo valor a multiples variables del mismo tipo en una linea:
            int h,i,j;
            h=i=j=15;
            System.out.println(h+i+j);
        
        /*Identificadores
        Todas las variables de Java deben estar identificadas con nombres £nicos.
        Estos nombres £nicos son llamados identificadores.
        Los identificadores pueden ser nombres cortos (como 'x' o 'y') o m s descriptivo(edad,suma,volumen)
        Es recomendable utilizar nombres descriptivos para crear un c¢digo entendible y mantenible*/
            int minutosPorHora=14;//BIEN
            int m=15; //Ok, pero no es fac¡l entender que es m
        
        /*Las reglas generales para nombrar variables son:
            -Los nombres pueden contener letras, d¡gitos, guiones bajos y signos de d¢lar.
            -Los nombres deben comenzar con una letra.
            -Los nombres deben comenzar con una letra min£scula y no pueden contener espacios en blanco
            -Los nombres tambi‚n pueden comenzar con $ y _ (pero no lo usaremos en este tutorial)
            -Los nombres distinguen entre may£sculas y min£sculas ("myVar" y "myvar" son variables diferentes)
            -Las palabras reservadas (como las palabras clave de Java, como int o boolean) no se pueden usar como nombres */

    }
}
