package EMR.protoType.controller;

import EMR.protoType.dto.LoginRequestDto;
import EMR.protoType.dto.RegisterRequestDto;
import EMR.protoType.service.PatientLoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final PatientLoginService patientLoginService;

    //회원 가입하는 기능
    @PostMapping("/register")
    public void userRegister(@RequestBody RegisterRequestDto registerRequestDto) {
        patientLoginService.register(registerRequestDto);
    }


//    @GetMapping
//    public void userLogin(@RequestBody LoginRequestDto loginRequestDto) {
//        patientLoginService.r(loginRequestDto);
//    }
}
