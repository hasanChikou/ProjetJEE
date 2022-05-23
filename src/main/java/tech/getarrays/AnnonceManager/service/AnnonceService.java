package tech.getarrays.AnnonceManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.getarrays.AnnonceManager.exception.AnnonceNotFoundException;
import tech.getarrays.AnnonceManager.model.Annonce;
import tech.getarrays.AnnonceManager.repo.AnnonceRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class AnnonceService {
    private final AnnonceRepo AnnonceRepo;

    @Autowired
    public AnnonceService(AnnonceRepo AnnonceRepo) {
        this.AnnonceRepo = AnnonceRepo;
    }

    public Annonce addAnnonce(Annonce Annonce) {
        return AnnonceRepo.save(Annonce);
    }

    public List<Annonce> findAllAnnonces() {
        return AnnonceRepo.findAll();
    }

    public Annonce updateAnnonce(Annonce Annonce) {
        return AnnonceRepo.save(Annonce);
    }

    public Annonce findAnnonceById(Long id) {
        return AnnonceRepo.findAnnonceById(id)
                .orElseThrow(() -> new AnnonceNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteAnnonce(Long id){
        AnnonceRepo.deleteAnnonceById(id);
    }
}
