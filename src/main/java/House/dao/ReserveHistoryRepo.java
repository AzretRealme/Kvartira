package House.dao;


import House.models.entities.ReserveHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReserveHistoryRepo extends JpaRepository<ReserveHistory,Long> {
}
