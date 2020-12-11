package ru.mtusi.lab1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.SafeHtml;


import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class tbl_phonenumber extends AbctractBaseEntity{
    @NotBlank
    @SafeHtml
    private Long tbluseruid;
    @NotNull
    private String phonenumber ;
}
