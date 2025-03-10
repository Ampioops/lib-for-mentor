package com.lib_for_mentor.lib_for_mentor.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Accessors(chain = true)
@Builder
public class SubscriptionRequest {
    private Integer userId;
    private String type;
    private Integer referenceId;
    private LocalDateTime createdAt;
}
