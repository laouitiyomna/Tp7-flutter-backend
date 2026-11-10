package org.isetn;

import java.util.List;
import org.isetn.Formation;
import org.isetn.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class FormationController {
    @Autowired
    private FormationRepository formationRepository;

    @GetMapping("/formations")
    public List<Formation> all() { return formationRepository.findAll(); }

    @PostMapping("/formations")
    public Formation save(@RequestBody Formation f) { return formationRepository.save(f); }
}