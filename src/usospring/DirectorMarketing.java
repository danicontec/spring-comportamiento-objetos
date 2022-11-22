package usospring;

import org.springframework.stereotype.Component;

@Component
public class DirectorMarketing implements Informe{
    @Override
    public String getDocument() {
        return "Escrito por el director de Marketing";
    }


}
