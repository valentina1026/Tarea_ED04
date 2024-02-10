package cuentas;

/**
 * Clase principal que contiene el método principal (main) para demostrar
 * la operativa de la cuenta bancaria (CCuenta).
 */
public class Main {

    /**
     * Método principal que demuestra la operativa de una cuenta bancaria.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Inicia la operativa de la cuenta con un saldo inicial de 100.0F
        operativa_cuenta(100.0F);
    }

    /**
     * Realiza diversas operaciones en una cuenta bancaria y muestra el resultado.
     *
     * @param cantidad La cantidad inicial para la cuenta.
     */
    private static void operativa_cuenta(float cantidad) {
        // Crea una nueva instancia de la clase CCuenta
        CCuenta cuenta1;
        // Almacena el saldo actual de la cuenta
        double saldoActual;

        // Inicializa la cuenta con valores específicos
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        // Obtiene el estado actual de la cuenta
        saldoActual = cuenta1.estado();
        // Imprime el saldo actual de la cuenta
        System.out.println("El saldo actual es" + saldoActual);

        try {
            // Intenta retirar una cantidad específica de la cuenta
            cuenta1.retirar(2300);
        } catch (Exception e) {
            // Captura excepciones en caso de fallo al retirar
            System.out.print("Fallo al retirar");
        }
        try {
            // Intenta ingresar una cantidad específica a la cuenta
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            // Captura excepciones en caso de fallo al ingresar
            System.out.print("Fallo al ingresar");
        }
    }
}