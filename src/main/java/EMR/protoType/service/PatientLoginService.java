package EMR.protoType.service;

import EMR.protoType.dto.LoginRequestDto;
import EMR.protoType.dto.RegisterRequestDto;
import EMR.protoType.entity.Patient;
import EMR.protoType.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.logging.XMLFormatter;

@Service
public class PatientLoginService {

    @Autowired
    private PatientRepository patientRepository;

    public void register(RegisterRequestDto registerRequestDto) {
        // 데이터 가공 조작 비즈니스 로직

        // DTO 받아서 Entity로 만들고
        // -> repo에 넘겨주면 repo가 저장을 하든 업뎃을 하든 삭제를 하든
        Patient patient = new Patient();

        // 이건 사용자한테 입력 받은거
        patient.setUser_id(registerRequestDto.getUser_id());
        patient.setPassword(registerRequestDto.getPassword());
        patient.setPatient_name(registerRequestDto.getPatient_name());
        patient.setAge(registerRequestDto.getAge());
        patient.setHeight(registerRequestDto.getHeight());
        patient.setWeight(registerRequestDto.getWeight());
        patientRepository.save(patient);
    }


}
