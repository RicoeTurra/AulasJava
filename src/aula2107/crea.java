package aula2107;

    //Interface que define todos os engeneheiros e arquitetos
    interface CREA {
        void imprimirModalidade(); // Metodo que imprime a modalidade
    }

    //Super Classe de todos os Arquitetos
    abstract class Arquiteto implements CREA {
        public void imprimirProfissao() {
            System.out.println("Eu sou arquiteto");
        }  // Metodo que imprime a profissão
    }
    //Sub Classe de Arquitetos de Interior
    class ArquitetoInterior extends Arquiteto {

        public void queEuFaco() {
            System.out.println("Eu reviso funções de interiores.");
        } // Metodo que imprime o que o profissional faz

        @Override
        public void imprimirModalidade() {
            System.out.println("Modalidade: Arquitetura de Interiores");
        } // Metodo que imprime a modalidade
    }
    //Super Classe de todos os Engenheiros
    abstract class Engenheiro implements CREA {
        public void imprimirProfissao() {
            System.out.println("Eu sou engenheiro");
        }// Metodo que imprime a profissão
    }

    //Sub Classe de Engenheiros Civis
    class EngenheiroCivil extends Engenheiro {

        public void queEuFaco() {
            System.out.println("Eu reviso cálculos de estruturas."); // Metodo que imprime o que o profissional faz
        }

        @Override
        public void imprimirModalidade() {
            System.out.println("Modalidade: Engenharia Civil"); // Metodo que imprime a modalidade
        }
    }

