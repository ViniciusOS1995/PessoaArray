import persona.Pessoa;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        var vivian = new Pessoa("Vivian", 27);
        var pedro = new Pessoa("Pedro", 46);
        var fernando = new Pessoa("Fernando", 20);

        var listaDePessoas = new ArrayList<Pessoa>();
        listaDePessoas.add(vivian);
        listaDePessoas.add(pedro);
        listaDePessoas.add(fernando);
        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas);
    }
}
