package com.freemind.creativeservices.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document
@ApiModel("All details about user")
public class User /*extends RepresentationModel<User>*/ {

    @Id
    private String userId;
    @Size(min=4)
    @ApiModelProperty(notes = "Name should be min 4 chars")
    private String name;
    @Past
    @ApiModelProperty(notes = "Birthdate cannot be in past")
    private Date birthDate;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
