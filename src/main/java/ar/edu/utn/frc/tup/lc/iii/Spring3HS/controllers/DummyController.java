package ar.edu.utn.frc.tup.lc.iii.Spring3HS.controllers;

import ar.edu.utn.frc.tup.lc.iii.Spring3HS.dtos.DummyDtos;
import ar.edu.utn.frc.tup.lc.iii.Spring3HS.models.Dummy;
import ar.edu.utn.frc.tup.lc.iii.Spring3HS.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dummy")
public class DummyController {
    @Autowired

    private DummyService dummyService;

    @GetMapping("")
    public ResponseEntity<DummyDtos> getDummy() {
        List<Dummy> dummyList = dummyService.getDummyList();
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DummyDtos> getDummyList(@PathVariable Long id) {
        Dummy dummy = dummyService.getDummy(id);
        return null;
    }

    @PostMapping("")
    public ResponseEntity<DummyDtos> postDummy(DummyDtos dummyDtos) {
        Dummy dummy = dummyService.createDummy(null);
        return null;
    }

    @PutMapping("")
    public ResponseEntity<DummyDtos> putDummy(DummyDtos dummyDtos) {
        Dummy dummy = dummyService.updateDummy(null);
        return null;
    }

    @DeleteMapping("")
    public ResponseEntity<Void> deleteDummy(DummyDtos dummyDtos) {
        dummyService.deleteDummy(null);
        return null;
    }
}
