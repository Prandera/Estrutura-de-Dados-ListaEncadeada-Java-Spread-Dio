package dio.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

        //Testando o metodo add
        minhaLista.add("teste 1");
        minhaLista.add("teste 2");
        minhaLista.add("teste 3");
        minhaLista.add("teste 4");
        minhaLista.add("teste 5");

        //Testando o metodo get
        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(1));
        System.out.println(minhaLista.get(2));
        System.out.println(minhaLista.get(3));

        //Testando o metodo toString
        System.out.println(minhaLista);

        //Testando o metodo remove
        System.out.println(minhaLista.remove(3));
        System.out.println(minhaLista);

    }
}
