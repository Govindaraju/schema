package org.gimpact.dto.v2.common;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SettlementDetails(
        @Schema(description = "Amount to be settled.") BigDecimal settledAmount,
        @Schema(description = "Timestamp when the settlement was completed.")
        LocalDateTime timestamp) {
}
