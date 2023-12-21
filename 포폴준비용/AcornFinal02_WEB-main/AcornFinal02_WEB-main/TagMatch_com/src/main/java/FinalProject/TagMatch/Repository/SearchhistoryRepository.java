package FinalProject.TagMatch.Repository;

import FinalProject.TagMatch.Entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchhistoryRepository extends JpaRepository<UserDetail, String> {
    List<UserDetail> findByUserNumber(Long userNumber);
}
