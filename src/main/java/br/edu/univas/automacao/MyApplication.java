package br.edu.univas.automacao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Rubem
 */
@ApplicationPath("rest")
public class MyApplication extends ResourceConfig{
    public MyApplication(){
        packages("br.edu.univas.automacao.controllers");
    }
}
