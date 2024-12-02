package org.gimpact.dto.v2.trade;

import io.swagger.v3.oas.annotations.media.Schema;
import org.gimpact.dto.v2.common.TradeOrderStatus;

import java.util.UUID;

@Schema(description = "Trade status response")
public record TradeOrderResponse(
        @Schema(description = "Trade Id")
        UUID tradeId,
        @Schema(description = "Trade Status")
        TradeOrderStatus tradeOrderStatus
) {
}
