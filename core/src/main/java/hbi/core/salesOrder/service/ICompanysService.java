package hbi.core.salesOrder.service;

import hbi.core.salesOrder.dto.Companys;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/13.
 */
public interface ICompanysService  {

    List<Companys> queryAll(Companys companys);
}
