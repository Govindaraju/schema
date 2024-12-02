package org.gimpact.dto.order;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Schema(description = "Response to order execution request")
@Builder
public record OrderExecutionResponse(
        @Schema(description = "Unique identifier for the trade", example = "f742d134-bbe5-4724-90e2-b6d95b37edaf") @NotNull UUID orderId,
        @Schema(description = "The price at which the instrument is traded", example = "120.26") @NotNull BigDecimal executedPrice,
        @Schema(description = "The exchange where the order was executed", example = "LSE") @NotNull String exchangeId,
        @Schema(description = "Time when the trade was executed", example = "2024-11-24T10:15:30") @NotNull LocalDateTime executionTime) {
}
