package org.gimpact.dto.settlement;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import org.gimpact.dto.common.PartyDetail;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
public record SettlementRequest(
        @Schema(description = "Unique identifier for the trade")
        @NotNull UUID tradeId,
        @NotNull @Positive BigDecimal partyObligation,
        @NotNull @Positive BigDecimal counterpartyObligation,
        @NotNull PartyDetail party,
        @NotNull PartyDetail counterparty
) {
}
