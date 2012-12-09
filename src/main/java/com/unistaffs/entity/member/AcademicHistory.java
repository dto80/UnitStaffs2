package com.unistaffs.entity.member;

import javax.persistence.OneToOne;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class AcademicHistory {

    @DecimalMin("2480")
    @DecimalMax("2600")
    private int graduateYear;

    private String program;

    @NotNull
    private String department;

    @OneToOne
    private University university;

    private String otherUniversity;

    private String otherCountry;
}
