package com.company.orientacao_a_objetos._9_serializacao_de_objetos._9_1_salvando_e_lendo_objetos_em_arquivo.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializandoObjeto {

    public static void main(String[] args) throws FileNotFoundException {
        Pessoa p = new Pessoa();
        p.setNome("João Silva");
        p.setIdade(25);
        p.setProfissao("Motorista");

        try (ObjectOutput out = new ObjectOutputStream(Files.newOutputStream(Paths.get("joao.obj")))) {
            out.writeObject(p);
            System.out.println("Objeto salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro salvando o objeto. " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
