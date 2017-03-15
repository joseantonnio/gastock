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
    public String mensagem;

    public Bomba(int num, String pass) {

        if (num == 5 && pass.equals("1234")) {
            mensagem = "Bomba " + num + " conectada com sucesso!";
        } else {
            mensagem = "Número ou senha da bomba incorretos!";
        }
    }

    public void setCombustivel(String nome) {

        switch (nome) {
            case "gasolina":
                this.combustível = 1;
                break;

            case "alcool":
                this.combustível = 2;
                break;

            case "diesel":
                this.combustível = 3;
                break;

            default:
                System.out.println("Combustível não identificado!");
                break;
        }
    }

    public String getCombustivel() {

        String retorno;

        switch (this.combustível) {
            case 1:
                retorno = "Gasolina";
                break;

            case 2:
                retorno = "Álcool";
                break;

            case 3:
                retorno = "Diesel";
                break;

            default:
                retorno = "Nenhum combustível ativo!";
                break;
        }

        return retorno;

    }

}
