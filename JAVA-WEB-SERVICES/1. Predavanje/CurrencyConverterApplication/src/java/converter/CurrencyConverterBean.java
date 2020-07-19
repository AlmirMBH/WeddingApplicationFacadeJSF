package converter;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import javax.ejb.Stateless;

@Stateless
public class CurrencyConverterBean implements CurrencyConverterBeanRemote {
    
    public static final BigDecimal KURS_EUR = BigDecimal.valueOf(1.95);
     
    @Override
    public BigDecimal bamToEuro(BigDecimal bamAmount) {
        BigDecimal euroAmount = bamAmount.divide(KURS_EUR, 9, RoundingMode.HALF_UP);
        euroAmount = euroAmount.setScale(2, RoundingMode.HALF_UP);
        return euroAmount;
    }

    @Override
    public BigDecimal euroToBam(BigDecimal euroAmount) {
        BigDecimal bamAmount = euroAmount.multiply(KURS_EUR);
        bamAmount = bamAmount.setScale(2, RoundingMode.HALF_UP);
        return bamAmount;
    }
     
    
    
    
}
