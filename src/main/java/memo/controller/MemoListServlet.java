package memo.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import memo.dto.MemoDto;
import memo.service.MemoService;

public class MemoListServlet  extends HttpServlet{
	
	private final MemoService memoService = new MemoService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		  System.out.println("===== MemoListServlet doGet 진입 =====");

		try {
			List<MemoDto> memoList = memoService.getMemoList();
			
			request.setAttribute("memoList", memoList);
			request.getRequestDispatcher("/WEB-INF/memo/views/list.jsp").forward(request, response);
		}catch(SQLException e){
			throw new ServletException(e);
		}
	}

}
