package com.digitalholics.iotheraphy.Therapy.domain.persistence;

import com.digitalholics.iotheraphy.Therapy.domain.model.entity.Appointment;
import com.digitalholics.iotheraphy.Therapy.domain.model.entity.Therapy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TherapyRepository extends JpaRepository<Therapy, Integer> {

    List<Therapy> findTherapyByPatientId(Integer patientId);

    @Query("select a from Therapy  a where a.patient.id = :patientId and a.finished = false")
    Therapy findActiveTherapyByPatientId(Integer patientId);

    @Query("select a from Therapy a where  a.patient.id = :patientId and a.physiotherapist.id = :physiotherapistId and a.finished = false")
    Therapy findTherapyByPhysiotherapistIdAndPatientId(Integer physiotherapistId, Integer patientId);

}
