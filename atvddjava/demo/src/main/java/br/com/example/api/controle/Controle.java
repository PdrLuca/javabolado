package br.com.example.api.controle;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.api.modelo.Pessoa;
import br.com.example.api.repositorio.Repositorio;





@RestController
public class Controle {

    private final Repositorio acao;

    Controle(Repositorio acao) {
        this.acao = acao;
    }
    
    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa obj) {
        return acao.save(obj);
    }
    
    

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
        return "Seja bem-vindo, " +nome;
    }

    @GetMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p) {
        return p;
    }

}
