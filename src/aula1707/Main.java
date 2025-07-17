package aula1707;

public class Main {
        public static void main (String[] args) {
        // Criando um objeto do tipo Carro
        carro meuCarro = new carro();
        meuCarro.cor = "Branco";
        meuCarro.modelo = "Celta";
        meuCarro.ano = 2012;

        // Chamando métodos
        meuCarro.abrirPorta();
        meuCarro.ligar();
        meuCarro.acenderFarois();
        meuCarro.apagarFarois();
        meuCarro.desligar();
        meuCarro.fecharPorta();
    }
}
