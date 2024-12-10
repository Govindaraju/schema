package org.gimpact.dto.clearing;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import org.gimpact.dto.common.NettingDetails;
import org.gimpact.dto.common.TradeOrderStatus;

import java.util.UUID;

public record ClearingResponse(
        @Schema(description = "Unique identifier for the trade")
        @NotNull UUID tradeId,
        @Schema(description = "Trade Status")
        TradeOrderStatus tradeOrderStatus,
        @Schema(description = "Netting details")
        NettingDetails nettingDetails) {
}
