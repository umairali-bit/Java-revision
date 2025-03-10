package dev.external.domain;

import dev.lpa.PersonImmutable;

import java.util.Arrays;

public class LivingPerson extends PersonImmutable {

    public LivingPerson(String name, PersonImmutable[] kids) {
        super(name, null, kids == null ? new PersonImmutable[10] : Arrays.copyOf(kids, 10));
    }

    protected LivingPerson(PersonImmutable person) {
        super(person);
    }

    @Override
    public String getDob() {
        return null;
    }
}
