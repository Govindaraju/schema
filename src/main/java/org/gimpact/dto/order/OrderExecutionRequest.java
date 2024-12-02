package org.gimpact.dto.order;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import org.gimpact.dto.common.PartyDetail;

import java.math.BigDecimal;
import java.util.UUID;
@Schema(description = "Order execution request")
@Builder
public record OrderExecutionRequest(
        @Schema(description = "Unique identifier for the trade", example = "f742d134-bbe5-4724-90e2-b6d95b37edaf") @NotNull UUID orderId,
        @Schema(description = "Details of the party initiating the trade", example = "f742d134-bbe5-4724-90e2-b6d95b37edef") @NotNull UUID clientId,
        @Schema(description = "The instrument or stock symbol", example = "AAPL,AMZ") @NotNull String ticker,
        @Schema(description = "The quantity of the instrument in the trade", example = "100") @NotNull int quantity,
        @Schema(description = "The price at which the instrument is traded", example = "120.26") @NotNull BigDecimal price) {
}
