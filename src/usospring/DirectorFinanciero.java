package usospring;

import org.springframework.stereotype.Component;

@Component
public class DirectorFinanciero implements Informe {


    @Override
    public String getDocument() {
        return " escrito por el director financiero";
    }


}
