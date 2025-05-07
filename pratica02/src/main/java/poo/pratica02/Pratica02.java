/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poo.pratica02;

/**
 *
 * @author iuryp
 */
public class Pratica02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        byte byte1 = -2, byte2 =3;
        short short1 = 100, short2 = 200;
        int int1 = 30, int2 = 50;
        long long1 = 50405004, long2 = 9237428;
        float float1 = 2354343, float2 = 2323423;
        double double1 = 2342.23, double2 = 34534.34;
        char char1 = 'I', char2 = 'G';
        boolean A = true, B = false;
        
        System.out.printf("Bytes: %d %d \n", byte1, byte2);
        System.out.printf("Shorts: %d %d \n", short1, short2);
        System.out.printf("Inteiros: %d %d \n", int1, int2);
        System.out.printf("Floats: %f %f \n", float1, float2);
        System.out.printf("Double: %f %f \n", double1, double2);
        System.out.printf("Caracteres: %c %c \n", char1, char2);
        System.out.printf("Booleans: %b %b \n", A, B);
        
        // 1. Numero maior que o tipo.
        //short1 = 32769;
        
        //2. Deve ser feito um cast. Sendo que será perdido a precisao no caso abaixo. Tipos maiores podem receber menores.
        // 3. Nao ocorre arredondamento, e sim truncamento da parte fracionária.
        int1 = (int)double1;
        double2 = int2;
        System.out.printf("Inteiro recebendo um double: %d \n", int1);
        System.out.printf("Double recebendo int: %f \n", double2);
        
        
        // 4. Quando ha um calculo que envolve inteiro e reais, ha tambem o truncamento, que deve ser solucionad com TypeCasting
        // double resultado3 = (int1 + short1 + byte1) / 9;
        // System.out.printf("Perda de resultado fracionado: %.2f \n", resultado3);
        double resultado3 = ((double)int1 + (double)short1 + (double)byte1) / 9;
        System.out.printf("Perda de resultado fracionado: %.2f \n", resultado3);
        
        
        // 5. Acontece o mesmo que o problema de cima, sao numeros inteiro sendo passado para Double.
        // Nessa caso, ou deve haver cast, ou um deles deve ser um numero real
        //double trezQuartos = 3 / 4;
        double trezQuartos = 3.0 / 4;
        System.out.printf("Valor: %f \n", trezQuartos);
        
        // 6. A diferenca é que o XOR analise a hipotese no OU em que ambos sao V
        // e diferente verifica igualdades
        A = true;
        B = true;
        if(A || B){
            System.out.print("Pelo menos UM e verdadeiro \n");
        }
        if(A != B){
            System.out.print("Diferente \n");
        }
        if(A ^ B == false){
            System.out.print("XOR -- AMBOS sao VERDADEIROS\n");
        }
    }
}
