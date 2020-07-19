
package app;

import converter.CurrencyConverterBeanRemote;
import java.math.BigDecimal;
import javax.ejb.EJB;

public class Application {
    
    @EJB
    private static CurrencyConverterBeanRemote converterBeanRemote;

    public static void main(String[] args) {
                
        BigDecimal nekiIZnosEuro = BigDecimal.valueOf(1340.45);
        BigDecimal bamAmount = converterBeanRemote.euroToBam(nekiIZnosEuro);
        System.out.println("BAM Amount: " + bamAmount.toPlainString());
    }
    
}

