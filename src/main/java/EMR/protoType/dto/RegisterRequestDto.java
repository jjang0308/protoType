package EMR.protoType.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequestDto {
    private String patient_name;
    private int age;
    private int height;
    private int weight;
    private String user_id;
    private String password;
}
