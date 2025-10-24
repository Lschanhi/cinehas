package br.com.etec.cinehas.controller;


import br.com.etec.cinehas.entity.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.etec.cinehas.repository.SalaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/salas")
public class SalaController
{
    @Autowired
    private SalaRepository repository;

    @GetMapping
   public List<Sala>listar()
   {
       return repository.findAll();
   }

   @GetMapping("/{id}")
   public Optional<Sala> buscarPorId( @PathVariable("id") Integer id)
   {
       var sala = repository.findById(id);
       if(sala.isPresent())
            return sala;

       return null;
   }
    @PostMapping
   public Sala cadastrar(@RequestBody Sala sala)
   {
       return repository.save(sala);
   }

   @PutMapping("/{id}")
   public Sala atualizar(@PathVariable ("id") Integer id,@RequestBody Sala sala )
   {
        if(id == sala.getId() && buscarPorId(id).isPresent())
        {
            return repository.save(sala);
        }
        return null;
   }
   @DeleteMapping("/{id}")
   public Sala deletar(@PathVariable("id")Integer id)
   {
       Optional<Sala> sala = buscarPorId(id);
        if(sala.isPresent())
        {
            repository.deleteById(id);
        }

        return(sala.get());
   }
}
