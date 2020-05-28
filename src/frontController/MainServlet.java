package frontController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TodoDAO;
import dto.TodoDTO;

@WebServlet("/")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TodoDAO todoDao = new TodoDAO();
		ArrayList<TodoDTO> todos = todoDao.getTodos();
		ArrayList<TodoDTO> doings = todoDao.getDoings();
		ArrayList<TodoDTO> dones = todoDao.getDones();
		
		
		request.setAttribute("todos", todos);
		request.setAttribute("doings", doings);
		request.setAttribute("dones",  dones);
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/main.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
