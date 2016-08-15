import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/")
public class HelloServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PushBuilder pushBuilder = request.newPushBuilder();
        if (pushBuilder != null)
        {
            System.out.println("push");
            pushBuilder.path("main.css").push();
        }

        System.out.println("Hello Servlet");

        response.getOutputStream().println("Hello Servlet");
    }
}
