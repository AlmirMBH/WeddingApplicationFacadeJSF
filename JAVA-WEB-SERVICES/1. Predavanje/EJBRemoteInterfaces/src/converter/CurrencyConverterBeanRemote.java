package converter;

import java.math.BigDecimal;
import javax.ejb.Remote;

@Remote
public interface CurrencyConverterBeanRemote {
    
    // Konverzija BAM u EUR; param bamAmount, return euroAmount    
    public BigDecimal bamToEuro(BigDecimal bamAmount);
    
    // Konverzija EUR u BAM; param euroAmount, return bamAmount    
    public BigDecimal euroToBam(BigDecimal euroAmount);

    
}
