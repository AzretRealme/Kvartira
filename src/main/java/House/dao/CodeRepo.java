package House.dao;


import House.models.entities.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeRepo extends JpaRepository<Code,Long> {
    Code findByUserId(Long id);
}
