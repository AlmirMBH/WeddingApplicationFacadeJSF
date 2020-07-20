
package beans.validators;

import javax.faces.application.FacesMessage;
/*import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("divisibleByThreeValidator")
public class DivisibleByThreeValidator implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        
        try{
            int number = Integer.parseInt(String.valueOf(value));            
            if((number % 3) != 0){
                throw new ValidatorException(new FacesMessage("Invalid input", "Numbers divisible by 3 only allowed"));
            }            
        }catch(NumberFormatException | ValidatorException exception){
            throw new ValidatorException(new FacesMessage("Invalid input", exception.getMessage()));
        }
    }    
}
*/