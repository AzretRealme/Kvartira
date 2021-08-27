package House.services.impl;


import House.dao.PayHistoryRepo;
import House.mappers.PayHistoryMapper;
import House.models.dto.PayHistoryDto;
import House.models.entities.PayHistory;
import House.services.PayHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayHistoryServiceImpl implements PayHistoryService {
    @Autowired
    private PayHistoryRepo payHistoryRepo;


    @Override
    public PayHistoryDto save(PayHistoryDto payHistoryDto) {
        PayHistory payHistory = PayHistoryMapper.INSTANCE.toPayHistory(payHistoryDto);
        payHistory = payHistoryRepo.save(payHistory);
        return PayHistoryMapper.INSTANCE.toPayHistoryDto(payHistory);
    }

    @Override
    public PayHistoryDto update(PayHistoryDto payHistoryDto) {
        return null;
    }

    @Override
    public PayHistoryDto findById(Long id) {
        PayHistory payHistory = payHistoryRepo.findById(id).orElseThrow(()->new RuntimeException(" не найден!"));
        return PayHistoryMapper.INSTANCE.toPayHistoryDto(payHistory);
    }

    @Override
    public List<PayHistoryDto> findAll() {
        return null;
    }

    @Override
    public List<PayHistoryDto> findByReserveHistoryId(Long reserve_id) {
        List<PayHistory> payHistory = payHistoryRepo.findByReserveHistoryId(reserve_id);
        return PayHistoryMapper.INSTANCE.toPayHistoryDtoList(payHistory);
    }
}
