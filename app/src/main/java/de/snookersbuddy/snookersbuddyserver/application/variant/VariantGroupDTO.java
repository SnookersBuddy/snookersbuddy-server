package de.snookersbuddy.snookersbuddyserver.application.variant;



public record VariantGroupDTO(long id, String name) {

    public static VariantGroupDTO fromEntity(long id, String name) {
        return new VariantGroupDTO(id,name);
    }

}
