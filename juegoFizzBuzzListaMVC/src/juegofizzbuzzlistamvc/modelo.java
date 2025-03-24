
package juegofizzbuzzlistamvc;


public class modelo {
    public String calcularFizzBuzz(int num) {
        // Retorna el resultado del cálculo FizzBuzz como String
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return "El numero ingresado fue: " + num;
        }
    }
}
