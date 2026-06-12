import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Nivel 1 – Fundamentos de métodos (sin arrays)
        //1
//        saludar();
        //2
//        String nombre = pedirNombre();
//        System.out.println("Hola " + nombre);
        //3
//        double resultado = calcularAreaRectangulo(5, 3);
//        System.out.println("El área del rectangulo es: " + resultado);
        //4
//        Scanner ingresarTexto = new Scanner(System.in);
//        System.out.print("Ingrese un texto: ");
//        String texto = ingresarTexto.nextLine();
//        String textoMayusculas = convertirMayusculas(texto);
//        System.out.println(textoMayusculas);
        //5
//        mostrarMenu();

//        Nivel 2 – Métodos con retorno y lógica
        //6
//        esPar();
        //7
        //cuadradoNumero();
        //8
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Ingrese un numero para saber su factorial: ");
//        int numeroIgresado = teclado.nextInt();
//        int resultado = calcularFactorial(numeroIgresado);
//
//        System.out.println("El factorial de " + numeroIgresado + "es: " + resultado);

//        Nivel 3 – Métodos con varargs y arrays
        //9
//        sumarNumeros();
        //10
        

    }
    //1. Mostrar mensaje fijo
//  Crear un método llamado mostrarSaludo() que imprima “Hola, mundo”.
    public static void saludar()
    {
        System.out.println("Hola Mundo");
    }

    //2. Saludo personalizado
    public static String pedirNombre()
    {
        Scanner pedirNombre = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = pedirNombre.nextLine();

        return nombre;

    }

    //3. Área de un rectángulo
//    Crear un método que reciba dos argumentos (base, altura) y devuelva el área del
//    rectángulo.

    public static double calcularAreaRectangulo(double base, double altura)
    {
        double area = base * altura;
        return area;
    }

    //4.Convertir a mayúsculas
    public static String convertirMayusculas(String texto)
    {
            return texto.toUpperCase();
    }

    //5.Mostrar menú
    public static void mostrarMenu()
    {
        System.out.println("------ MENÚ ------");
        System.out.println("1. Sandwich");
        System.out.println("2. Pizza");
        System.out.println("3. Papas Fritas");
    }

   //6. Número par o impar
    public static void esPar()
    {
        Scanner pedirNumero = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numeroIngresado = pedirNumero.nextInt();

        if(numeroIngresado % 2 == 0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }

    //7. Calcular el cuadrado de un número
    public static void cuadradoNumero()
    {
        Scanner ingreseNumero = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numeroIngresado = ingreseNumero.nextInt();

        int cuadrado = numeroIngresado * numeroIngresado;
        System.out.println("El cuadrado del número ingresado es: " + cuadrado);
    }
    //8. Factorial recursivo
    public static int calcularFactorial(int numero)
    {

        if(numero == 0)
        {
            return 1;
        }

        return numero * calcularFactorial(numero - 1);
    }

    //9. Sumar múltiples números (varargs)
    public static int sumarNumeros(int... numeros)
    {
        int cantidadNumeros = 0;
        int sumaDeNumeros = 0;
        int resultado =0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea sumar: ");
        cantidadNumeros = teclado.nextInt();
        for(int i = 0; i < cantidadNumeros; i++)
        {
            System.out.println("Ingrese el número que desea sumar: ");
            int numeroIngresado = teclado.nextInt();
            resultado += numeroIngresado;

        }
        System.out.println("La suma de ese número es: " + resultado);
        return sumaDeNumeros;

    }

    //10. Promedio de un array
    public static void promedio(double[] promedioNumeros)
    {

    }
}