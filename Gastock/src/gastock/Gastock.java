package gastock;
import java.util.Scanner;

/**
 * Classe Principal 
 * @author José Silva
 */
public class Gastock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String bomba;
        String senha;
        String combustivel;
        
        System.out.println("=-=-=- GASTOCK -=-=-=");
        
        System.out.print("Número: ");
        bomba = entrada.next();
        
        System.out.print("Senha: ");
        senha = entrada.next();
        
        Bomba b = new Bomba(Integer.parseInt(bomba), senha);
      
        System.out.print("Combustível: ");
        combustivel = entrada.next();
        b.setCombustivel(combustivel);
        
        System.out.print("Você ativou: "+b.getCombustivel());
        
    }
    
}
