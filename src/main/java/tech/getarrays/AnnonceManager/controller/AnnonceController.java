package tech.getarrays.AnnonceManager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tech.getarrays.AnnonceManager.model.Annonce;
import tech.getarrays.AnnonceManager.service.AnnonceService;

import java.util.List;

@RestController
@RequestMapping("/Annonce")
public class AnnonceController {
    private final AnnonceService AnnonceService;

    public AnnonceController(AnnonceService AnnonceService) {
        this.AnnonceService = AnnonceService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Annonce>> getAllAnnonces () {
        List<Annonce> Annonces = AnnonceService.findAllAnnonces();
        return new ResponseEntity<>(Annonces, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Annonce> getAnnonceById (@PathVariable("id") Long id) {
        Annonce Annonce = AnnonceService.findAnnonceById(id);
        return new ResponseEntity<>(Annonce, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Annonce> addAnnonce(@RequestBody Annonce Annonce) {
        Annonce newAnnonce = AnnonceService.addAnnonce(Annonce);
        return new ResponseEntity<>(newAnnonce, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Annonce> updateAnnonce(@RequestBody Annonce Annonce) {
        Annonce updateAnnonce = AnnonceService.updateAnnonce(Annonce);
        return new ResponseEntity<>(updateAnnonce, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAnnonce(@PathVariable("id") Long id) {
        AnnonceService.deleteAnnonce(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
