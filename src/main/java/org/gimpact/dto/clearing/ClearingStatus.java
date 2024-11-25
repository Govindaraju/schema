package org.gimpact.dto.clearing;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Represents the status of clearing")
public enum ClearingStatus {
    @Schema(description = "Clearing is successful")
    SUCCESS("SUCCESS"),
    @Schema(description = "Clearing has failed")
    FAILURE("FAILURE");
    private final String value;
    ClearingStatus(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    @Override
    public String toString() {
        return value;
    }
}
