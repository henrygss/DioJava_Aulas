package Equipamentos.Multifuncional;

import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.Impressora.Impressora;
import Equipamentos.Copiadora.Copiadora;



//Esta classe deve possuir todas as características de imprimir, copiar e digitalizar
//Para isso, é necessário que as classes Copiadora, Digitalizadora e Impressora tornem-se interfaces
public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    
    public void copiar(){
        System.out.println("Copiando via equipamento multifuncional");
    }

    public void digitalizar(){
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    public void imprimir(){
        System.out.println("Imprimindo via equipamento multifuncional");
    }
}
