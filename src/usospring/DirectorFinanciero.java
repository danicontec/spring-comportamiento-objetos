package usospring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DirectorFinanciero implements Informe {


    @Override
    public String getDocument() {

        return " escrito por el director financiero";
    }


}
