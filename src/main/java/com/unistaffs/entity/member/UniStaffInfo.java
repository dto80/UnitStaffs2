package com.unistaffs.entity.member;

import java.util.Calendar;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class UniStaffInfo {

    @NotNull
    private String name;

    @NotNull
    private String surName;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar birthDate;

    @NotNull
    private String nationality;

    @NotNull
    private String telNumber;

    @NotNull
    @Pattern(regexp = "[0-9]13")
    private String pID;

    private String expertise;

    @ManyToOne
    private NamePrefix namePrefix;

    @ManyToOne
    private BloodType bloodType;

    @NotNull
    @ManyToOne
    private Address registrationAddress;

    @ManyToOne
    private Address contactAddress;

    @ManyToOne
    private WorkPlace workPlace;

    @ManyToOne
    private WorkType workType;

    @ManyToOne
    private EmployeeType employeeType;

    @ManyToOne
    private AcademicPosition academicPosition;

    @ManyToOne
    private Salary salary;

    @ManyToOne
    private AcademicHistory bachalorDegree;

    @ManyToOne
    private AcademicHistory masterDegree;

    @ManyToOne
    private AcademicHistory phdDegree;
}
