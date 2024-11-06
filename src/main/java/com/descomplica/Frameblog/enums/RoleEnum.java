package com.descomplica.Frameblog.enums;

public enum RoleEnum {
    ADMIN("ADMIN"),
    USER("user");

    private final String role;

    RoleEnum(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
