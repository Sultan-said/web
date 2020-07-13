import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class HandleGuess extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        //Get the number of customer guesses submitted
        int guessNumber=Integer.parseInt(request.getParameter("guessnumber"));
        //Get the client's session object
        HttpSession session=request.getSession();
        Integer integer=(Integer)session.getAttribute("saveNumber");
        int realNumber=integer.intValue();
        System.out.println(realNumber);
        System.out.println(guessNumber);
        if(guessNumber>realNumber){
            session.setAttribute ("message", "guess big");
            System.out.println ("you guessed big -- no");
            response.sendRedirect("inputNumber.jsp");
        }
        else if(guessNumber<realNumber){
            session.setAttribute ("message", "guess small");
            System.out.println ("you guessed it small -- - no");
            response.sendRedirect("inputNumber.jsp");
        }
        else{
            session.setAttribute ("message", "you guessed it right");
            System.out.println ("you guessed it right");
            response.sendRedirect("inputNumber.jsp");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
