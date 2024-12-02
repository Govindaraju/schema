package org.gimpact.dto.v2.settlement;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import org.gimpact.dto.v2.common.SettlementDetails;
import org.gimpact.dto.v2.common.TradeOrderStatus;

import java.util.UUID;

public record SettlementResponse(
        @Schema(description = "Unique identifier for the trade")
        @NotNull UUID tradeId,
        @Schema(description = "Trade Status")
        TradeOrderStatus tradeOrderStatus,
        @Schema(description = "settlementDetails")
        SettlementDetails settlementDetails) {
}
