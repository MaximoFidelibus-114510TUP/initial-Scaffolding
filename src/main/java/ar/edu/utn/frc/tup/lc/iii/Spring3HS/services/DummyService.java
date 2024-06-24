package ar.edu.utn.frc.tup.lc.iii.Spring3HS.services;

import ar.edu.utn.frc.tup.lc.iii.Spring3HS.models.Dummy;

import java.util.List;

public interface DummyService {

    Dummy getDummy(Long id);

    List<Dummy> getDummyList();

    Dummy createDummy(Dummy dummy);

    Dummy updateDummy(Dummy dummy);

    void deleteDummy(Dummy dummy);
}
