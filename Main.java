import br.com.alura.modelos.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Bruno";
        pessoa1.idade = 24;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Taylor";
        pessoa2.idade = 18;

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Guilherme";
        pessoa3.idade = 17;

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.getFirst().toString());
        System.out.println("Lista completa: " + listaDePessoas.toString());

    }
}