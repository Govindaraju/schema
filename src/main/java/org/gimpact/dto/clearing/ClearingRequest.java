package org.gimpact.dto.clearing;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import org.gimpact.dto.common.PartyDetail;

import java.math.BigDecimal;
import java.util.UUID;

@Schema(description = "Clearing request for a trade")
public record ClearingRequest(
        @Schema(description = "Unique identifier for the trade", example = "f742d134-bbe5-4724-90e2-b6d95b37edaf") @NotNull UUID tradeId,
        @Schema(description = "Details of the party initiating the trade", example = "ABC Securities Ltd.") @NotNull PartyDetail party,
        @Schema(description = "Counterparty of the trade", example = "XYZ Securities Ltd.") @NotNull PartyDetail counterparty,
        @Schema(description = "The instrument or stock symbol", example = "AAPL,AMZ") @NotNull String ticker,
        @Schema(description = "The quantity of the instrument in the trade", example = "100") @NotNull int quantity,
        @Schema(description = "The price at which the instrument is traded", example = "120.26") @NotNull BigDecimal price
) {
}
