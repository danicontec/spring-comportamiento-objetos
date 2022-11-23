package usospring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DirectorMarketing implements Informe{


    @Override
    public String getDocument() {
        return "Escrito por el director de Marketing";
    }


}
