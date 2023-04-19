
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Declarar el arreglo
    int[] listaNumeros = new int[12];
    
    // Solicitar al usuario ingresar los números
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese 12 números enteros: ");
    for (int i = 0; i < listaNumeros.length; i++) {
      listaNumeros[i] = scanner.nextInt();
    }
    
    // Filtrar los números impares en un nuevo arreglo
    int[] impares = Arrays.stream(listaNumeros)
                          .filter(n -> n % 2 != 0)
                          .toArray();
    
    // Ordenar el arreglo de impares utilizando Selection Sort
    selectionSort(impares);
    
    // Imprimir el arreglo de impares ordenados
    System.out.println("Los números impares ordenados ascendentemente son:");
    for (int i = 0; i < impares.length; i++) {
      System.out.print(impares[i] + " ");
    }
  }
  
  public static void selectionSort(int[] a) {
    int min;
    for (int i = 0; i < a.length - 1; i++) {
      min = i;
      for (int j = i + 1; j < a.length; j++) {
        if (a[min] > a[j])
          min = j;
      }
      int aux = a[min];
      a[min] = a[i];
      a[i] = aux;
    }
  }
}
