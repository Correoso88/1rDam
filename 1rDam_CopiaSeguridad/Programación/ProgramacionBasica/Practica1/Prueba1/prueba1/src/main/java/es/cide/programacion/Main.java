//nom: Hugo Correoso Caparros
//data: 25/09/2025
//dni: 45190261
package es.cide.programacion;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //PRIMER EJERCICIO
        int registro1; //es correcto
        // int 1registro no es correcto porque comienza por un numero
        // int archivo_3; //no es correcto porque no puede llevar caracteres especiales
        // int while; //las funciones no se pueden poner como variables
        int $impuesto; //es correcto
        int año; //es correcto
        // int primer apellido; //no se pueden poner espacios
        int primer_apellido;// es correcto
        // int primer-apellido; //no se pueden poner guiones
        int primerApellido; //es correcto
        // int Tom's; //no se pueden poner caracteres especiales
        int C3PO; //es correcto
        // int 123#; //caracter especial
        // int PesoMáximo; //no se pueden poner acentos
        // int %descuento; //no se pueden poner porcentage
        int Weight; //es correcto
        // int $$precioMínimo; //no se pueden poner caracteres especiales
        // int _$Único; //no se pueden poner caracteres especiales
        int tamaño_maximo;// es correcto
        // int peso.maximo; // no se pueden poner puntos
        int Precio__;
        // int matrícula?; //no se pueden poner caracteres especiales
        // int cuántoVale; //no se pueden poner acentos
        int high; //es correcto
        int barça; //es correcto
        int piragüista; //es correcto
        int B_011; //es correcto
        int X012AB; //es correcto
        // int 70libro; //no se pueden poner numeros enteros al principio
        // int nombre&apellido; //no se pueden poner caracteres especiales
        // int 0X1A; // no se pueden poner numeros enteros al principio
        // int else; //no se pueden poner funciones


        //SEGUNDO EJERCICIO
        double tth=0.5; //se usa el float porque son datos con coma
            System.out.println(tth);
        double zzb =.5; //se usa el float porque son datos con coma
            System.out.println(zzb);
        double zzc=9.3e12; //se usa el float porque son datos con coma
            System.out.println(zzc);
        int zzd=12345678; //son nombres enteros
            System.out.println(zzd);
         // 2345678_L; //es incorrecto ya que no se pueden poner caracteres especiales
        // float c=0.8E+0.8; //la E no puede tener decimal, tiene que ser entero, es incorrecto
        // float c=0.8E 8; //la E no puede tener decimal, tiene que ser entero, es incorrecto
        short zze=05_15;
            System.out.println(zze);
        //int f=018CDF;// no puede comenzar con un numero
        int zzf=0XBC5DA;
            System.out.println(zzf);
        int zzg= 0x87e3a;// int para numeros enteros
            System.out.println(zzg);
        // int g=234567L;//no se puede comenzar con un numero
        //0_B11; //es incorrecto
        int zzh=010101; //numero binario, uso el int porque es numero entero
            System.out.println(zzh);
        int zzi=0_557;// es correcto y uso el int porque es numero entero
            System.out.println(zzi);
        // 00.8E2; //esta mal representado
        double zzj= .3e3f; //uso el fouble porque es decimal
            System.out.println(zzj);
        int zzk=0b111; //numero binario, se puede usar el que sea
            System.out.println(zzk);
        //int m=12_234L; //no se puede empezar con un numero
        int zzm=0Xabcd;// numero hexadecimal se puede usar el que sea
            System.out.println(zzm);
        long zzn=0xabcEL;
            System.out.println(zzn);
        //_234; //no se puede empezar con un separador
        //int o=1010B; //si esta en binario no se puede poner un caracter
        long zzo=0x1010B;
            System.out.println(zzo);
        //int zzz=1_234.2E-2;// es incorrecto ya que la E no se puede aplicar a decimales
        // int q=1234.2EF; //los expotenciales se tienen que aplicar a un decimal
        //1234.2E3F; //los expotenciales se tienen que aplicar a un decima
        //=1_1.2e_2; //los expotenciales se tienen que aplicar a un decima
        //int q= 0bABCDL;// si esta el "0b" deben estar
        byte zzq=0X1A; //uso byte porque no supero el numero 127
            System.out.println(zzq);
        long zzr=0X12AL; //uso long porque acaba en L
            System.out.println(zzr);
        //String zzs=abcd; //es un String pero necesita las comillas obligatoriamente
        byte t=0125; //numero menor a 127 se tiene que poner byte
            System.out.println(t);
        double u=.01011; //double se usa para decimales menores a 7 digitos
            System.out.println(u);
        // zzv=3e12; //es incorrecto porque falta una operación luego de la e
        //long w=3_e12; //incorrecto ya que necesita una operación logica
        //long w=-3E-1_2; //es incorrecto porue necesita una operación logica
        //0.8E; //los decimales no pueden ir con la E
        // 0B1212; //si es binario solo puede haber 1 y 0
        byte zzx=1_2_3;// es correcto, son tres numero menores a 127
            System.out.println(zzx);
        int zzy=0xedad; //con short no basta, se necesitan mas digitos
            System.out.println(zzy);
        short zzz=0XBE2; //con byte no basta, se necesita short
            System.out.println(zzz);
        //long aa=101e2; //es incorrecto porque necesita una operación luego de la e
        //ab=B1101;//es incorrecto ya que para que sea binario, se tiene que empezar con B0
        // int ac=1.34.5; //es incorrecto porque no puede haber dos puntos sin operación logica
        // 12.3E4F;// la E no se puede aplicar a decimales
        // short ac=0X12AG; // la G no significa nada en los hexadecumales
       
        //TERCER EJECRICIO CHAR
        char ac ='a';//es correcto
        System.out.println(ac);
        char ad ='$';//es correcto
        System.out.println(ad);
        char ae ='\n'; //es correcto
        System.out.println(ae);
        char af ='\\'; // es correcto porque se necesita
        System.out.println(af);
        // char ag='\ñ'; //es incorrecto ya que java no detecta bien la ñ
        char ah ='T';//es correcto
        System.out.println(ah);
        // char ai='ñ'; //es incorrecto ya que java no detecta bien la ñ
        // char aj='xyz'; //es incorrecto ya que son mas de un caracter
        char ak ='\u0066'; //es correcto porque ese codigo significa una f
        System.out.println(ak);
        // char am='XYZ'; //es incorrecto ya que son mas de un caracter
        char an ='4'; //es correcto
        System.out.println(an);
        char ao ='\t'; //es correcto
        System.out.println(ao);
        char ap ='\b'; //es correcto
        System.out.println(ap);
        //char aq =k; //es incorrecto
        // char ar=+; // es incorrecto, siempre tiene que ir entre comillas simples
        char as ='+'; //es correcto
        System.out.println(as);
        char at='?'; //es correcto
        System.out.println(at);
        char au ='â';//es correcto
        System.out.println(au);
        char av =':';//es correcto
        System.out.println(av);


        //QUARTO EJERCICIO STRINGS
        //String aw='8:15 P.M.';
        String ax ="Capítulo \'3\'"; //es correcto
        String ay =" ";// es correcto
        String az ="programación"; //es correcto
        //String ba =0"W";// es incorrecto ya que tiene que empezar con comillas
        String bb ="Rojo, Blanco y Azul"; //es correcto
        String bc ="1.3e-1-2"; //es correcto
        String bd ="A"; //es correcto
        //String be="programación "Java"; //es incorrecto porque se necesitan cerrar las comillas
        String bf ="\n"; //es correcto
        System.out.println(bf);
        String bg ="Nombre:"; //es correcto
        String bh =""; //es correcto
        //String bi ="FP' ;// se tienen que cerrar las comillas y las barras simples
        //String bj =Programación
        String bk = "4+5 * 2"; //es correcto


        //QUINTO EJERCICIO, DECLARAR VARIEBLES
        byte p = 1, q = 2;
            System.out.println(p);
            System.out.println(q);
        char a1 = 'A', b1 = 'B',c1 = 'C';
            System.out.println(a1);
            System.out.println(b1);
            System.out.println(c1);
        long contador = 9000L;
            System.out.println(contador);
        byte indice = 126;
            System.out.println(indice);
        char car1= 'a', car2= 'b';
            System.out.println(car1);
            System.out.println(car2);
        boolean primero= true, ultimo = false;
            System.out.println(primero);
            System.out.println(ultimo);
        double d7x= 1.5, d7y = 1.6, d7z =1.7;
            System.out.println(d7x);
            System.out.println(d7y);
            System.out.println(d7z);
        double raiz1= 5.6, raiz2 = 7.3;
            System.out.println(raiz1);
            System.out.println(raiz2);
        short indicador = 200;
            System.out.println(indicador);
        double precio =9.2, precioFinal = 5.5;
            System.out.println(precio);
            System.out.println(precioFinal);
        byte valor = 30;
            System.out.println(valor);
        //String d7nombre = adios;
            //System.out.println(d7nombre);


        //SEXTO EJERCICIO, DECLARAR VARIABLES
        byte edad = 18; //byte porque no supera los 100 años
            System.out.println(edad);
        double altura = 1.69; //double para decimales de hasta 7 digitos
            System.out.println(altura);
        String nombre = "hugo"; //string paar almacenar varios caracteres
            System.out.println(nombre);
        double iva = 1.21; //double para decimales de hasta 7 digitos
            System.out.println(iva);
        byte peso = 58; //byte porque no supera los 127 kl en casos normales
            System.out.println(peso);
        boolean alumnoRepetidor = false; //booleano porque solo se puede saber si lo eres o no
            System.out.println(alumnoRepetidor);
        char letra= 'h'; //char para almacenar solo un carcter
            System.out.println(letra);
        double minutos = 25.30;
            System.out.println(minutos);
        String matriculaCoche = "1942ABC"; //string paar almacenar varios caracteres
            System.out.println(matriculaCoche);
        boolean mayorDeEdad = true;
            System.out.println(mayorDeEdad);
        int códigoPostal = 07010;
            System.out.println(códigoPostal);
        char genero = 'H'; //char para almacenar solo un carcter
            System.out.println(genero);
        byte numeroDeHijos = 0; //byte porque normalmente no supera de los 4 hijos
             System.out.println(numeroDeHijos);
        byte tallaCamisa = 36; //byte porque no supera los 127
             System.out.println(tallaCamisa);
        double precio1 = 3.59; //double para decimales de hasta 7 digitos
            System.out.println(precio1);
        String mensaje = "Hola"; //string paar almacenar varios caracteres
            System.out.println(mensaje);
        byte mayorEdad = 18; //byte porque solo el numero 18
            System.out.println(mayorEdad);
        long dias = 1000L; //long ya que pueden ser infinitos dias
            System.out.println(dias);
        int contador1 = 21387; //un numero bastnte alto para el contador
            System.out.println(contador1);
        String tallaCamiseta = "XL"; //string paar almacenar varios caracteres
            System.out.println(tallaCamiseta);




        //SEPTIMO EJERCICIO, CONVERTIR EXPRESSIONES ALGEBRÀICAS A ALGORITMOS

        double valora = 8;
        double valorb = 3;
        double valorc = -5;
        double valord = 4;
        double valorx = 6;
        double valory = 7;
        double valorz = 2;
        double valorn = 9;
        double valorm = 10;
        double valorj = 11;
        double valorf = 12;
        double valorg = 13;
        double valorp = 14;
        double valorr = 15;
        double valors = 16;
        double valore = 17;
        double valorq = 18;
        double valorh = 19;
        double resultado_a = (valorb/2)-(4*valora*valorc);
            System.out.println(resultado_a);
        double resultado_b = (3*valorx*valory)-(5*valorx)+(12*valorx)-(17);
            System.out.println(resultado_b);
        double resultado_c = (valorb+valord)/(valorc+4);
            System.out.println(resultado_c);
        double resultado_d = ((valorx*valory)/(valory))+2;
            System.out.println(resultado_d);
        double resultado_e = ((1)/(valory))+((3*valorx)/(valorz))+1;
            System.out.println(resultado_e);
        double resultado_f = (1)/(valory+3)+(valorx)/(valory);
            System.out.println(resultado_f);
        double resultado_g = (1)/(valory)+(3+valorx)/(valory+1);
            System.out.println(resultado_g);

        //OCTAVO EJERCICIO, CONVERTIR EXPRESSIONES ALGEBRÀICAS A ALGORITMOS

        double resultado_d10a = (3)/(2)+(4)/(3);
            System.out.println(resultado_d10a);
        double resultado_d10b = (1)/(valorx-5)-(3*valorx*valory)/(4);
            System.out.println(resultado_d10b);
        double resultado_d10c = ((1)/(2))+7;
            System.out.println(resultado_d10c);
        double resultado_d10d = 7+((1)/(2));
            System.out.println(resultado_d10d);
        double resultado_d10e = (Math.pow(valora, 2))/(valorb-valorc)+(valord-valore)/(valorf)-(valorg*valorh)/(valorj);
            System.out.println(resultado_d10e);
        double resultado_d10f = ((valorm)/(valorn))+(valorp);
            System.out.println(resultado_d10f);
        double resultado_d10g = (valorm)+((valorn)/(valorp-valorq));
            System.out.println(resultado_d10g);
        double resultado_d10h = (Math.pow(valora, 2))/(Math.pow(valorb, 2))+(Math.pow(valorc, 2))/(Math.pow(valord, 2));
            System.out.println(resultado_d10h);
        double resultado_d10i = ((valorm)+((valorn/valorp)))/((valorq)-((valorr)/(valors)));
            System.out.println(resultado_d10i);
        double resultado_d10j = ((3*valora)+(valorb))/((valorc)-(valord+5*valore))/((valorf)+(valorg))/((2*valorh));
            System.out.println(resultado_d10j);
        double resultado_d10k = ((Math.pow(valora, 2))+2*valora*valorb+(Math.pow(valorb, 2)))/(1)/((Math.pow(valorx, 2))+(2));
            System.out.println(resultado_d10k);

        //NOVENO EJERCICIO, DETERMINA EL VALOR DE LAS SIGUIENTES EXPRESIONES

        int a = 8, b = 3, c = -5;
        int resultado_d11a = (a+b+c);
            System.out.println(resultado_d11a);
        int resultado_d11b = (2*b+3*(a-c));
            System.out.println(resultado_d11b);
        int resultado_d11c = ((a)/(b));
            System.out.println(resultado_d11c);
        int resultado_d11d = (a%b);
            System.out.println(resultado_d11d);
        int resultado_d11e =((a)/(c));
            System.out.println(resultado_d11e);
        int resultado_d11f = (a%c);
            System.out.println(resultado_d11f);
        int resultado_d11g = (a*b)/(c);
            System.out.println(resultado_d11g);
        int resultado_d11h = (a*(b/c));
            System.out.println(resultado_d11h);
        int resultado_d11i = a*(c%b);
            System.out.println(resultado_d11i);
        int resultado_d11j = a*(c%b);
            System.out.println(resultado_d11j);
        int resultado_d11k = (3*a-2*b)%(2*a-c);
            System.out.println(resultado_d11k);
        int resultado_d11l = 2*(a/5+(4-b*3))%(a+c-2);
            System.out.println(resultado_d11l);
        int resultado_d11m = (a-3*b)%(c+2*a-c);
            System.out.println(resultado_d11m);
        int resultado_d11n = (a-b-(c*2));
            System.out.println(resultado_d11n);

        //EJERCICIO 10, DETERMINA LAS SIGUIENTES  EXPRESIONES ARITMETICAS

        double x = 88, y = 3.5,z = -5.2;
        double resultado_d12a = (x+y+z);
            System.out.println(resultado_d12a);
        double resultado_d12b = (2*y+3*(x-z));
            System.out.println(resultado_d12b);
        double resultado_d12c = (x/y);
            System.out.println(resultado_d12c);
        double resultado_d12d = (x%y);
            System.out.println(resultado_d12d);
        double resultado_d12e = (x/(y+z));
            System.out.println(resultado_d12e);
        double resultado_d12f = ((x/y)+z);
            System.out.println(resultado_d12f);
        double resultado_d12g = ((2*x)/(3*y));
            System.out.println(resultado_d12g);
        double resultado_d12h = ((2*x)/(3*y));
            System.out.println(resultado_d12h);
        double resultado_d12i = (x*y%z);
            System.out.println(resultado_d12i);
        double resultado_d12j = (x*(y%z));
            System.out.println(resultado_d12j);
        double resultado_d12k = (3*x-z-2*x);
            System.out.println(resultado_d12k);
        double resultado_d12l = (2*x/5%y);
            System.out.println(resultado_d12l);
        double resultado_d12m = (x-100%y%z);
            System.out.println(resultado_d12m);
        double resultado_d12n = (x-y-(z*2));
            System.out.println(resultado_d12n);

        //EJERCICIO 11, DETERMINA LAS SIGUIENTES  EXPRESIONES ARITMETICAS

        byte b13 = 1;
        short s13 = 1000 ;
        long ln13 = 1000L;
        int i13 =100000, j13 = 200000;
        float f13 = 1.2f;
        double d13 = 1.5;
        char c13 = 'a';
        
        //int resultado_13a = (i + c) ; //es incorrecto ya que no puedes sumar un entero con un caracter
        //float resultado_13b = (f-c) ; //es incorrecto ya que no puedes sumar un decimal con un caracter
        double resultado_13c = (13d+13f);
            System.out.println(resultado_13c);
        double resultado_13d = (d13+i13);
            System.out.println(resultado_13d);
        float resultado_13e = (i13/f13);
            System.out.println(resultado_13e);
        int resultado_13f = (s13+j13);
            System.out.println(resultado_13f);
        double resultado_13g = (d13+j13);
            System.out.println(resultado_13g);
        //resultado_13h =(s13*c13); //es incorrecto ya que no puedes sumar un entero con un caracter
        //resultado_13i =(d13+c13); //es incorrecto ya que no puedes sumar un entero con un caracter
        //resultado_13j =(b13+c13); //es incorrecto ya que no puedes sumar un entero con un caracter
        //resultado_13k =(b13/c13+s13); //es incorrecto ya que no puedes sumar un entero con un caracter
        //resultado_13l =(c13+c13); //es incorrecto ya que no puedes sumar un entero con un caracter
        double resultado_13m =(i13+ln13+d13);
            System.out.println(resultado_13m);
        //resultado_13n =(ln13+c13); //es incorrecto ya que no puedes sumar un entero con un caracter
        int resultado_13o =(5/j13);
            System.out.println(resultado_13o);
        double resultado_13p =(5.2/j13);
            System.out.println(resultado_13p);
        double resultado_13q =(i13*f13*2.5);
            System.out.println(resultado_13q);
        double resultado_13r =(ln13*f13*2.5f);
            System.out.println(resultado_13r);
        long resultado_13s =(j13-4L);
            System.out.println(resultado_13s);
        double resultado_13t =(j13-4L*2.5f);
            System.out.println(resultado_13t);
        double resultado_13u =(b13+2.5*i13+35f);
            System.out.println(resultado_13u);
        //resultado_13v =('a'+b13); //es incorrecto ya que no puedes sumar un entero con un caracter
        //resultado_13w =('a'+c13); //es incorrecto ya que no puedes sumar un entero con un caracter
        //resultado_13x =('a'+c13);
        //resultado_13y =(c13-ln13/2); //es incorrecto ya que no puedes sumar un entero con un caracter
        double resultado_13z =(2/i13+2.0/j13);
            System.out.println(resultado_13z);
         
        //EJERCICIO 12, DETERMINA EL VALOR DE LAS SIGUIENTES EXPRESSIONES LÒGICAS

        boolean X = true;
        boolean Y = false;
        boolean Z =true;
        boolean resultado_14a = (X && Y) || (X && Z);
            System.out.println(resultado_14a);
        boolean resultado_14b = (X || !Y)&& (!X || Z);
            System.out.println(resultado_14b);
        boolean resultado_14c = X || Y && Z ;
            System.out.println(resultado_14c);
        boolean resultado_14d = !(X || Y) && Z ;
            System.out.println(resultado_14d);
        boolean resultado_14e = X || Y || X && !Z && !Y ;
            System.out.println(resultado_14e);
        boolean resultado_14f = !X || !Y || Z && X && !Y;
            System.out.println(resultado_14f);
    }  
}

