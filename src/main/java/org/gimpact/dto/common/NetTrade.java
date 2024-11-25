package org.gimpact.dto.common;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record NetTrade(
        @Schema(description = "The instrument or stock symbol", example = "AAPL,AMZ") @NotNull String ticker,
        @Schema(description = "Net quantity", example = "86") @NotNull int netQuantity,
        @Schema(description = "Net amount", example = "86") @NotNull BigDecimal netAmount
) {
}
