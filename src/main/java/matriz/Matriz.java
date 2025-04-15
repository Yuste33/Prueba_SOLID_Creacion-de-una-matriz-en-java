package matriz;

public class Matriz {
    private int[][] numeros;

    public Matriz(int[][] elementos) {
        this.numeros = elementos;
    }


    public void imprimir() {
        for (int[] fila : numeros) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public Matriz transpuesta() {
        int filas = numeros.length;
        int columnas = numeros[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = numeros[i][j];
            }
        }

        return new Matriz(transpuesta);
    }
}
