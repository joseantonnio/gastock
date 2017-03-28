/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gastock;

/**
 *
 * @author IFSP
 */
public class Bomba {

    private int numero;
    private String senha;
    private int combustível;
    public boolean autenticado;

    public Bomba(int num, String pass) {

        if (num == 5 && pass.equals("1234")) {
            autenticado = true;
        } else {
            autenticado = false;
        }
    }

    public void setCombustivel(int combustivel) {

        this.combustível = combustivel;
    }

    public String getCombustivel() {

        String retorno;

        switch (this.combustível) {
            case 1:
                retorno = "GASOLINA COMUM";
                break;

            case 2:
                retorno = "GASOLINA ADITIVADA";
                break;

            case 3:
                retorno = "ETANOL";
                break;
                
            case 4:
                retorno = "DIESEL";
                break;

            default:
                retorno = "NENHUM";
                break;
        }

        return retorno;

    }

}
