package be.techfix.controllers;


import be.techfix.api.BabyApi;
import be.techfix.model.BabyDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BabyController implements BabyApi {

    @Override
    public ResponseEntity<BabyDetails> getBaby(String babyId) {
        BabyDetails babyDetails = new BabyDetails();
        babyDetails.setAge("1");
        babyDetails.setName("DummyBaby");
        return ResponseEntity.ok(babyDetails);
    }
}
