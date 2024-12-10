package org.gimpact.dto.exchange;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import org.gimpact.dto.common.TradeOrderStatus;

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
