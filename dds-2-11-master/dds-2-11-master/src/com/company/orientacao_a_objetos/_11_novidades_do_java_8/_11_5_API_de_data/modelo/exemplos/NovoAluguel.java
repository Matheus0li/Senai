package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_5_API_de_data.modelo.exemplos;

import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_5_API_de_data.modelo.model.Aluguel;
import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_5_API_de_data.modelo.model.Carro;
import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_5_API_de_data.modelo.model.Cliente;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class NovoAluguel {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva0", LocalDate.of(1985, Month.FEBRUARY, 8));
        Carro carro = new Carro("Gol", 90.0, Year.of(2012));

        LocalDateTime dataHoraDaRetirada = LocalDateTime.of(LocalDate.now(), LocalTime.of(LocalTime.now().now().getHour(), 0));

        LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);
        Aluguel aluguel = new Aluguel(cliente, carro, dataHoraDaRetirada, dataEHoraPrevistaParaDevolucao);

        imprimirRecebido(aluguel);

    }

    private static void imprimirRecebido(Aluguel aluguel) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>> RECEBIDO <<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Carro: " + aluguel.getCarro().getModelo());
        System.out.println("Cliente: " + aluguel.getCliente().getNome());

        DateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Data e hora da retirada: " + aluguel.getDataEHoraDaRetirada().format(formatter));
        System.out.printf("Data e hora prevista para devolução: " + aluguel.getDataEHoraPrevistaParaDevolucao().format(formatter));
    }
}
