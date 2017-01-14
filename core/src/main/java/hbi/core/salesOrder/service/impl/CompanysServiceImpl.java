package hbi.core.salesOrder.service.impl;

import hbi.core.salesOrder.dto.Companys;
import hbi.core.salesOrder.mapper.CompanysMapper;
import hbi.core.salesOrder.service.ICompanysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/13.
 */
@Service
public class CompanysServiceImpl implements ICompanysService {

    @Autowired
    private CompanysMapper companysMapper;

    @Override
    public List<Companys> queryAll(Companys companys) {
        return companysMapper.queryAll(companys);
    }
}
