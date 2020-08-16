package com.example.easyloan.management.Validation.Validator;

import com.example.easyloan.management.Validation.Constraint.NicNumberConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NicNumberValidator implements
        ConstraintValidator<NicNumberConstraint, String> {

    @Override
    public void initialize(NicNumberConstraint nicNumber) {
    }

    @Override
    public boolean isValid(String nicField,
                           ConstraintValidatorContext cxt) {
        return (nicField.matches("^[0-9]{10}[vVxX]$")
                && (nicField.length() == 10)) || (nicField.length() == 12 && nicField.matches("[0-9]{12}$")); }

}