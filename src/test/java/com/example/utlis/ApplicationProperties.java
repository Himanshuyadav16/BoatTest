package com.example.utlis;

import java.util.Properties;

public enum ApplicationProperties {
    INSTANCE;
 public Properties properties;

    ApplicationProperties(){
        properties=new Properties();
        try{
            properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));

        }catch(Exception e){

        }
    }
    public String getUrl(){
        return properties.getProperty("url");
    }


}
