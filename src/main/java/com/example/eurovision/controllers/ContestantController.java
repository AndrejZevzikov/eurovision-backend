package com.example.eurovision.controllers;

import com.example.eurovision.entities.Contestant;
import com.example.eurovision.repositories.ContestantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/contestants")
@CrossOrigin(origins = "http://localhost:4200")
public class ContestantController {

    private final ContestantRepository contestantRepository;

    @Autowired
    public ContestantController(ContestantRepository contestantRepository) {
        this.contestantRepository = contestantRepository;
    }

    @GetMapping
    public List<Contestant> getContestants(){
        return contestantRepository.findAll();
    }

    @GetMapping("{id}")
    public Contestant getContestant(@PathVariable Long id) {
        return contestantRepository.findById(id).get();
    }

    @PostMapping
    public void saveContestants(@RequestBody List<Contestant> contestants){
        contestantRepository.saveAll(contestants);
    }

    @PostMapping("{id}")
    public void saveContestants(@RequestBody Contestant contestant){
        contestantRepository.save(contestant);
    }

    @PutMapping("{id}")
    public void updateContestant(@PathVariable Long id, @RequestBody Contestant contestant){
        contestantRepository.save(contestant);
        //TODO reiks optimizuoti
    }

    @DeleteMapping("{id}")
    public void deleteContestant(@PathVariable Long id){
        contestantRepository.delete(getContestant(id));
    }
}
