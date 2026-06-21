package memo.service;

import java.sql.SQLException;
import java.util.List;

import memo.dao.MemoDao;
import memo.dto.MemoDto;

public class MemoService {
	private final MemoDao memoDao = new MemoDao();
	
	public List<MemoDto> getMemoList() throws SQLException{
		return memoDao.selectAll();
	}
}
