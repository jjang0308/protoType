package EMR.protoType.service;

import EMR.protoType.dto.RegisterRequestDto;
import EMR.protoType.entity.Patient;
import EMR.protoType.repository.PatientRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import EMR.protoType.service.PatientLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PatientLoginServiceTest {


    @Autowired
    private PatientRepository patientRepository;

    @Test
    void testRegister() {
        RegisterRequestDto rDto = new RegisterRequestDto("userA",12,120,100,"Id","0000");
        Patient patient = new Patient();
        patient.setUser_id(rDto.getUser_id());
        patient.setPassword(rDto.getPassword());
        patient.setPatient_name(rDto.getPatient_name());
        patient.setAge(rDto.getAge());
        patient.setHeight(rDto.getHeight());
        patient.setWeight(rDto.getWeight());
        patientRepository.save(patient);
        assertThat(patient.getUser_id()).isEqualTo(rDto.getUser_id());
    }

}