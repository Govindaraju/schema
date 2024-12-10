package org.gimpact.dto.trade;

import io.swagger.v3.oas.annotations.media.Schema;
import org.gimpact.dto.common.TradeOrderStatus;

import java.util.UUID;

@Schema(description = "Trade status response")
public record TradeOrderResponse(
        @Schema(description = "Trade Id")
        UUID tradeId,
        @Schema(description = "Trade Status")
        TradeOrderStatus tradeOrderStatus
) {
}
