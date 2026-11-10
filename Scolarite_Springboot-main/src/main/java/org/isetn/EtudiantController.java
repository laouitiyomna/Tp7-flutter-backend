package org.isetn;


import java.util.List;
import org.isetn.Etudiant;
import org.isetn.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class EtudiantController {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @GetMapping("/etudiants")
    public List<Etudiant> all() { return etudiantRepository.findAll(); }

    @GetMapping("/etudiants/classe/{codClass}")
    public List<Etudiant> byClasse(@PathVariable Integer codClass) {
        return etudiantRepository.findByClasseCodClass(codClass);
    }

    @PostMapping("/etudiants")
    public Etudiant save(@RequestBody Etudiant e) { return etudiantRepository.save(e); }

    @PutMapping("/etudiants/{id}")
    public Etudiant update(@PathVariable Integer id, @RequestBody Etudiant e) {
        e.setId(id);
        return etudiantRepository.save(e);
    }

    @DeleteMapping("/etudiants/{id}")
    public void delete(@PathVariable Integer id) { etudiantRepository.deleteById(id); }
}