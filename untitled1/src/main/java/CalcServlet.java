import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-03-30
 * Time: 20:31
 */
public class CalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//设置编码和返回值类型
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        String num1 = request.getParameter("number1");
        String num2 = request.getParameter("number2");

        int total = Integer.parseInt(num1)+Integer.parseInt(num2);

        PrintWriter writer = response.getWriter();
        writer.println(String.format("<h1>结果为：%d</h1>",total));//包含所有字符串
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);


    }
}
