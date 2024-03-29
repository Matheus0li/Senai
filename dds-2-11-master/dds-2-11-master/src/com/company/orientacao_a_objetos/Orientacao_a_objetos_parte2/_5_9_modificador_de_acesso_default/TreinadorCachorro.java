package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_9_modificador_de_acesso_default;
public class TreinadorCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bob");
        DonoCachorro donoCachorro = new DonoCachorro();
        donoCachorro.ensinarCachorroSentar(cachorro);
    }
}
