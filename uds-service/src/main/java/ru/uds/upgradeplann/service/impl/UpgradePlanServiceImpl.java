package ru.uds.upgradeplann.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.uds.upgradeplann.controller.UpgradePlanController;
import ru.uds.upgradeplann.dto.request.UpgradePlanRequestDto;
import ru.uds.upgradeplann.dto.response.UpgradePlanResponseDto;
import ru.uds.upgradeplann.model.UpgradePlan;
import ru.uds.upgradeplann.repository.UpgradePlanRepository;
import ru.uds.upgradeplann.service.UpgradePlanService;

import java.time.LocalDateTime;

@Service
public class UpgradePlanServiceImpl implements UpgradePlanService {

    private final UpgradePlanRepository upgradePlanRepository;

    @Autowired
    UpgradePlanServiceImpl(UpgradePlanRepository upgradePlanRepository) {
        this.upgradePlanRepository = upgradePlanRepository;
    }

    @Override
    public UpgradePlanResponseDto saveUpgradePlan(UpgradePlanRequestDto upgradePlanRequest) {
        UpgradePlan upgradePlan = new UpgradePlan();
        upgradePlan.setName(upgradePlanRequest.getName());
        upgradePlan.setDateTime(LocalDateTime.now());
        upgradePlan.setResourceLimit(upgradePlanRequest.getResourceLimit());

        UpgradePlan savedUpgradePlan = upgradePlanRepository.save(upgradePlan);
        return new UpgradePlanResponseDto(savedUpgradePlan);
    }
}
