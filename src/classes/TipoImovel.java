/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import classes.TipoImovel;
import javax.swing.JOptionPane;
import classes.TelaMenu;
import java.text.DecimalFormat;


//dados dos imoveis
public class TipoImovel extends Imovel{
    
    //SUB CLASSSE DO IMOVEL  
    /*o bairro onde se localiza
    status (situação do imóvel – ocupado ou disponível) */
    
    public String bairro, status;
        
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String aluguel_final() {
        // formatar as casas decimais
        DecimalFormat casas = new DecimalFormat("0.00"); 
        double aluguel = 0;
              

        if (tipo.equals("Comercial")) {
            aluguel = aluguel_base * 1.15;
        }
        if (tipo.equals("Galpão")) {
            aluguel = aluguel_base * 1.10;
        }
        if (tipo.equals("Residencial")) {
            aluguel = aluguel_base * 1.05;
        }

        return casas.format(aluguel);
        //this.aluguel_final = aluguel_final;
    }
    
    
}
