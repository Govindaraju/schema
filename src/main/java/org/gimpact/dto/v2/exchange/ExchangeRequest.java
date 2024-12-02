package org.gimpact.dto.v2.exchange;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.UUID;

@Schema(description = "Exchange order request")
public record ExchangeRequest(
        @Schema(description = "Trade Id")
        UUID tradeId,
        @Schema(description = "The instrument or stock symbol")
        @NotNull String ticker,
        @Schema(description = "The quantity of the instrument in the trade")
        @NotNull int quantity,
        @Schema(description = "The price at which the instrument is traded")
        @NotNull BigDecimal price
) {
}
