package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testPessoasSexoFeminino() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", "f"));
        pessoas.add(new Pessoa("João", "m"));
        pessoas.add(new Pessoa("Ana", "feminino"));

        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> App.isMulher(pessoa.getSexo()))
                .collect(Collectors.toList());

        assertEquals(2, mulheres.size());
        assertEquals("Maria", mulheres.get(0).getNome());
        assertEquals("Ana", mulheres.get(1).getNome());
    }
}
