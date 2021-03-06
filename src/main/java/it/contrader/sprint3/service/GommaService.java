package it.contrader.sprint3.service;

import it.contrader.sprint3.dao.GommaRepository;
import it.contrader.sprint3.model.GommaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GommaService {

    private GommaRepository gommaRepository;

    @Autowired
    public GommaService(GommaRepository gommaRepository) {
        this.gommaRepository = gommaRepository;
    }

    public List<GommaEntity> getAllGomme() {
        return this.gommaRepository.findAll();
    }

    public GommaEntity insertGomma(GommaEntity gomma) {
        return this.gommaRepository.save(gomma);
    }

}
