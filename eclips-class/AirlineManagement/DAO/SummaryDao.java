package DAO;

import java.util.List;

import Pojo.Summary;

public interface SummaryDao {

	void createTable();

	void save(Summary s);

	void update(Summary s);

	Summary getSummaryByProductCode(String code);

	List<Summary> getList();

}
