public class java_DataTypes {
    public static void main(String [] args){
        /*Como se explic¢ en el cap¡tulo anterior, una variable en Java debe ser un tipo de datos espec¡fico:
        Los tipos de datos se dividen en dos grupos:
        Tipos de datos primitivos: incluye byte, short, int, long, float, double, boolean y char
        Tipos de datos no primitivos, como String, Arrays y Classes
        Datos Primitivos:
        
        Un tipo de datos primitivo especifica el tama¤o y el tipo de los valores de las variables y no tiene m‚todos adicionales.
        Hay ocho tipos de datos primitivos en Java:
        Tipo de Dato    Tama¤o      Descripcion
        byte            1 byte      Almacena n£meros enteros de -128 a 127
        short           2 bytes     Almacena n£meros enteros de -32,768 a 32,767
        int             4 bytes     Almacena n£meros enteros desde -2,147,483,648 hasta 2,147,483,647
        long            8 bytes     Almacena n£meros enteros desde -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807
        float           4 bytes     Almacena n£meros fraccionarios. Suficiente para almacenar de 6 a 7 d¡gitos decimales
        double          8 bytes     Almacena n£meros fraccionarios. Suficiente para almacenar 15 d¡gitos decimales
        boolean         1 bit       Almacena valores verdaderos o falsos
        char            2 bytes     Almacena un solo car cter/letra o valores ASCII
        
        JavaNumbers
        Los tipos de n£meros primitivos se dividen en dos grupos:
        Los tipos enteros almacenan n£meros enteros, positivos o negativos (como 123 o -456), sin decimales. Los tipos v lidos son byte, short, int y long. El tipo que debe usar depende del valor num‚rico.
        Los tipos de punto flotante representan n£meros con una parte fraccionaria, que contienen uno o m s decimales. Hay dos tipos: flotante y doble.
        
        Tipo Entero:
        byte: Puede ser usado en lugar del int u otros valores de tipo entero par aalmacenar valores cuando estas seguro que el valor estara entre -128 y 127:        
        */
            byte myNum=70;
            System.out.println(myNum);
        // short: Usado cuando estes seguro que los valores estar n entre -32768 a 32767;
            short a=3000;
            System.out.println(a);
        // int: El tipo de datos int puede almacenar n£meros enteros desde -2147483648 hasta 2147483647. En general, y en nuestro tutorial, el tipo de datos int es el tipo de datos preferido cuando creamos variables con un valor num‚rico.
            int b=600000;
            System.out.println(b);
        // long: El tipo de datos largo puede almacenar n£meros enteros desde -9223372036854775808 hasta 9223372036854775807. Esto se usa cuando int no es lo suficientemente grande para almacenar el valor. Tenga en cuenta que debe terminar el valor con u
            long num=14580000000L;
            System.out.println(num);
        
        /*Tipo Flotante:
        Debe usar un tipo de punto flotante cada vez que necesite un n£mero con un decimal, como 9,99 o 3,14515.
        Los tipos de datos float y double pueden almacenar n£meros fraccionarios. Tenga en cuenta que debe terminar el valor con una "f" para flotantes y una "d" para dobles:*/
            float x=5.2f;
            double y= 19.999999865d;
            System.out.println(x);
            System.out.println(y);
        // La diferencia entre ambos es la precisi¢n con la que expresan los decimales, mientras que float aproxima hasta 6 d¡gitos, double aproxima hasta 15, por lo cual es m s recomendable usar double
        
        /*Tipo Boolean:
        Muy a menudo, en la programaci¢n, necesitar  un tipo de datos que solo puede tener uno de dos valores, como:       
            SÖ/NO
            ENCENDIDO/APAGADO
            VERDADERO/FALSO
        Para esto, Java tiene un tipo de dato booleano, que solo puede tomar los valores verdadero o falso:*/
            boolean isJavaFun =true;
            boolean isJavaBoring=false;
            System.out.println(isJavaFun); //imprime true
            System.out.println(isJavaBoring); //imprime falso
        
        /* Chars:
        El tipo de datos char se utiliza para almacenar un solo car cter. El car cter debe estar entre comillas simples, como 'A' o 'c':*/
            char nota='C';
            System.out.println(nota);
        //Alternativamente, si est  familiarizado con los valores ASCII, puede usarlos para mostrar ciertos caracteres:
            char v1=13,v2=45,v3=70;
            System.out.println(v1);
            System.out.println(v2);
            System.out.println(v3);

        /* String:
        El tipo de datos String se utiliza para almacenar una secuencia de caracteres (texto). Los valores de cadena deben estar entre comillas dobles:*/
            String bienvenida="Hola mundo, bienvenido a Java";
            System.out.println(bienvenida);

        /*Tipos de datos no primitivos:
        Los tipos de datos no primitivos se denominan tipos de referencia porque se refieren a objetos.
        La principal diferencia entre los tipos de datos primitivos y no primitivos son:
        
            -Los tipos primitivos est n predefinidos (ya definidos) en Java. Los tipos no primitivos son creados por el programador y no est n definidos por Java (excepto String).
            -Los tipos no primitivos se pueden usar para llamar a m‚todos para realizar ciertas operaciones, mientras que los tipos primitivos no pueden.
            -Un tipo primitivo siempre tiene un valor, mientras que los tipos no primitivos pueden ser nulos.
            -Un tipo primitivo comienza con una letra min£scula, mientras que los tipos no primitivos comienzan con una letra may£scula.
            -El tama¤o de un tipo primitivo depende del tipo de datos, mientras que los tipos no primitivos tienen todos el mismo tama¤o.
        
        Ejemplos de tipos no primitivos son Strings, Arrays, Classes, Interface, etc.*/
    }
}
