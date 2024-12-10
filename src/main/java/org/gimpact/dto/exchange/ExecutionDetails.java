package org.gimpact.dto.exchange;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ExecutionDetails(
        @Schema(description = "The price at which the instrument is traded")
        @NotNull BigDecimal price,
        @Schema(description = "Time of execution")
        @NotNull LocalDateTime timeStamp) {
}
