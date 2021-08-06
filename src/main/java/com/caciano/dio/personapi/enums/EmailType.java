package com.caciano.dio.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EmailType {

    PERSONAL("Personal"),
    COMMERCIAL("Commercial");

    private final String Description;
}
