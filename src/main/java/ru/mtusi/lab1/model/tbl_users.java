package ru.mtusi.lab1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.SafeHtml;


import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class tbl_users extends AbctractBaseEntity{
    @NotBlank
    @SafeHtml
    private String firstname;
    @NotBlank
    @SafeHtml
    private String lastname;
    @NotBlank
    @SafeHtml
    private String surname;
    @NotBlank
    @SafeHtml
    private Character gender;
}
