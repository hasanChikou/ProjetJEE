package tech.getarrays.AnnonceManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.AnnonceManager.model.Annonce;

import java.util.Optional;

public interface AnnonceRepo extends JpaRepository<Annonce, Long> {
    void deleteAnnonceById(Long id);

    Optional<Annonce> findAnnonceById(Long id);
}
