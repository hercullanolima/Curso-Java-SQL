package filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import connection.SingleConnectionBanco;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/principal/ServletLogin", "/ServeletLogin"})/*Intercepta todas as requisições que vierem do projeto ou mapeamento*/
public class FilterAutenticacao implements Filter {
	
	/*Declaradno informações de conexão com banco*/
private static Connection connection;
	
	
       
  public FilterAutenticacao() {
            
    }

   /*Encerra os processo quando o servidor é parado*/
  /*Mataria os processos de conexão com p banco*/
	public void destroy() {
		   try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
		
	}

	/*intercepta as requisições e as respostas no sistema*/
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
			try {
				HttpServletRequest req = (HttpServletRequest) request;
				HttpSession session = req.getSession();
				
				String usuarioLogado = (String) session.getAttribute("usuario");
				
				String urlParaAutenticar = req.getServletPath();/*Url que está sendo acessada*/
				
				/*Validaar se está logado, senão redireionar para a tela de login*/
				
				if(usuarioLogado == null && !urlParaAutenticar.equalsIgnoreCase("/principal/ServletLogin")) { /*Não está logado*/
					
					
					RequestDispatcher redireciona = request.getRequestDispatcher("/index.jsp?url=" + urlParaAutenticar);
					request.setAttribute("msg", "Por favor, realizar o login!");
					redireciona.forward(request, response);
					return; /*Para a execução e redireciona para login*/
					
				}else {
					
					chain.doFilter(request, response);
				}
				
				connection.commit();/*Deu tudo certo, então comita as alterações no banco de dados*/
				
			}catch (Exception e) {
				e.printStackTrace();
				try {
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		
	}

	/*incia os processo ou recursosquando o servidor sobe o projeto*/
	public void init(FilterConfig fConfig) throws ServletException {
		connection = SingleConnectionBanco.getConnection();
		
	
	}

}
