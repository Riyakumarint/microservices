package com.microservices.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {
    @NotEmpty(message = "Account number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Account number must be 10 digits")
    @Schema(
            description = "Account number of Riya Bank"
    )
    private Long accountNumber;

    @Schema(
            description = "Account type of Riya Bank",
            example = "Savings"
    )
    @NotEmpty(message = "AccountType cannot be null or empty")
    private String accountType;

    @Schema(
            description = "Riya Bank branch address"
    )
    @NotEmpty(message = "BranchAddress cannot be null or empty")
    private String branchAddress;
}
