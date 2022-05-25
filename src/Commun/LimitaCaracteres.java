
package Commun;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitaCaracteres extends PlainDocument{
    
    public enum TipoEntrada{
        NUMEROINTEIRO, NUMERODECIMAL, NOME, EMAIL, DATA, COMPL;
    }
    
    private int qtdCaracteres;
    private TipoEntrada tpEntrada;

    public LimitaCaracteres(int qtdCaracteres, TipoEntrada tpEntrada) {
        this.qtdCaracteres = qtdCaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int i, String string, AttributeSet a) throws BadLocationException {
        if (string ==null || getLength() == qtdCaracteres){
            return;
        }
        int totalCarac = getLength() + string.length();
        
        String regex = "";
        switch(tpEntrada){
            case NUMEROINTEIRO: regex = "[^0-9]"; break;
            case NUMERODECIMAL: regex = "[^0-9,.]"; break;
            case NOME: regex = "[^\\p{IsLatin}]"; break;
            case EMAIL: regex ="[^\\p{IsLatin}@.\\-_][^0-9]"; break;
            case DATA: regex = "[^0-9/]"; break;
            case COMPL: regex = "[^\\p{IsLatin}[^0-9]"; break;
        }
        
        string = string.replaceAll(regex, "");
        
        if(totalCarac <= qtdCaracteres){
            super.insertString(i, string, a); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }else{
            String nova = string.substring(0, qtdCaracteres);
        }
        
        
    }
    
    
    
}
