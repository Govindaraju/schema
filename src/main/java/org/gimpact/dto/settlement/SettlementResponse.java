package org.gimpact.dto.settlement;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import org.gimpact.dto.common.TradeOrderStatus;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record SettlementResponse(
        @Schema(description = "Unique identifier for the trade")
        @NotNull UUID tradeId,
        @Schema(description = "Settlement Status")
        TradeOrderStatus tradeOrderStatus,
        @Schema(description = "Settlement date")
        LocalDateTime settlementDate) {
}
