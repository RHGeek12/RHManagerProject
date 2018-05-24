package com.ibntofail.rhmanager.model;

import java.util.Date;

public class GradeAdmninistratif implements Grade {
    private String nomGrade;
    private Date dateGrade;

    @Override
    public String GetnomGrade() {
        return nomGrade;
    }

    @Override
    public Date GetDateGrade() {
        return dateGrade;
    }

    @Override
    public String ToString() {
        return "Nom grade : " + nomGrade + " , Obtenu à la date : " + dateGrade + "\n";
    }
}
