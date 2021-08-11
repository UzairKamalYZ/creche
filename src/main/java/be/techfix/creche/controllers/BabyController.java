package be.techfix.creche.controllers;


import java.util.UUID;

import javax.transaction.Transactional;
import javax.validation.Valid;

import be.techfix.api.BabyApi;
import be.techfix.creche.model.Baby;
import be.techfix.model.BabyDetails;
import be.techfix.model.BabySaveForm;
import be.techfix.model.InlineResponse201;
import be.techfix.creche.persistence.BabyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BabyController implements BabyApi {

    @Autowired
    private BabyRepository babyRepository;

    @Override
    public ResponseEntity<BabyDetails> getBaby(String babyId) {
        BabyDetails babyDetails = new BabyDetails();
        babyDetails.setAge("1");
        babyDetails.setName("DummyBaby");
        return ResponseEntity.ok(babyDetails);
    }

    @Override
    @Transactional
    public ResponseEntity<InlineResponse201> saveBaby(@Valid BabySaveForm babySaveForm) {
        UUID identifier = UUID.randomUUID();
        Baby baby = new Baby(babySaveForm.getName(), babySaveForm.getAge(), Baby.Gender.valueOf(babySaveForm.getGender()));
        babyRepository.saveAndFlush(baby);
        InlineResponse201 inlineResponse201 = new InlineResponse201();
        inlineResponse201.setId(baby.getIdentifier().toString());
        return ResponseEntity.status(201).body(inlineResponse201);
    }
}
