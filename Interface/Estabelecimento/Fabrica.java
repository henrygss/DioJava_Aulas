package Estabelecimento;

import Equipamentos.Impressora.Deskjet;
import Equipamentos.Impressora.Impressora;
import Equipamentos.Digitalizadora.Digitalizadora;
//import Equipamentos.Impressora.Deskjet;
//import Equipamentos.Impressora.Laserjet;
import Equipamentos.Digitalizadora.Scanner;
import Equipamentos.Copiadora.Copiadora;
import Equipamentos.Multifuncional.EquipamentoMultifuncional;



public class Fabrica {
    public static void main(String[] args) {
        
        //Impressora impressora = new Deskjet();
        //Impressora impressora = new Laserjet();
        //Impressora impressora = new EquipamentoMultifuncional();

        //Note que em pode ser tanto uma copiadora quanto uma impressora ou digitalizadora
        //devido a interface
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        Deskjet deskjet = new Deskjet();
        Impressora impressora2 = deskjet;
        
        //Note que deskjet pode ser uma impressora, mas não pode ser uma digitalizadora e nem uma copiadora
        //Digitalizadora digitalizadora2 = deskjet;
        //Copiadora copiadora = deskjet;


        Scanner scanner = new Scanner();

        //Note que scanner não pode ser uma impressora nem uma copiadora, mas somente uma digitalizadora
        //Impressora impressora3 = scanner;
        //Copiadora copiadora3 = scanner;
        Digitalizadora digitalizadora3 = scanner;

        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();

    }
}
