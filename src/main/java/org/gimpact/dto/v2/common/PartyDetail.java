package org.gimpact.dto.v2.common;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;
@Schema(description = "Captures the details of a party involved in a trade")
public record PartyDetail(
        @Schema(description = "Unique identifier for the party")
        @NotNull UUID id,
        @Schema(description = "Name of the party")
        @NotNull String name,
        @Schema(description = "Margin percentage that applies to the party", example = "0.13 that is 13%") @NotNull float marginPercentage
) {
}
