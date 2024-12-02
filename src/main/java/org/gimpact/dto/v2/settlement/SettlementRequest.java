package org.gimpact.dto.v2.settlement;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import org.gimpact.dto.v2.common.ClearedDetails;

import java.util.UUID;

public record SettlementRequest(
        @Schema(description = "Unique identifier for the trade")
        @NotNull UUID tradeId,
        @NotNull ClearedDetails clearedDetails
) {
}
