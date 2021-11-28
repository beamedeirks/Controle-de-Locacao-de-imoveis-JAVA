/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author beatr
 */

import java.util.ArrayList;


//CLASSE JAVA
public class Imovel {
    
    /*código do imóvel, 
    tipo (residencial, comercial ou galpão), 
    o valor base do aluguel*/
    public int codigo;
    public String tipo;
    public double aluguel_base;
    public double aluguel_final;

      
    //não tem tanho definido, é do nome da classe acima
    //cada dado acima entram em cada posição da array(vetor)
    public static ArrayList<Imovel> Array_imoveis =new ArrayList <Imovel>();

     public Imovel(){
         
     }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAluguel_base() {
        return aluguel_base;
    }

    public void setAluguel_base(int aluguel_base) {
        this.aluguel_base = aluguel_base;
    }
    
    public int getAluguel_final() {
        return (int) aluguel_final;
    }

    
    
    //public double aluguel_final() {
        
    //}
     
     
     
}
