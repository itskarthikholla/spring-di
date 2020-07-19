package com.karthik.sfgdi;

import com.karthik.sfgdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext context  = SpringApplication.run(SfgDiApplication.class, args);

        I18nController controller = (I18nController) context.getBean("i18nController");
        System.out.println(controller.sayHello());

        MyController myController = (MyController) context.getBean("myController");
        System.out.println(myController.sayHello());

        System.out.println("------ Property");
        PropertyInjectedController propertyInjectedController =  (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println("From Property Inject" +propertyInjectedController.getGreeting());

        System.out.println("------ Setter");
        SetterBasedController setterBasedController = (SetterBasedController) context.getBean("setterBasedController");
        System.out.println("From setter inject "+setterBasedController.getGreeting());

        System.out.println("-------Constructor  ");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println("From Constructor "+constructorInjectedController.getGreeting());


    }

}
