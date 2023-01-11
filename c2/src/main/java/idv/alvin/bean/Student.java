package idv.alvin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

    private String firstName;
    private String lastName;





    public String getFullName() {
        return firstName + " " + lastName;
    }
}
