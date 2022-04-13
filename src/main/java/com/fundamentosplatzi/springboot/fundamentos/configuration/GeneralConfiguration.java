package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithPropertiesImplement;
import com.fundamentosplatzi.springboot.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;

    @Value("${value.apellido}")
    private String apellido;

    @Value("${value.random}")
    private String random;

    @Bean
    public MyBeanWithProperties function(){
        return new MyBeanWithPropertiesImplement(name, apellido);
    }

    @Bean
    //configuracion a nivel de base de datos
    //cuando se inyecte_todo_como_dep_se_puede_usar_toda_la_configuracion
   public DataSource dataSource(){
       DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();//implementacion de base de datos a nivel de propertis y a nivel de clases como aqui
        dataSourceBuilder.driverClassName("org.h2.Driver");//esto es lo que puse en el pom
       dataSourceBuilder.url("jdbc:h2:mem:test");//url a nivel de base de datos
      dataSourceBuilder.username("SA");//nombre de usuario
       dataSourceBuilder.password("");//contraseña
       return dataSourceBuilder.build();
   }

}
