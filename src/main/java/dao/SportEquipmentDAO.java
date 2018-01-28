package dao;

import entity.criteria.Criteria;
import entity.SportEquipment;


public interface SportEquipmentDAO {

	<E> SportEquipment find(Criteria<E> criteria) ;





}
