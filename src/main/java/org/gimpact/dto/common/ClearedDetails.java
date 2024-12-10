package org.gimpact.dto.common;

import java.math.BigDecimal;

public record ClearedDetails(
        BigDecimal partyObligation,
        BigDecimal counterpartyObligation) {
}
