/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itaujava10xapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;


    @RestController
    @RequestMapping("/transacao")       
        
public class TransacoesController {
        
        @Autowired // <-- Declara para não precisar usar o construtor (obs: não possui nenhuma diferença prática).
        private TransacaoService transacaoService; // <-- injeção de objeto para reconhecimento de método
        
        @PostMapping
        // a linha abaixo cria um método que responde a requisição que o usuário fizer.
        public  ResponseEntity  adicionar(@RequestBody TransacaoRequest transacaoRequest) {
            
              transacaoService.validarTransacao(transacaoRequest);              
            // Toda endpont/ requisição do tipo post que bater no barra transação vai dar criar.
          return ResponseEntity.status(HttpStatus.CREATED).build();
        
          
          
        }
        
        
}
