package br.com.example.api.demo.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {

    @GetMapping("")
    public String mensagem(){
        return "Olá, mundo!";
    }
    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Seja bem-vindo!";
    }
    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome) {
        return "Seja bem-vindo, " + nome + "!";
    }
    
}
