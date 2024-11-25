package org.gimpact.dto.clearing;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import org.gimpact.dto.common.NetTrade;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Schema(description = "Response to clearing request")
@Builder
public record ClearingResponse(
        @Schema(description = "Unique identifier for the trade", example = "e462c66f-3c49-43ab-aabb-45238bbd5b25") UUID tradeId,
        @Schema(description = "Status of the clearing (e.g., 'SUCCESS', 'FAILED').", example = "SUCCESS") ClearingStatus status,
        @Schema(description = "Netted trades") List<NetTrade> netTrades,
        @Schema(description = "Obligations from party and counterparty") Map<String, BigDecimal> obligations,
        @Schema(description = "Timestamp when the trade was cleared", example = "2024-11-24T10:15:30") LocalDateTime clearingTimestamp) {
}
