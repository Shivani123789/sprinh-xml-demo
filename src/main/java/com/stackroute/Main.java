package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //using chile id
        // using id of Movie --movie
        Movie movie = (Movie) context.getBean("movieA");
        System.out.println(movie.getActor().getActorname()+" acted in " +movie.getName());

        Resource resource=new ClassPathResource("beans.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        Movie movie1=(Movie)factory.getBean("movieA");
        System.out.println(movie1.getActor().getActorname()+" acted in " +movie1.getName());
        Resource resource1=new ClassPathResource("beans.xml");
        BeanFactory factory1=new XmlBeanFactory(resource1);
        Movie movie2=(Movie)factory1.getBean("movieB");
        System.out.println(movie1.getActor().getActorname()+" acted in " +movie1.getName());

       // testing beans scope
     //   ApplicationContext context1=new ClassPathXmlApplicationContext("beans.xml");
        //using chile id
        // using id of Movie --movie
//        Movie movie4 = (Movie) context1.getBean("movie");
//        Movie movie3 = (Movie) context1.getBean("movie");
//        System.out.println(movie3 == movie4);
//        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        Movie movie2=(Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie");
//        System.out.println(movie2.getActor().getActorname()+ " acted in: " + movie2.getName());
////
}
}
