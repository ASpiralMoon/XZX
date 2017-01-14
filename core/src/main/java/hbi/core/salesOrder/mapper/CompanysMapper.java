package hbi.core.salesOrder.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.salesOrder.dto.Companys;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/13.
 */
public interface CompanysMapper extends Mapper<Companys> {

    List<Companys> queryAll(Companys companys);
}
