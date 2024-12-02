package org.gimpact.dto.v2.common;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Represents the status of a trade")
public enum TradeOrderStatus {
    @Schema(description = "Trade execution successful")
    SUCCESS("EXECUTED"),
    @Schema(description = "Trade cleared")
    FAILURE("CLEARED"),
    @Schema(description = "Trade settled")
    SETTLED("SETTLED"),
    @Schema(description = "Trade failed")
    FAILED("FAILED");
    private final String value;

    TradeOrderStatus(String value) {
        this.value = value;
    }
}