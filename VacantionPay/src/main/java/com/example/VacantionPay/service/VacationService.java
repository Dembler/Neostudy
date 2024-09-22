package com.example.VacantionPay.service;

import com.example.VacantionPay.dto.VacationPayDTO;

import java.time.LocalDate;
import java.util.List;

public interface VacationService {
    VacationPayDTO calculate(int avgMonthlySalary, int vacationDays, List<LocalDate> dates);
}
