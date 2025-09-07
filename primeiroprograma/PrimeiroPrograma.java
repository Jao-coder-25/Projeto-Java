package primeiroprograma;
import java.util.Date;
import java.util.Locale;
public class PrimeiroPrograma {
    public static void main(String[] args) {
        System.out.print("Olá, Mundo.. ");
        System.out.println("Logo logo estarei no mercado de trabalho programando em backend!"); 
        Date agora = new Date();
        System.out.println("Testarei a bibliboteca 'Date' abaixo..");
        System.out.println("=" .repeat(20));
        System.out.println("Data atual: " + agora);
        System.out.println("Testarei a bibliboteca 'Locale' abaixo..");
        System.out.println("=".repeat(20));
        Locale idioma = Locale.getDefault();
        System.out.println("Idioma do sistema é: " + idioma.getDisplayLanguage());
        System.out.println("Código ISO: " + idioma.getLanguage());
        System.out.println("País: " + idioma.getDisplayCountry());

    }
}

// Locale.getDefault() → pega a configuração regional do sistema operacional.
// getDisplayLanguage() → mostra o nome da linguagem
// getLanguage() → dá o código ISO da língua
// getDisplayCountry() → mostra o país