package usospring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Informe emp1 = context.getBean("directorFinanciero", DirectorFinanciero.class);
        Informe emp2 = context.getBean("directorMarketing", DirectorMarketing.class);
        Informe emp3 = context.getBean("directorFinanciero", DirectorFinanciero.class);

        //Comprobando como trabaja Spring con dos objetos diferentes pero tres instancias.

        System.out.println("El informe fue" + emp1.getDocument());
        System.out.println("El informe fue" + emp2.getDocument());
        System.out.println(emp1==emp2);
        System.out.println(emp1==emp3);

    }
}