
package ex007;


public class Ex007 {


    public static void main(String[] args) {
        
        // Operadores Logico.
        // Usados para realizar operações lógica booleana
        // combinando ou avaliando valores booleanos.
        
        // existem 3 operadores lógicos principais
        //       &&(e)  || (ou)  !(não)   ^ (OU exclusivo)
        
        
        // Explicação: OU exclusivo
        
        // p | q | p ^ q |
        // v | v |   F   |
        // v | f |   V   |
        // f | v |   V   |
        // f | f |   F   |
        
        // o exemplo em questao, a operacao (OU Exclusivo)
        // retorna falso se toda espreçao for verdade
        // ou se toda esprecao for FALSA.
        
        // caso uma delas seja diferente o operador retorna VERDADE
        
        //---------------------------------------------------------------------
        
        
        // Ex com a operacao E
        // o resultado da operacao e falso
        // 1)
        
        int x, y, z;
        boolean r;
        
        x = 4;
        y = 7;
        z = 12;
        
        r = (x>y && y<z)?true:false;
        System.out.println(r);
        
        // Ex com operacao OU
        // 2)
        
        int a,b,c;
        boolean f;
        
        a = 4;
        b = 7;
        c = 12;
        
        f = (a<b || b==c)?true:false;
        System.out.println(f);
        
        // Ex com operacao OU exclusivo
        // 3)
                
        int d,e,g;
        boolean i;
        
        d = 4;
        e = 7;
        g = 12;
        
        i = (e<g ^ g==e)?true:false;
        System.out.println(i);
        
        
        
        
        
    }
    
}
