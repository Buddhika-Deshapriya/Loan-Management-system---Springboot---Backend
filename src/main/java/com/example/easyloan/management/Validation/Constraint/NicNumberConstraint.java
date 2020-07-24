package com.example.easyloan.management.Validation.Constraint;

import com.example.easyloan.management.Validation.Validator.NicNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NicNumberValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention( RetentionPolicy.RUNTIME)
public @interface NicNumberConstraint {
    String message() default "Invalid NIC number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
