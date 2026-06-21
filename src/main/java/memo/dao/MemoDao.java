package memo.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import memo.dto.MemoDto;
import memo.util.DBUtil;

public class MemoDao {
	public List<MemoDto> selectAll() throws SQLException {
		System.out.println("DAO에서 DB 연결 요청");

		List<MemoDto> memoList = new ArrayList<>();
		
		String sql = """
				SELECT memo_id, title, content, reg_dt, mod_dt
				FROM memos
				ORDER BY memo_id DESC
				""";
	    // 여기서 DBUtil로 Connection 얻기
		try(	
				Connection con = DBUtil.getConnection();
				// PreparedStatement 만들기
				PreparedStatement pstmt = con.prepareStatement(sql);
				// ResultSet 돌리기
				ResultSet rs = pstmt.executeQuery();
				
			){
			System.out.println("연결된 DB: " + con.getCatalog());
		    System.out.println("실행 SQL: " + sql);
			
			while(rs.next()){
				// MemoDto에 담기
				MemoDto memo = new MemoDto();
			// memoList에 add
				memo.setMemoId(rs.getLong("memo_id"));
				memo.setTitle(rs.getString("title"));
				memo.setContent(rs.getString("content"));
				memo.setRegDt(rs.getString("reg_dt"));
				memo.setModDt(rs.getString("mod_dt"));
				
				memoList.add(memo);
			}
		}	
		return memoList;
	}
//	public void insert(MemoDto memo) {
//		
//		String sql = "INSERT INTO memos (title, content) VALUES(?,?)";
//		try(	
//				Connection con = DBUtil.getConnection();
//				PreparedStatement pstmt = con.prepareStatement(sql);
//				ResultSet rs = pstmt.executeQuery();
//			){
//			pstmt.setString(1, memo.getTitle());
//			pstmt.setString(2, memo.getContent());
//			
//			
//		}	
//	    // executeUpdate()
//	}
}
