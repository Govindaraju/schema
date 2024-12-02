package org.gimpact.dto.v2.trade;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import org.gimpact.dto.v2.common.PartyDetail;

import java.math.BigDecimal;
import java.util.UUID;

public record TradeOrderRequest(
        @Schema(description = "Client ID for the party initiating the trade")
        @NotNull UUID partyClientId,
        @Schema(description = "The instrument or stock symbol")
        @NotNull String ticker,
        @Schema(description = "The quantity of the instrument in the trade")
        @NotNull int quantity,
        @Schema(description = "The price at which the instrument is traded")
        @NotNull BigDecimal price,
        @Schema(description = "Party initiating the trade")
        @NotNull PartyDetail party,
        @Schema(description = "Counterparty of the trade")
        @NotNull PartyDetail counterParty) {
}
