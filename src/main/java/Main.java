
import matriz.Matriz;

public class Main {
    public static void main(String[] args){
        Matriz m = new Matriz(new int[][]{{1, 2}, {3, 4}});
        m.imprimir();

        System.out.println("----");
        Matriz mTranspuesta = m.transpuesta();
        mTranspuesta.imprimir();
    }
}