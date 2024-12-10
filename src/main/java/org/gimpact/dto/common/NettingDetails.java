package org.gimpact.dto.common;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

public record NettingDetails(
        BigDecimal partyObligation,
        BigDecimal counterpartyObligation,
        BigDecimal marginRequired) {
}
