package com.hugosoares.bookstoremanager.dto;

import lombok.Builder;
import lombok.Data;

//Anotações do lombok
@Data // Geters e Seters
@Builder
public class MessageResponseDTO {

    private String message;

}
