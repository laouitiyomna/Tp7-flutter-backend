package org.isetn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ClasseController {
    @Autowired
    private ClasseRepository classeRepository;

    @GetMapping("/classes")
    public List<Classe> all() { return classeRepository.findAll(); }

    @PutMapping("/classes/{id}")
    public Classe update(@PathVariable Integer id, @RequestBody Classe c) {
        c.setCodClass(id);
        return classeRepository.save(c);
    }

    @DeleteMapping("/classes/{id}")
    public void delete(@PathVariable Integer id) { classeRepository.deleteById(id); }

    @PostMapping("/classes")
    public Classe save(@RequestBody Classe c) { return classeRepository.save(c); }
}