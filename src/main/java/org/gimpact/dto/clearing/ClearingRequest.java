package org.gimpact.dto.clearing;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import org.gimpact.dto.common.PartyDetail;

import java.math.BigDecimal;
import java.util.UUID;

@Schema(description = "Clearing request for a trade")
public record ClearingRequest(
        @Schema(description = "Unique identifier for the trade")
        @NotNull UUID tradeId,
        @Schema(description = "Trade execution price")
        @NotNull BigDecimal executedPrice,
        @Schema(description = "The quantity of the instrument in the trade")
        @NotNull int quantity,
        @Schema(description = "Details of the party initiating the trade")
        @NotNull PartyDetail party,
        @Schema(description = "Counterparty of the trade")
        @NotNull PartyDetail counterparty
) {
}
