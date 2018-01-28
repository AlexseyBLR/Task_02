package service;

import entity.SportEquipment;
import entity.criteria.Criteria;

public interface SportEquipmentService {

    <E> SportEquipment find(Criteria<E> criteria);
}
