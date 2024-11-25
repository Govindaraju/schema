package org.gimpact.dto.common;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Schema(description = "Captures the details of a party involved in a trade")
public record PartyDetail(
        @Schema(description = "Unique identifier for the party", example = "f742d134-bbe5-4724-90e2-b6d95b37edaf") @NotNull UUID id,
        @Schema(description = "Name of the party", example = "ABC Securities Ltd.") @NotNull String name,
        @Schema(description = "Margin percentage that applies to the party", example = "0.13 that is 13%") @NotNull float marginPercentage
) {
}
