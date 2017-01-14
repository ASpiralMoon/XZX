package hbi.core.salesOrder.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.salesOrder.dto.Customers;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/13.
 */
public interface CustomersMapper extends Mapper<Customers> {

    List<Customers> queryByParams(Customers customers);
}
