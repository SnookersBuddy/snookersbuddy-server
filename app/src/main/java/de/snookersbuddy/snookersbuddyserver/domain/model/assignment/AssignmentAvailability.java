package de.snookersbuddy.snookersbuddyserver.domain.model.assignment;

public enum AssignmentAvailability {
    /**
     * The assignment is free and can be assigned.
     */
    FREE,

    /**
     * The assignment is reserved by a customer but not yet occupied.
     */
    RESERVED,

    /**
     * The assignment is occupied by persons (probably customers).
     */
    OCCUPIED,

    /**
     * The assignment is blocked for usage (e.g. broken).
     */
    BLOCKED
}
