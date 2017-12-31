package it.contrader.sprint3.dao;

import it.contrader.sprint3.model.GommaEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface GommaRepository extends CrudRepository<GommaEntity, Long>
{
    List<GommaEntity> findAll();


}
