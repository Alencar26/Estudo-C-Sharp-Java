package version2;

public class TesteArrayFila {

    // Exemplo de fila circular
    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        ArrayFila fila = new ArrayFila(5);
        System.out.println(fila);

        fila.inserirNaFila("elemento-1");
        System.out.println(fila);
        fila.inserirNaFila("elemento-2");
        System.out.println(fila);
        fila.inserirNaFila("elemento-3");
        System.out.println(fila);
        fila.inserirNaFila("elemento-4");
        System.out.println(fila);
        fila.tirarPrimeiroDaFila();
        System.out.println(fila);
        fila.inserirNaFila("elemento-5");
        System.out.println(fila);
        fila.tirarPrimeiroDaFila();
        System.out.println(fila);
        fila.inserirNaFila("elemento-6");
        System.out.println(fila);
    }
}
