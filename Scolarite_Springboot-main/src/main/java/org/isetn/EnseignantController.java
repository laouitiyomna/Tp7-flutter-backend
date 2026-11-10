package org.isetn;



import java.util.List;
import org.isetn.Enseignant;
import org.isetn.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class EnseignantController {
    @Autowired
    private EnseignantRepository enseignantRepository;

    @GetMapping("/enseignants")
    public List<Enseignant> all() { return enseignantRepository.findAll(); }

    @PostMapping("/enseignants")
    public Enseignant save(@RequestBody Enseignant e) { return enseignantRepository.save(e); }

    @PutMapping("/enseignants/{id}")
    public Enseignant update(@PathVariable Integer id, @RequestBody Enseignant e) {
        e.setId(id);
        return enseignantRepository.save(e);
    }

    @DeleteMapping("/enseignants/{id}")
    public void delete(@PathVariable Integer id) { enseignantRepository.deleteById(id); }
}