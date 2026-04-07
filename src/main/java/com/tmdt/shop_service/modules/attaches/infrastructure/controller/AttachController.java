package com.tmdt.shop_service.modules.attaches.infrastructure.controller;

import com.tmdt.shop_service.modules.attaches.domain.repo.AttachRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "Attaches controller")
public class AttachController {
    final AttachRepository attachRepository;
}
