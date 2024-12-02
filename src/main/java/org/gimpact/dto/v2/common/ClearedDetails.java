package org.gimpact.dto.v2.common;

import java.math.BigDecimal;

public record ClearedDetails(
        BigDecimal partyObligation,
        BigDecimal counterpartyObligation) {
}
