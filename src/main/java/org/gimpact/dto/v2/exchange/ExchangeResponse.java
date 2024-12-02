package org.gimpact.dto.v2.exchange;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import org.gimpact.dto.v2.common.TradeOrderStatus;

import java.util.UUID;

@Schema(description = "Exchange order response")
public record ExchangeResponse(
        @Schema(description = "Trade Id")
        UUID tradeId,
        @Schema(description = "Trade status")
        @NotNull TradeOrderStatus tradeOrderStatus,
        @Schema(description = "Trade execution details")
        @NotNull ExecutionDetails executionDetails) {
}
