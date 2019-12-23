package ru.bscgrand.api.Controllers;

import org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.bscgrand.api.CustomExceptions.MasterException;
import ru.bscgrand.api.Models.Master;
import ru.bscgrand.api.Repository.MasterRepository;
import ru.bscgrand.api.Repository.OilfieldRepository;
import ru.bscgrand.api.Repository.TeamRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/master")
public class MasterController {
    private final MasterRepository masterRepository;
    private final TeamRepository teamRepository;
    private final OilfieldRepository oilfieldRepository;
    @Autowired
    public MasterController(MasterRepository masterRepository, TeamRepository teamRepository, OilfieldRepository oilfieldRepository) {
        this.masterRepository = masterRepository;
        this.teamRepository = teamRepository;
        this.oilfieldRepository = oilfieldRepository;
    }

    @GetMapping("/all")
    public List<Master> getAllMasters(){return masterRepository.findAll();}

    @GetMapping("/{id}")
    public Master getMasterById(@PathVariable Long id){
        Optional<Master> master = masterRepository.findById(id);
        if(master.isEmpty())
            throw new MasterException(id + "not found");
        return master.get();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteMasterById(@PathVariable Long id){
        masterRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
